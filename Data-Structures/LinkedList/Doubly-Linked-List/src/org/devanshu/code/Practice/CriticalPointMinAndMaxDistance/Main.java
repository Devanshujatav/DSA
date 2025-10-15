package org.devanshu.code.Practice.CriticalPointMinAndMaxDistance;

import org.devanshu.code.Implementation.DoublyLinkedList;


public class Main {



    public static void main(String[] args) {

        CriticalNodeDistance cnd = new CriticalNodeDistance();
        // Test Case 1
        System.out.println("Test Case 1:");
        cnd.append(3);
        cnd.append(1);
        cnd.append(2);
        cnd.append(5);
        cnd.append(1);
        cnd.append(2);
        cnd.display();

        int[] result1 = cnd.nodesBetweenCriticalPoints();
        System.out.println("Min Distance: " + result1[0] + ", Max Distance: " + result1[1]);
        System.out.println();

        // Test Case 2
        System.out.println("Test Case 2:");
        cnd.append(5);
        cnd.append(3);
        cnd.append(1);
        cnd.append(2);
        cnd.append(5);
        cnd.append(1);
        cnd.append(2);
        cnd.display();

        int[] result2 = cnd.nodesBetweenCriticalPoints();
        System.out.println("Min Distance: " + result2[0] + ", Max Distance: " + result2[1]);
        System.out.println();

        // Test Case 3 - Not enough critical points
        System.out.println("Test Case 3:");
        DoublyLinkedList dll3 = new DoublyLinkedList();
        cnd.append(1);
        cnd.append(2);
        cnd.append(3);
        cnd.append(4);
        cnd.display();

        int[] result3 = cnd.nodesBetweenCriticalPoints();
        System.out.println("Min Distance: " + result3[0] + ", Max Distance: " + result3[1]);
    }
}
