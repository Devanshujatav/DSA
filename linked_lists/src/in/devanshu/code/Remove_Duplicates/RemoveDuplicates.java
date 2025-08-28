package in.devanshu.code.Remove_Duplicates;

import java.util.HashSet;

class Node{
    int data;
    Node next;

    public Node(){
        this.next=null;
    }

    public Node(int data){
        this.data = data;
    }

    // Display the linked list
    public void display(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

}

public class RemoveDuplicates {


//    APPROCH 1
//    private static Node removeDuplicates(Node head){
//        // EDGE CASE
//        if (head == null || head.next == null){
//            return head;
//        }
//
//        Node current = head;
//
//        while (current!=null && current.next != null){
//            if (current.data == current.next.data){
//                current.next = current.next.next;
//            }else {
//                current = current.next;
//            }
//        }
//
//        return head;
//    }

    // Approch 2
//    Time Complexity: O(n)
//    Space Complexity: O(n)
//    private static Node removeDuplicates(Node head){
//        // Edge Case
//        if (head == null || head.next == null){
//            return head;
//        }
//
//        HashSet<Integer> seen = new HashSet<>();
//        Node current = head;
//        Node prev = null;
//
//        while (current!=null){
//            if (seen.contains(current.data)){
//                prev.next = current.next;
//            }else {
//                seen.add(current.data);
//                prev = current;
//            }
//            current = current.next;
//        }
//        return head;
//    }

    // Approch 3
    private static Node removeDuplicates(Node head){
        // Edge Cases
        if (head == null || head.next == null){
            return head;
        }

        Node current = head;
        while (current!=null){
            Node runner = current;
            while (runner.next != null){
                if (runner.next.data == current.data){
                    runner.next = runner.next.next;
                }else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return head;
    }


    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(30);
        Node e = new Node(10);
        Node f = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node and = removeDuplicates(a);
        Node ll = new Node();
        ll.display(and);
    }
}
