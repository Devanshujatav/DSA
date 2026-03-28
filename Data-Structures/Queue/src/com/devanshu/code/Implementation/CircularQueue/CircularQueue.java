package com.devanshu.code.Implementation.CircularQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// ─────────────────────────────────────────────
// Custom Exceptions
// ─────────────────────────────────────────────
class QueueOverflowException extends Exception{
    public QueueOverflowException(String message) {
        super(message);
    }
}

class QueueUnderflowException extends Exception{
    public QueueUnderflowException(String message) {
        super(message);
    }
}

// ─────────────────────────────────────────────
// Thread-Safe Circular Queue
// ─────────────────────────────────────────────
public class CircularQueue<T> {
    private final Object[] data;
    private final int capacity;
    private int front;
    private int rear;
    private int size;

    private final ReentrantLock lock =  new ReentrantLock(true);
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();

    public CircularQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0, got: " + capacity);
        }
        this.capacity = capacity;
        this.data = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // ── Non-blocking enqueue ─────────────────

    /**
     * Adds an element. Throws QueueOverflowException if full.
     */

    public void enqueue (T item) throws QueueOverflowException {
        if (item == null) {
            throw new IllegalArgumentException("Null items not allowed");
        }

        lock.lock();

        try {
            if (isFull()) {
                throw new QueueOverflowException("Queue is full (capacity=" + capacity + "). Cannot enqueue: " + item);
            }
            rear = (rear + 1) % capacity;
            data[rear] = item;
            size++;

            System.out.printf("[%-12s] ENQUEUED  %-5s | size=%d  front=%d  rear=%d%n",
                    Thread.currentThread().getName(), item, size, front, rear);

            notEmpty.signalAll();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Blocking enqueue – waits until space is available.
     */
    public void enqueueBlocking(T item) throws InterruptedException{
        if (item == null) {
            throw new IllegalArgumentException("Null items not allowed");
        }
        lock.lock();
        try {
            while (isFull()){
                System.out.printf("[%-12s] WAITING to enqueue %s (queue full)%n",
                        Thread.currentThread().getName(), item);
                notFull.await();
            }
            rear = (rear + 1) % capacity;
            data[rear] = item;
            size++;
            System.out.printf("[%-12s] ENQUEUED  %-5s | size=%d  front=%d  rear=%d%n",
                    Thread.currentThread().getName(), item, size, front, rear);
            notEmpty.signalAll();
        }finally {
            lock.unlock();
        }
    }

    // ── Non-blocking dequeue ─────────────────

    /**
     * Removes and returns the front element. Throws QueueUnderflowException if empty.
     */
    public T dequeue() throws QueueUnderflowException {
        lock.lock();
        try {
            if (isEmpty()){
                throw new QueueUnderflowException("Queue is empty. Cannot dequeue.");
            }
            T item = (T) data[front];
            data[front] = null;
            front = (front + 1) % capacity;
            size--;
            System.out.printf("[%-12s] DEQUEUED  %-5s | size=%d  front=%d  rear=%d%n",
                    Thread.currentThread().getName(), item, size, front, rear);
            notFull.signalAll();
            return item;
        }finally {
            lock.unlock();
        }
    }

    /**
     * Blocking dequeue – waits until an element is available.
     */
    public T dequeueBlocking(T item) throws InterruptedException{
        lock.lock();
        try {
            while (isEmpty()){
                System.out.printf("[%-12s] WAITING to dequeue (queue empty)%n",
                        Thread.currentThread().getName());
                notEmpty.await();
            }
            T item = (T) data[front];
            data[front] = null;
            front = (front + 1) % capacity;
            System.out.printf("[%-12s] DEQUEUED  %-5s | size=%d  front=%d  rear=%d%n",
                    Thread.currentThread().getName(), item, size, front, rear);
            size--;
            notFull.signalAll();
            return item;
        }finally {
            lock.unlock();
        }
    }

    // ── Peek ─────────────────────────────────
    @SuppressWarnings("unchecked")
    public T peek() throws QueueUnderflowException {
        lock.lock();
        try{
            if (isEmpty()){
                throw new QueueUnderflowException("Queue is empty. Cannot peek.");
            }
            return (T) data[front];
        }finally {
            lock.unlock();
        }
    }

    // ── State queries ─────────────────────────
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    @Override
    public String toString() {
        lock.lock();
        try {
            if (isEmpty()){
                return "CircularQueue[]";
            }
            StringBuilder sb = new StringBuilder("CircularQueue[");
            for (int i = 0; i < size; i++) {
                sb.append(data[(front + i) % capacity]);
                if (i<size-1){
                    sb.append(", ");
                }
            }
            sb.append("] (front = ").append(front).append(", rear = ").append(rear).append(", Size = ").append(size).append(")\n");
            return sb.toString();
        }finally {
            lock.unlock();
        }
    }


}
