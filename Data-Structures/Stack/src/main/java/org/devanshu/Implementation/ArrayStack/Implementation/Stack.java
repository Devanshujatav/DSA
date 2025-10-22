package org.devanshu.Implementation.ArrayStack.Implementation;

public class Stack {
    private int[] arr;
    private int capacity;
    private int top;

    // Constructor to initialize stack
    public Stack(int size){
        this.arr = new int[size];
        this.capacity = size;
        this.top = -1;
    }

    // Push element onto stack
    public void push(int x){
        if (isFull()){
            System.out.println("Stack Overflow!!! Cannot push");
            return;
        }

        arr[++top] = x;
        System.out.println(x + " pushed to Stack");
    }

    // Pop element from stack
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow!!! Cannnot pop");
            return -1;
        }

        return arr[top--];
    }

    // Peek top element
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Check if stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    // Check if stack is full
    public boolean isFull(){
        return top == capacity-1;
    }

    // Get size of stack
    public int size(){
        return top+1;
    }

    // Display stack elements
    public void display(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Stack Elements : ");
        for (int i=0 ; i<capacity ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
