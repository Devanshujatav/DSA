package org.devanshu.code;


public class DoublyLinkedList {

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

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }


    public static void displayReverse(Node tail){
        Node temp = tail;
        while (temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

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

    public static Node insertAtHead(Node head , int x){
        Node k = new Node(x);
        k.next = head;
        head.prev = k;
        head = k;
        return head;
    }

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
}
