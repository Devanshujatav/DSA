package org.devanshu.Implementation.LinkedListStack;

class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
}

public class Stack<T> {
    private Node<T> top;
    private int size;

    public Stack(){
        this.top = null;
        this.size = 0;
    }

    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println(data + " pushed into Stack");
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }

        T poppedData = top.data;
        top = top.next;
        size--;

        return poppedData;
    }

    public T peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return null;
        }

        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int size(){
        return size;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack (top to bottom): ");
        Node<T> current = top;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }

    public void clear(){
        top = null;
        size = 0;
        System.out.println("Stack Cleared");
    }
}
