package in.devanshu.code.create_linked_list;


import in.devanshu.code.traversal_in_a_linkedlist.TraversalLinkedList;

public class BasicLinkedList {

    public static class Node{
        int data; // Value of the current node stored.
        Node next; // Stores the address of the next node.

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        Node f = new Node(9);



        // Connecting all the nodes and inserting a value into linkedlist
        a.next = b; // 1 -> 2  3  4  5
        b.next = f;// 1 -> 2 -> 3  4  5
        f.next = c;
        c.next = d; // 1 -> 2 -> 3 -> 4  5
        d.next = e; // 1 -> 2 -> 3 -> 4 -> 5


        System.out.print("Value of Node a : " + a.data);
        System.out.println();
        System.out.print("Address of Node a : " + a.next);

    }
}
