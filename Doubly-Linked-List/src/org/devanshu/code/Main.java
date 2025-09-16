package org.devanshu.code;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        DoublyLinkedList.Node a = new DoublyLinkedList.Node(4);
        DoublyLinkedList.Node b = new DoublyLinkedList.Node(10);
        DoublyLinkedList.Node c = new DoublyLinkedList.Node(14);
        DoublyLinkedList.Node d = new DoublyLinkedList.Node(42);
        DoublyLinkedList.Node e = new DoublyLinkedList.Node(24);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
//        dll.display

//        DoublyLinkedList.display(a);
//        System.out.println();
//        DoublyLinkedList.displayReverse(e);
        DoublyLinkedList.display2(c);
    }
}