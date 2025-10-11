package org.devanshu.code.Practice.CriticalPointMinAndMaxDistance;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;

class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class CriticalNodeDistance {
    Node head;

    // Add Node at the end
    public void append(int data){
        Node newNode = new Node(data);

        // EDGE CASE
        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Check if a node is critical point or not
    public boolean isCriticalPoint(Node node){
        if (node == null || node.prev == null || node.next == null){
            return false;
        }

        if (node.data > node.prev.data && node.data > node.next.data){
            return true;
        }

        if (node.data < node.prev.data && node.data < node.next.data){
            return true;
        }

        return false;
    }

    // Find distance between max and min critical points
    public int[] nodeBetweenCriticalPoints(){
        // EDGE CASE
        if (head == null || head.next == null || head.next.next == null){
            return new int[]{-1 , -1};
        }

        ArrayList<Integer> criticalPositions = new ArrayList<>();
        Node current = head.next;
        int position = 1;

        while (current != null && current.next != null){
            if (isCriticalPoint(current)){
                criticalPositions.add(position);
            }

            current = current.next;
            position++;
        }

        // Need atleast two critical points

    }
}
