package org.devanshu.code.Implementation;


import static org.devanshu.code.Implementation.DoublyLinkedList.*;

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
//        DoublyLinkedList.display2(c);

        //FIX-1 : If you are calling a static function from another class into a class reference variable
        // This should be the syntax
//        DoublyLinkedList.Node newHead = insertAtHead(a, 23);

//        insertAtTail(a , 89);
        System.out.print("Origional List : ");
        DoublyLinkedList.display(a);


        System.out.println();


        System.out.print("New List : ");
        insertAt(a , 3 , 15);
        DoublyLinkedList.display(a);



    }
}