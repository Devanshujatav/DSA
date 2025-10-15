package org.devanshu;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Test insertions
        System.out.println("Inserting elements:");
        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtBeginning(5);
        cll.display();

        System.out.println("Size: " + cll.getSize());


        // Test search
        System.out.println("Searching for 20: " + cll.search(20));
        System.out.println("Searching for 100: " + cll.search(100));

        // Test deletion
        System.out.println("\nDeleting 20:");
        cll.deleteNode(20);
        cll.display();

        System.out.println("Deleting 5 (head):");
        cll.deleteNode(5);
        cll.display();

        System.out.println("Final size: " + cll.getSize());

    }
}