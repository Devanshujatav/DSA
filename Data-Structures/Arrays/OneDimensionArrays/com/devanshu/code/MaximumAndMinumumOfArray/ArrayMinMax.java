package com.devanshu.code.MaximumAndMinumumOfArray;

import java.util.Arrays;

public class ArrayMinMax {

    public static int[] findMinMax(int[] arr){
        // EDGE CASE
        if (arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i=1 ; i< arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return new int[] {min , max};

    }



    // Method 2: Using enhanced for loop
    public static int[] findMinMaxWithEnhancedForLoop(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int element : arr) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }

        return new int[]{min, max};
    }

    // Method 3: Using Arrays.stream() (Java 8+)
    public static int[] findMinMaxWithStream(int[] arr){
        if (arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        return new int[]{min , max};
    }



    // Method 4: Using recursion
    public static int[] findMinMaxWithRecursion(int[] arr , int index , int currentMin , int currentMax){
        // Base Case
        if (index >= arr.length){
            return new int[]{currentMin , currentMax};
        }

        // Self Work
        int newMin = Math.min(currentMin , arr[index]);
        int newMax = Math.max(currentMax , arr[index]);

        // Recursive Case
        return findMinMaxWithRecursion(arr , index+1 , newMin , newMax);
    }


    // Overloaded method for easier recursion call
    public static int[] findMinMaxWithRecursion(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        return findMinMaxWithRecursion(arr, 1, arr[0], arr[0]);
    }

    // Method 5: Separate methods for finding min and max individually
    public static int findMinimum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaximum(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Helper method to print results
    public static void printResults(String method, int[] result) {
        System.out.println(method + " - Min: " + result[0] + ", Max: " + result[1]);
    }

    public static void main(String[] args) {
        // Test array with mixed positive and negative numbers
        int[] numbers = {64, 25, 12, 22, 11, 90, 5, 77, 30};

        System.out.println("Array elements:");
        printArray(numbers);

        System.out.println("\nFinding Min and Max using different methods:");
        System.out.println("=".repeat(50));

        // Test all methods
        int[] result1 = findMinMax(numbers);
        printResults("Traditional for loop", result1);

        int[] result2 = findMinMaxWithEnhancedForLoop(numbers);
        printResults("Enhanced for loop", result2);

        int[] result3 = findMinMaxWithStream(numbers);
        printResults("Java 8 Stream API", result3);

        int[] result4 = findMinMaxWithRecursion(numbers);
        printResults("Recursion", result4);

        System.out.println("\nUsing separate methods:");
        int min = findMinimum(numbers);
        int max = findMaximum(numbers);
        System.out.println("Separate methods - Min: " + min + ", Max: " + max);

        // Test with array containing negative numbers
        System.out.println("\n" + "=".repeat(50));
        int[] negativeNumbers = {-5, -2, -10, -1, -8, -3};
        System.out.println("Testing with negative numbers:");
        printArray(negativeNumbers);
        int[] negResult = findMinMax(negativeNumbers);
        printResults("Result", negResult);

        // Test with single element array
        System.out.println("\n" + "=".repeat(50));
        int[] singleElement = {42};
        System.out.println("Testing with single element:");
        printArray(singleElement);
        int[] singleResult = findMinMax(singleElement);
        printResults("Result", singleResult);

        // Test with array containing duplicate values
        System.out.println("\n" + "=".repeat(50));
        int[] duplicates = {5, 5, 5, 5, 5};
        System.out.println("Testing with duplicate values:");
        printArray(duplicates);
        int[] dupResult = findMinMax(duplicates);
        printResults("Result", dupResult);

        // Demonstrate error handling for empty array
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Testing error handling with empty array:");
        try {
            int[] emptyArray = {};
            findMinMax(emptyArray);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}

