package com.devanshu.code.ArrayContainsChecker;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayContainsChecker {

    // Method 1: Using a simple loop
    public static Boolean containsNumber(int[] arr , int target){
        for (int val : arr){
            if (val == target){
                return true;
            }
        }
        return false;
    }

    // Method 2: Using traditional for loop with index
    public static boolean containsNumberWithIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Method 3: Using Arrays.binarySearch() - requires sorted array
    public static boolean containsNumberBinarySearch(int[] arr , int target){
        int[] sortedArray = arr.clone();
        Arrays.sort(sortedArray);

        return Arrays.binarySearch(sortedArray , target) >=0;
    }

    // Method 4: Using Java 8 Streams
    public static boolean containsNumberStream(int[] arr , int target){
        return Arrays.stream(arr).anyMatch(num -> num==target);
    }

    // Method to find the index of the number (returns -1 if not found)
    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] numbers = {10, 25, 3, 47, 12, 99, 7, 33, 81, 5};

        System.out.println("Array contents: " + Arrays.toString(numbers));
        System.out.print("Enter a number to search for: ");
        int target = scanner.nextInt();

        // Test all methods
        System.out.println("\n--- Results ---");

        // Method 1: Enhanced for loop
        boolean found1 = containsNumber(numbers, target);
        System.out.println("Method 1 (Enhanced for loop): " + found1);

        // Method 2: Traditional for loop
        boolean found2 = containsNumberWithIndex(numbers, target);
        System.out.println("Method 2 (Traditional for loop): " + found2);

        // Method 3: Binary search
        boolean found3 = containsNumberBinarySearch(numbers, target);
        System.out.println("Method 3 (Binary search): " + found3);

        // Method 4: Java 8 Streams
        boolean found4 = containsNumberStream(numbers, target);
        System.out.println("Method 4 (Java 8 Streams): " + found4);

        // Find index
        int index = findIndex(numbers, target);
        if (index != -1) {
            System.out.println("Number found at index: " + index);
        } else {
            System.out.println("Number not found in the array");
        }

        // Performance comparison for large arrays
        System.out.println("\n--- Performance Test ---");
        performanceTest();

        scanner.close();
    }

    // Method to demonstrate performance differences
    public static void performanceTest() {
        // Create a large array for performance testing
        int[] largeArray = new int[1000000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i;
        }

        int target = 999999; // Last element (worst case for linear search)

        // Test Method 1: Linear search
        long startTime = System.nanoTime();
        containsNumber(largeArray, target);
        long endTime = System.nanoTime();
        System.out.println("Linear search time: " + (endTime - startTime) / 1000000.0 + " ms");

        // Test Method 3: Binary search
        startTime = System.nanoTime();
        containsNumberBinarySearch(largeArray, target);
        endTime = System.nanoTime();
        System.out.println("Binary search time: " + (endTime - startTime) / 1000000.0 + " ms");

        // Test Method 4: Stream
        startTime = System.nanoTime();
        containsNumberStream(largeArray, target);
        endTime = System.nanoTime();
        System.out.println("Stream search time: " + (endTime - startTime) / 1000000.0 + " ms");
    }

}
