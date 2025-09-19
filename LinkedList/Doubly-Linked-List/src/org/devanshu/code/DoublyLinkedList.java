package org.devanshu.code;


public class DoublyLinkedList {

    // Creation of a Node
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


    // Display the doubly linked list
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    // Display Doubly Linked List in `reverse`
    public static void displayReverse(Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Display Doubly Linked List
    public static void display2(Node random){
        Node temp = random;
        while (temp.prev!=null){
            temp = temp.prev;
        }

        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    // Insertion at Head
    public static Node insertAtHead(Node head , int x){
        Node k = new Node(x);
        k.next = head;
        head.prev = k;
        head = k;
        return head;
    }


    // Insertion at Tail
    public static void insertAtTail(Node head , int x){
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        Node newTail = new Node(x);
        temp.next = newTail;
        newTail.prev = temp;
    }

    // insertAt : add any node at the given index
    public static void insertAtOne(Node head , int index , int x){
        Node temp = head;
        Node newNode = new Node(x);
        for (int i=1 ; i<index ; i++){
            temp = temp.next;
        }

        temp.next.prev = newNode;
        newNode.next = temp;
        newNode.next = temp.next;
        temp.next = newNode;
    }


    // Insertion of any node
    public static void insertAt(Node head , int index , int x){
        Node s = head;
        for (int i=0 ; i<index-1 ; i++){
            s = s.next;
        }

        // s is at index-1 position
        Node r = s.next;
        Node newNode = new Node(18);
        s.next = newNode;
        newNode.prev = s;
        newNode.next = r;
        r.prev = newNode;
    }


    // Deletion of Head Node
    public static void deleteHead(Node head){
        head = head.next;
        head.prev = null;
    }


    // Deletion of Tail Node when head is given
    public static void deleteTail(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }

        temp = temp.prev;
        temp.next = null;
    }

    // Deletion of Node When the Tail Node is given
    public static void deleteTain(Node tail){
        tail = tail.prev;
        tail.next = null;
    }

    // Deletion of any Node
    public static void deleteAt(Node head , int index){
        Node temp = head;
        for (int i=0 ; i<index ; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        temp.next.next = temp;
    }
}
