package in.devanshu.code.linkedlist;

import in.devanshu.code.traversal_in_a_linkedlist.TraversalLinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void add(int val){
        Node temp = new Node(val);
        if (head == null){
            head = temp;
        }else {
            tail.next = temp;
        }
        tail = temp;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    int length(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    void displayThroughRecursion(Node head){

        Node temp = head;

        // Base Case
        if (temp == null){
            return;
        }

        // Seif Work
        System.out.print(temp.data + " ");

        // Recursive Work
        displayThroughRecursion(temp.next);
    }

    void reverseDisplayInRecursion(Node head){

        Node temp = head;

        // Base Case
        if (temp == null){
            return;
        }

        // Recursive Work
        reverseDisplayInRecursion(temp.next);

        // Self Work
        System.out.println(temp.data + " ");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);

        System.out.println("Number of elements of the linked list : " + ll.length());

        System.out.print("The elements of the linked list : ");
        ll.display();


    }
}
