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
}
