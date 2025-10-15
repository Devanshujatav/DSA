package org.devanshu.code.Practice.TwoSum;



import org.devanshu.code.Implementation.DoublyLinkedList;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Pair{
    int first;
    int second;

    public Pair(int first , int second){
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

public class TwoSum {

    // Display the doubly linked list
    public static void displayList(Node head) {
        System.out.print("List: ");
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

    // Method 1: Find if pair exists with given sum (returns boolean)
    public static boolean hasTwoSum(Node head , int target){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        Node tail = temp;
        Node hPointer = head;
        Node tPointer = tail;

        while (hPointer.data < tPointer.data) {
            if ((hPointer.data + tPointer.data) == target) {
                System.out.println(hPointer.data);
                System.out.println(tPointer.data);
                return true;
            } else if ((hPointer.data + tPointer.data) > target) {
                tPointer = tPointer.prev;
            } else {
                hPointer = hPointer.next;
            }
        }

        return false;
    }

    // Method 2: Find the pair that sums to target (returns Pair object)
    public static Pair findTwoSum(Node head , int target){
        // EDGE CASE
        if (head == null || head.next == null){
            return null;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        Node tail = temp;

        Node leftPointer = head;
        Node rightPointer = tail;

        while (leftPointer != rightPointer && leftPointer.prev != rightPointer){
            int sum = leftPointer.data + rightPointer.data;

            if (sum == target){
                return new Pair(leftPointer.data, rightPointer.data);
            } else if (sum < target) {
                leftPointer = leftPointer.next;
            }else {
                rightPointer = rightPointer.next;
            }
        }

        return null;
    }

    // Method 3: Find all pairs that sum to target
    public static void findAllTwoSumPairs(Node head , int target){

        // EDGE CASE
        if (head == null || head.next == null){
            System.out.println("NO PAIRS FOUND");
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        Node tail = temp;

        Node leftPointer = head;
        Node rightPointer = tail;
        boolean found = false;

        while (leftPointer != rightPointer  && leftPointer.prev != rightPointer){
            int sum = leftPointer.data + rightPointer.data;

            if (sum == target){
                System.out.println("  " + leftPointer.data + " + " + rightPointer.data + " = " + target);
                found = true;
                leftPointer = leftPointer.next;
                rightPointer = rightPointer.prev;
            } else if (sum < target) {
                leftPointer = leftPointer.next;
            }else {
                rightPointer = rightPointer.prev;
            }
        }

        if (!found){
            System.out.println("  No pairs found");
        }
    }
}
