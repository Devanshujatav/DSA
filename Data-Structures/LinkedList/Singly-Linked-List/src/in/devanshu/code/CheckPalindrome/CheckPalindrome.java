package in.devanshu.code.CheckPalindrome;

import in.devanshu.code.Reverse_LinkedList.ReverseList;

public class CheckPalindrome {

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

    public static Node copyList(Node head){
        if(head == null){
            return null;
        }

        Node newHead = new Node(head.data);
        Node copyTemp = newHead;
        Node temp = head.next;

        while (temp!=null){
            copyTemp.next = new Node(temp.data);
            copyTemp = copyTemp.next;
            temp = temp.next;
        }

        return newHead;
    }

    public static Node reverseList(Node head){
        Node currPtr = head;
        Node prevPtr = null;
        Node nxtPtr = null;

        while (currPtr != null){
            nxtPtr = currPtr.next;
            currPtr.next = prevPtr;
            prevPtr = currPtr;
            currPtr = nxtPtr;
        }

        return prevPtr;
    }

    // Method 1
    public static boolean isPalindromeBruteForce(Node head){
        Node copyHead = copyList(head);

        Node temp = head;

        Node reverseList = reverseList(copyHead);

        Node reverseHead = reverseList;

        boolean flag = true;

        while (temp!=null){
            if (temp.data != reverseHead.data){
                flag = false;
            }

            temp = temp.next;
            reverseHead = reverseHead.next;
        }


        if (flag == true){
            return true;
        }

        return false;
    }

    public static boolean isPalindromeOptimized(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = reverseList(slow.next);
        slow.next = temp;

        Node p1 = head;
        Node p2 = slow.next;

        while (p2!=null){
            if (p1.data != p2.data){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        boolean isPalindromeTrue = isPalindromeOptimized(a);
        System.out.println(isPalindromeTrue);

    }
}
