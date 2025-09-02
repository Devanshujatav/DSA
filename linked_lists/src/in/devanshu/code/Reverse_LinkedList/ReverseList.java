package in.devanshu.code.Reverse_LinkedList;

import java.sql.SQLOutput;

public class ReverseList {
    public static class Node{
        int data;
        Node next;

        public Node(){
            // Default Constructor
        }

        public Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        // Base Case
        if (head == null) {
            return;
        }

        // Self Work
        System.out.print(head.data + " ");

        // Recursive Work
        display(head.next);
    }

    // Reverse LinkedList through Recursion
    public static void displayReverse(Node head){
        // Base Case
        if (head == null) {
            return;
        }

        // Recursive Work
        displayReverse(head.next);

        // Self Work
        System.out.print(head.data + " ");
    }


    public static Node reverseList(Node head){
        // Base Case
        if (head.next == null){
            return head;
        }

        // Recursive Work
        Node newHead = reverseList(head.next);

        // Self Work
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(2);
        Node c = new Node(23);
        Node d = new Node(42);
        Node e = new Node(32);
        Node f = new Node(22);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        System.out.println("Display Origional List : ");
        display(a);

        System.out.println();
        System.out.println("Display Reversed List : ");

//        displayReverse(a);
        Node reversedList = reverseList(a);
        display(reversedList);
    }

}
