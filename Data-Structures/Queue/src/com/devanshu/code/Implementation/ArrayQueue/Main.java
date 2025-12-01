package com.devanshu.code.Implementation.ArrayQueue;

public class Main {
    public static void main(String[] args) {
        // Example with Integer
        ArrayQueue<Integer> intQueue = new ArrayQueue<>(5);

        System.out.println("=== Integer Queue Demo ===");
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.display();

        System.out.println("Peek: " + intQueue.peek());
        System.out.println("Dequeue: " + intQueue.dequeue());
        intQueue.display();

        intQueue.enqueue(40);
        intQueue.enqueue(50);
        System.out.println("Size: " + intQueue.size());
        intQueue.display();

        // Example with String
        System.out.println("\n=== String Queue Demo ===");
        ArrayQueue<String> strQueue = new ArrayQueue<>(4);

        strQueue.enqueue("Alice");
        strQueue.enqueue("Bob");
        strQueue.enqueue("Charlie");
        strQueue.display();

        System.out.println("Contains 'Bob': " + strQueue.contains("Bob"));
        System.out.println("Dequeue: " + strQueue.dequeue());
        strQueue.enqueue("David");
        strQueue.display();

        System.out.println("Is full: " + strQueue.isFull());
        System.out.println("Is empty: " + strQueue.isEmpty());
    }
}
