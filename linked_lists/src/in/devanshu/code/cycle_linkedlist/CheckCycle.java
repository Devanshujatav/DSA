package in.devanshu.code.cycle_linkedlist;

class Node{
    int data;
    Node next;

    public Node(){
        // Default Constructor
    }

    public Node(int data){
        this.data = data;
    }
}


public class CheckCycle {

    private static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null){
            if(slow.next == null){
                return false;
            }
            slow = slow.next;

            if(fast.next == null){
                return false;
            }
            fast = fast.next.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
//        f.next = c;

        System.out.println("Has Cycle : " + hasCycle(a));

    }
}

/**
 *Leetcode Solution
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//
//
//        if(head == null){
//            return null;
//        }
//
//        if(head.next == null){
//            return null;
//        }
//
//        while (fast!=null){
//
//            if(slow.next == null){
//                return null;
//            }
//            slow = slow.next;
//
//            if(fast.next == null || fast.next.next == null){
//                return null;
//            }
//            fast = fast.next.next;
//
//            if (fast == slow){
//                break;
//            }
//        }
//
//        ListNode temp = head;
//
//        // int count=0;
//
//        while (temp != slow) {
//            // count++;
//            slow = slow.next;
//            temp = temp.next;
//        }
//
//        return slow;
//    }
//}