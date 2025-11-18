package org.devanshu.Programs.Sliding_Window_Maximum;

import static org.devanshu.Programs.Sliding_Window_Maximum.SlidingWindowMaximum.*;

public class Main {
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("=== Sliding Window Maximum using Stack ===\n");

        // Example 1
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        System.out.println("Example 1:");
        System.out.print("Input: nums = ");
        printArray(nums1);
        System.out.println("k = " + k1);
        System.out.print("Output (Method 1): ");
        printArray(maxSlidingWindow(nums1, k1));
        System.out.print("Output (Method 2 - Two Stacks): ");
        printArray(maxSlidingWindowTwoStacks(nums1, k1));
        System.out.print("Output (Method 3 - Aux Stack): ");
        printArray(maxSlidingWindowAuxStack(nums1, k1));
        System.out.println("Expected: [3, 3, 5, 5, 6, 7]\n");

        // Example 2
        int[] nums2 = {1};
        int k2 = 1;
        System.out.println("Example 2:");
        System.out.print("Input: nums = ");
        printArray(nums2);
        System.out.println("k = " + k2);
        System.out.print("Output: ");
        printArray(maxSlidingWindow(nums2, k2));
        System.out.println("Expected: [1]\n");

        // Example 3
        int[] nums3 = {1, -1};
        int k3 = 1;
        System.out.println("Example 3:");
        System.out.print("Input: nums = ");
        printArray(nums3);
        System.out.println("k = " + k3);
        System.out.print("Output: ");
        printArray(maxSlidingWindow(nums3, k3));
        System.out.println("Expected: [1, -1]\n");

        // Example 4
        int[] nums4 = {9, 11};
        int k4 = 2;
        System.out.println("Example 4:");
        System.out.print("Input: nums = ");
        printArray(nums4);
        System.out.println("k = " + k4);
        System.out.print("Output: ");
        printArray(maxSlidingWindow(nums4, k4));
        System.out.println("Expected: [11]\n");

        // Example 5: Descending order
        int[] nums5 = {7, 6, 5, 4, 3, 2, 1};
        int k5 = 3;
        System.out.println("Example 5:");
        System.out.print("Input: nums = ");
        printArray(nums5);
        System.out.println("k = " + k5);
        System.out.print("Output: ");
        printArray(maxSlidingWindow(nums5, k5));
        System.out.println("Expected: [7, 6, 5, 4, 3]\n");

        // Example 6: Ascending order
        int[] nums6 = {1, 2, 3, 4, 5, 6, 7};
        int k6 = 3;
        System.out.println("Example 6:");
        System.out.print("Input: nums = ");
        printArray(nums6);
        System.out.println("k = " + k6);
        System.out.print("Output: ");
        printArray(maxSlidingWindow(nums6, k6));
        System.out.println("Expected: [3, 4, 5, 6, 7]\n");
    }
}
