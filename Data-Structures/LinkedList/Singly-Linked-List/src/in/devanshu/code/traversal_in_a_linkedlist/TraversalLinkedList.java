package in.devanshu.code.traversal_in_a_linkedlist;

import java.util.LinkedList;

public class TraversalLinkedList {

    public static class Node{
        int data; // Value of the node
        Node next; // Address of the next node

        Node(int data){
            this.data = data;
        }
    }

    private static void display(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
//            System.out.print(o.data + " ");
            count++;
            head = head.next;
        }
        return count;
    }

    private static void displayInRecursion(Node head){
        // Base Case
        if (head == null){
            return;
        }

        // Seif Work
        System.out.print(head.data + " ");

        // Recursive Work
        displayInRecursion(head.next);
    }

    private static void reverseDisplayInRecursion(Node head){
        // Base Case
        if (head == null){
            return;
        }

        // Recursive Work
        reverseDisplayInRecursion(head.next);

        // Self Work
        System.out.println(head.data + " ");
    }



    public static void main(String[] args){
        Node a = new Node(3);
        Node b = new Node(6);
        Node c = new Node(5);
        Node d = new Node(2);
        Node e = new Node(9);

        // Connecting all the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Traversal in the linkedlist
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);


        System.out.println();
        // OR

        Node temp = a;
        for(int i=1 ; i<=5 ; i++){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
        // OR

        System.out.println("Normal display : ");
        display(a);

        System.out.println();

        System.out.println("Recursive Display : ");
        displayInRecursion(a);

        System.out.println();

        System.out.println("Length of the List : " + length(a));




    }
}
