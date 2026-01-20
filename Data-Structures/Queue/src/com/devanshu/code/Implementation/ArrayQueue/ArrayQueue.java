package com.devanshu.code.Implementation.ArrayQueue;

class ArrayQueue<T>{
    private T[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize queue
    @SuppressWarnings("unchecked")
    public ArrayQueue(int capacity){
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Checks the queue is full or not
    public boolean isFull(){
        return size == capacity;
    }

    // Add element to queue
    public void enqueue(T item){
        if (isFull()){
            System.out.println("Queue Overflow! Cannot enqueue " + item);
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Check if queue is empty
    public boolean isEmpty(){
        return size==0;
    }

    // Remove element from queue
    public T dequeue(){
        if (isEmpty()){
            System.out.println("Queue Underflow! Cannot dequeue");
            return null;
        }

        T item = arr[front];
        arr[front] = null; // Help garbage collection
        front = (front+1) % capacity;
        size--;
        return item;
    }

    // Get front element
    public T peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }

        return arr[front];
    }

    public int getSize(){
        return size;
    }

    public boolean contains(T element){
        // Empty queue cannot contain any element
        if (isEmpty()){
            return false;
        }

        // Traverse all elements in queue
        for (int i=0 ; i<size ; i++){
            // Calculate actual index using circular logic
            int index = (front + i) % capacity;

            // Handle null values safely
            if (arr[index] == null && element==null){
                return true; // Both are null, consider as match
            }

            // Compare using equals() for object comparison
            if (arr[index] != null && arr[index].equals(element)){
                return true;  // Element found
            }
        }

        // Element not found after checking all positions
        return false;

    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue Elements : ");
        for (int i=0 ; i<size ; i++){
            System.out.print(arr[(front+i) % capacity]+ " ");
        }
        System.out.println();
    }






}