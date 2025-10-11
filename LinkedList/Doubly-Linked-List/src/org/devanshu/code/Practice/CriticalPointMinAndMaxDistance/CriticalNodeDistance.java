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
    public void append(int data) {
        Node newNode = new Node(data);

        // EDGE CASE
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Check if a node is critical point or not
    public boolean isCriticalPoint(Node node) {
        if (node == null || node.prev == null || node.next == null) {
            return false;
        }

        if (node.data > node.prev.data && node.data > node.next.data) {
            return true;
        }

        if (node.data < node.prev.data && node.data < node.next.data) {
            return true;
        }

        return false;
    }

    // Find distance between max and min critical points
    public int[] nodeBetweenCriticalPoints() {
        // EDGE CASE
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        ArrayList<Integer> criticalPositions = new ArrayList<>();
        Node current = head.next;
        int position = 1;

        while (current != null && current.next != null) {
            if (isCriticalPoint(current)) {
                criticalPositions.add(position);
            }

            current = current.next;
            position++;
        }

        // Need atleast two critical points
        if (criticalPositions.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDistance = Integer.MAX_VALUE;
        int maxDistance = criticalPositions.get(criticalPositions.size()-1) - criticalPositions.get(0);

        // Find critical distance between consecutive critical points
        for (int i=1 ; i<criticalPositions.size() ; i++){
            int distance = criticalPositions.get(i) - criticalPositions.get(i-1);
            minDistance = Math.min(minDistance , distance);
        }

        return new int[]{minDistance , maxDistance};
    }

    // Find distance between max and min critical points (OPTIMIZED WAY)
    public int[] nodesBetweenCriticalPoints(){

        // EDGE CASE
        if (head == null || head.next == null || head.next.next == null){
            return new int[]{-1 , -1};
        }

        int firstCritical = -1;
        int lastCritical = -1;
        int prevCritical = -1;

        int minDistance = Integer.MAX_VALUE;

        Node current = head.next;
        int position = 1;

        while (current!= null && current.next != null){
            if (isCriticalPoint(current)){
                if (firstCritical == -1){
                    firstCritical = position;
                }else {
                    minDistance = Math.min(minDistance , position-prevCritical);
                }
                prevCritical = position;
                lastCritical = position;
            }

            current = current.next;
            position++;
        }

        if (firstCritical == lastCritical || firstCritical == -1){
            return new int[]{-1 , -1};
        }

        int maxDistance = lastCritical - firstCritical;

        return new int[]{minDistance , maxDistance};
    }

    void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
