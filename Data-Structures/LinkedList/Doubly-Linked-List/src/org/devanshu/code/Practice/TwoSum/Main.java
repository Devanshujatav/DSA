package org.devanshu.code.Practice.TwoSum;

import static org.devanshu.code.Practice.TwoSum.TwoSum.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== EXAMPLE 1: SORTED LIST ===");

        // Create sorted doubly linked list: 1 ⇄ 2 ⇄ 4 ⇄ 5 ⇄ 6 ⇄ 8 ⇄ 9
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(8);
        Node g = new Node(9);

        // Link forward
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; f.next = g;

        // Link backward
        b.prev = a; c.prev = b; d.prev = c; e.prev = d; f.prev = e; g.prev = f;

        displayList(a);

        int target1 = 10;
        System.out.println("\nTarget: " + target1);

        boolean exists = hasTwoSum(a, target1);
        System.out.println("Pair exists? " + (exists ? "✅ YES" : "❌ NO"));

        Pair pair1 = findTwoSum(a, target1);
        if (pair1 != null) {
            System.out.println("Found pair: " + pair1);
        }

        System.out.println();
        findAllTwoSumPairs(a, target1);

        // Test with different target
        System.out.println("\n" + "=".repeat(40));
        int target2 = 7;
        System.out.println("Target: " + target2);

        Pair pair2 = findTwoSum(a, target2);
        if (pair2 != null) {
            System.out.println("Found pair: " + pair2);
        } else {
            System.out.println("No pair found");
        }

        System.out.println();
        findAllTwoSumPairs(a, target2);

        System.out.println("\n=== EXAMPLE 2: ANOTHER LIST ===");

        // Create list: 3 ⇄ 5 ⇄ 7 ⇄ 11 ⇄ 13
        Node h = new Node(3);
        Node i = new Node(5);
        Node j = new Node(7);
        Node k = new Node(11);
        Node l = new Node(13);

        h.next = i; i.next = j; j.next = k; k.next = l;
        i.prev = h; j.prev = i; k.prev = j; l.prev = k;

        displayList(h);

        int target3 = 18;
        System.out.println("\nTarget: " + target3);

        Pair pair3 = findTwoSum(h, target3);
        if (pair3 != null) {
            System.out.println("Found pair: " + pair3 + " ✅");
        } else {
            System.out.println("No pair found ❌");
        }

        System.out.println();
        findAllTwoSumPairs(h, target3);

        System.out.println("\n=== ALGORITHM EXPLANATION ===");
        System.out.println("Two-pointer technique on sorted doubly linked list:");
        System.out.println("1. Start with left pointer at head, right pointer at tail");
        System.out.println("2. Calculate sum = left.data + right.data");
        System.out.println("3. If sum == target: Found! ✅");
        System.out.println("4. If sum < target: Move left forward (need larger value)");
        System.out.println("5. If sum > target: Move right backward (need smaller value)");
        System.out.println("6. Continue until pointers meet");
        System.out.println("\nTime Complexity: O(n)");
        System.out.println("Space Complexity: O(1)");
    }
}
