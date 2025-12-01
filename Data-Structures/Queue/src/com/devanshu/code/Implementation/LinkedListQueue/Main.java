package com.devanshu.code.Implementation.LinkedListQueue;

public class Main {
    public static void main(String[] args) {
        // Integer Queue
        System.out.println("=== Integer Queue ===");
        Queue<Integer> intQueue = new Queue<>();

        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(30);
        intQueue.enqueue(40);

        System.out.println("Queue after enqueuing 10, 20, 30, 40:");
        intQueue.display();

        System.out.println("Front element: " + intQueue.peek());
        System.out.println("Queue size: " + intQueue.size());

        System.out.println("Dequeued: " + intQueue.dequeue());
        System.out.println("Queue after dequeue:");
        intQueue.display();

        System.out.println("Contains 30? " + intQueue.contains(30));
        System.out.println("Contains 10? " + intQueue.contains(10));

        // String Queue
        System.out.println("\n=== String Queue ===");
        Queue<String> strQueue = new Queue<>();

        strQueue.enqueue("Apple");
        strQueue.enqueue("Banana");
        strQueue.enqueue("Cherry");

        System.out.println("Queue after enqueuing fruits:");
        strQueue.display();

        System.out.println("Dequeued: " + strQueue.dequeue());
        strQueue.display();

        // Clear queue
        System.out.println("\nClearing integer queue...");
        intQueue.clear();
        System.out.println("Is empty? " + intQueue.isEmpty());
    }
}
