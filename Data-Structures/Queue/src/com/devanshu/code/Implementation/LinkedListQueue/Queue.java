package com.devanshu.code.Implementation.LinkedListQueue;


import java.util.NoSuchElementException;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    // Constructor
    public Queue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Enqueue: Add element to the rear of the queue
    public void enqueue(T data){
        Node<T> newNode = new Node<>(data);
        if (isEmpty()){
            front = rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue: Remove and return element from the front
    public T dequeue(){

        if (isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }

        T data = front.data;
        front = front.next;

        if (front == null){
            rear = null;
        }

        size--;
        return data;
    }

    public T peek(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is Empty");
        }
        return front.data;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public int size(){
        return size;
    }

    public void clear(){
        rear = front = null;
        size = 0;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is Empty!!!!");
            return;
        }

        Node<T> current = front;
        System.out.print("Front -> ");
        while (current != null){
            System.out.print(current.data + " -> ");
            current =current.next;
        }

        System.out.println("Rear");
    }

    public boolean contains(T data){
        Node<T> current = front;

        while (current != null){
            if (current.data == data){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray(){
        if (isEmpty()){
            return (T[]) new Object[0];
        }

        T[] array = (T[]) new Object[size];

        Node<T> current = front;
        int index = 0;

        while (current != null){
            array[index++] = current.data;
            current = current.next;
        }

        return array;
    }
}
