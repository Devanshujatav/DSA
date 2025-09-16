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


}
