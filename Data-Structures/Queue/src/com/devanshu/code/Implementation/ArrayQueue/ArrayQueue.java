package com.devanshu.code.Implementation.ArrayQueue;

public class ArrayQueue<T> {
    private T[] queue;
    private int rear;
    private int front;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity){
        this.capacity = capacity;
        this.queue = (T[]) new Object[capacity];
        this.rear = -1;
        this.front = 0;
        this.size = 0;
    }


    // Enqueue: Add element to rear
    public void enqueue(T element){
        if (isFull()){
            throw new IllegalStateException("Queue is Full");
        }

        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
    }

    // Dequeue: Remove and return front element
    public T dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        T element = queue[front];
        queue[front] = null;
        front = (front + 1) % capacity;
        size--;
        return element;
    }

    public T peek(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        return queue[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return capacity;
    }

    public void clear(){
        while(!isEmpty()){
            dequeue();
        }
    }


    public void display(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }

        System.out.print("Queue : [ ");
        for (int i=0 ; i<size ; i++){
            int index = (front + 1) % capacity;
            System.out.print(queue[index]);
            if (i < size-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public boolean contains(T element){
        for (int i=0 ; i<size ; i++){
            int index = (front + i) % capacity;
            if (queue[index].equals(element)){
                return true;
            }
        }
        return false;
    }
}
