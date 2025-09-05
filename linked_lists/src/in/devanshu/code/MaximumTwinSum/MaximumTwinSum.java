package in.devanshu.code.MaximumTwinSum;

import in.devanshu.code.CheckPalindrome.CheckPalindrome;
import in.devanshu.code.Reverse_LinkedList.ReverseList;

public class MaximumTwinSum {


    public static class Node{
        int data;
        Node next;

        public Node(){
            // Default Constructor
        }

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseList(Node head){
        Node curr = head;
        Node prev = null;
        Node nxt = null;

        if (head == null){
            return null;
        }

        while (curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }

    public static int maximumTwinSum(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverseList(slow.next);

        int maxSum = 0;
        Node head1 = head;
        Node head2 = slow.next;

        while (head2 != null){
            int sum = head1.data + head2.data;
            if (maxSum < sum){
                maxSum = sum;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(2);
        Node c = new Node(23);
        Node d = new Node(42);
        Node e = new Node(32);
        Node f = new Node(22);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        int ans = maximumTwinSum(a);

        System.out.println(ans);
    }
}
