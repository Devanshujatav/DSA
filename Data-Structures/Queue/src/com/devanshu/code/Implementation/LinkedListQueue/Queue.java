package com.devanshu.code.Implementation.LinkedListQueue;

import java.util.NoSuchElementException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

class Queue<T>{
    private Node<T> front;
    private Node<T> rear;
    private int size;
    private int capacity;


    // Lock for thread safety
    private final Lock lock = new ReentrantLock();

    // Conditions for blocking behavior
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();

    // Constructor with capacity
    public Queue(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        this.capacity = capacity;
        this.front = null;
        this.rear = null;
        this.size = 0;
    }


    public boolean isEmpty(){
        lock.lock();
        try {
            return size==0;
        }finally {
            lock.unlock();
        }
    }


    // Enqueue (Producer)
    public void enqueue(T data) throws InterruptedException{
        if (data == null){
            throw new NullPointerException("Null values are not allowed");
        }

        lock.lock();

        try {
            while (size == capacity){
                notFull.await();
            }

            Node<T> newNode = new Node<>(data);

            if (isEmpty()){
                front = rear = newNode;
            }else {
                rear.next = newNode;
                rear = newNode;
            }

            size++;

            // Signal that queue is no longer empty
            notEmpty.signal();
        }finally {
            lock.unlock();
        }
    }

    // Dequeue (Consumer)
    public T dequeue() throws InterruptedException{
        lock.lock();

        try{
            while(isEmpty()){
                notEmpty.await();
            }

            T data = front.data;
            front = front.next;

            size--;

            // Wait one waiting producer
            notFull.signal();

            return data;
        }finally {
            lock.unlock();
        }
    }



    public T peek() {
        lock.lock();

        try{
            if (isEmpty()){
                throw new NoSuchElementException("Queue is empty");
            }

            return front.data;
        }finally {
            lock.unlock();
        }
    }

    public int size(){
        lock.lock();
        try{
            return size;
        }finally {
            lock.unlock();
        }
    }

    public void clear(){
        lock.lock();
        try{
            front = rear = null;
            size = 0;
            notFull.signalAll();
        }finally {
            lock.unlock();
        }
    }
}