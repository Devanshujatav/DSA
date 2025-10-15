package com.devanshu.code.FindUnique;

import static com.devanshu.code.FindUnique.FindSingleElement.findSingleElementXOR;

public class Main {
    // Test method
    public static void main(String[] args) {
        // Test cases
        int[] test1 = {2, 3, 5, 4, 5, 3, 4}; // Expected: 2
        int[] test2 = {4, 1, 2, 1, 2}; // Expected: 4
        int[] test3 = {1}; // Expected: 1
        int[] test4 = {7, 3, 5, 4, 5, 3, 4, 8, 8}; // Expected: 7

        System.out.println("=== Find Single Element Program ===\n");

        // Test with XOR approach
        System.out.println("Using XOR Approach:");
        System.out.println("Array [2, 3, 5, 4, 5, 3, 4] -> Single element: " +
                findSingleElementXOR(test1));
        System.out.println("Array [4, 1, 2, 1, 2] -> Single element: " +
                findSingleElementXOR(test2));
        System.out.println("Array [1] -> Single element: " +
                findSingleElementXOR(test3));
        System.out.println("Array [7, 3, 5, 4, 5, 3, 4, 8, 8] -> Single element: " +
                findSingleElementXOR(test4));


        // Performance comparison for large array
        System.out.println("\n=== Performance Analysis ===");
        int[] largeArray = generateTestArray(1000001); // 1 million elements

        long startTime = System.nanoTime();
        int resultXOR = findSingleElementXOR(largeArray);
        long endTime = System.nanoTime();
        System.out.println("XOR Approach - Result: " + resultXOR +
                ", Time: " + (endTime - startTime) / 1000000.0 + " ms");

    }

    // Helper method to generate test array
    private static int[] generateTestArray(int size) {
        int[] arr = new int[size];
        // Fill with pairs
        for (int i = 0; i < size - 1; i += 2) {
            arr[i] = i / 2;
            arr[i + 1] = i / 2;
        }
        // Last element appears once
        arr[size - 1] = 999999;
        return arr;
    }
}
