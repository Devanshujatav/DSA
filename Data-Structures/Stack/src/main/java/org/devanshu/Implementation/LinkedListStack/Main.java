package org.devanshu.Implementation.LinkedListStack;

public class Main {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        System.out.println("=== Stack Operations Demo ===\n");

        // Push operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("\nStack size: " + stack.size());
        stack.display();

        // Peek operation
        System.out.println("\nTop element: " + stack.peek());

        // Pop operations
        System.out.println("\nPopping elements:");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.display();
        System.out.println("Stack size: " + stack.size());

        // Push more elements
        System.out.println("\nPushing more elements:");
        stack.push(60);
        stack.push(70);

        stack.display();

        // Test with String stack
        System.out.println("\n=== String Stack Demo ===\n");
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");

        stringStack.display();
        System.out.println("Popped: " + stringStack.pop());
        stringStack.display();
    }
}
