package org.devanshu;

class Node{
    int data;
    Node next;

    public Node(){
        super();
        // Default Constructor
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {

    private Node head;
    private int size;

    public CircularLinkedList(){
        this.head = null;
        this.size = 0;
    }

    // Insert at the beginning
    public Node insertAtBeginning(int data){


        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            newNode.next = newNode; // Point to itself
        }else {
            // Find the tail node
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
        size++;
        return head;
    }

    // Insert at the end
    public void insertAtEnd(int data){
        // EDGE CASE
        Node newNode = new Node(data);

        if (head==null){
            head = newNode;
            newNode.next = newNode;
        }else {
            Node current = head;
            while (current.next != head){
                current = current.next;
            }

            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    // Delete a node with given data
    public boolean deleteNode(int data){
        // EDGE CASE
        if (head == null){
            return false;
        }

        // IF ONLY ONE NODE
        if (head.next == head){
            if (head.data == data){
                head = null;
                size--;
                return true;
            }
            return false;
        }

        // IF HEAD NODE TO BE DELETED
        if (head.data == data){
            Node current = head;
            while (current.next != head){
                current = current.next;
            }
            current.next = head.next;
            head = head.next;
            size--;
            return true;
        }

        // SEARCH FOR THE NODE TO DELETE
        Node current = head;
        while (current.next != head){
            if (current.next.data == data){
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    // Display the circular linked list
    public void display(){
        // EDGE CASE
        if (head == null){
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        System.out.println("Circular Linked List : ");
        do {
            System.out.print(current.data + "->");
            current = current.next;
        } while (current != head);
        System.out.println("(back to "+ head.data + ")");
    }

    // Search for a value
//    public boolean search(int data){
//
//    }

}
