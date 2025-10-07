package org.devanshu.code.Practice.PalindromicLinkedList;

import org.devanshu.code.Implementation.DoublyLinkedList;

public class CheckPalindrome {

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

        // Method to display the doubly linked list
        public static void displayForward(Node head) {
            System.out.print("Forward: ");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) {
                    System.out.print(" ⇄ ");
                }
                temp = temp.next;
            }
            System.out.println();
        }

        // Method to display list in reverse
        public static void displayBackward(Node head) {
            if (head == null) return;

            // Go to tail
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }

            System.out.print("Backward: ");
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.prev != null) {
                    System.out.print(" ⇄ ");
                }
                temp = temp.prev;
            }
            System.out.println();
        }

        // Method to check the palindromic linked list
        public static boolean isPalindrome(Node head){
        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        Node tail = temp;

        // Pointers
        Node hPointer = head;
        Node tPointer = tail;

        while (hPointer != tPointer){
            if (hPointer.data != tPointer.data){
                return false;
            }

            hPointer = hPointer.next;
            tPointer = tPointer.prev;
        }
        return true;
    }
}
