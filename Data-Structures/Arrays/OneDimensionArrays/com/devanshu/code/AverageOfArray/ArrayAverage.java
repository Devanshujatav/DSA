package com.devanshu.code.AverageOfArray;

public class ArrayAverage {

    // Method 1: Using traditional for loop with integer array
    public static double averageWithForLoop(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Cannot calculate average of empty array");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    // Method 2: Using enhanced for loop with integer array
    public static double averageWithEnhancedForLoop(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Cannot calculate average of empty array");
        }

        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return (double) sum / arr.length;
    }

    // Method 3: Using while loop
    public static double averageWithWhileLoop(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Cannot calculate average of empty array");
        }

        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return (double) sum / arr.length;
    }

    // Method 4: Working with double array for precise calculations
    public static double averageWithDoubleArray(double[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Cannot calculate average of empty array");
        }

        double sum = 0.0;
        for (double element : arr) {
            sum += element;
        }
        return sum / arr.length;
    }

    // Method 5: Using recursion
    public static double averageWithRecursion(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Cannot calculate average of empty array");
        }
        return (double) sumRecursive(arr, 0) / arr.length;
    }

    // Helper method for recursion
    private static int sumRecursive(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        return arr[index] + sumRecursive(arr, index + 1);
    }

    // Method 6: Safe average that returns 0 for empty arrays
    public static double safeAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }

        long sum = 0; // Use long to prevent overflow
        for (int element : arr) {
            sum += element;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        // Test with integer array
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Integer Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Calculate average using different methods
        double avg1 = averageWithForLoop(numbers);
        double avg2 = averageWithEnhancedForLoop(numbers);
        double avg3 = averageWithWhileLoop(numbers);
        double avg4 = averageWithRecursion(numbers);

        System.out.println("\nAverage calculations (Integer array):");
        System.out.println("Using for loop: " + avg1);
        System.out.println("Using enhanced for loop: " + avg2);
        System.out.println("Using while loop: " + avg3);
        System.out.println("Using recursion: " + avg4);

        // Test with double array for more precise calculations
        double[] preciseNumbers = {10.5, 20.3, 30.7, 40.1, 50.9};
        double avgPrecise = averageWithDoubleArray(preciseNumbers);

        System.out.println("\nDouble Array elements:");
        for (int i = 0; i < preciseNumbers.length; i++) {
            System.out.print(preciseNumbers[i]);
            if (i < preciseNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Average of double array: " + avgPrecise);

        // Test with different scenarios
        int[] oddNumbers = {1, 3, 5, 7, 9, 11};
        int[] singleElement = {42};
        int[] negativeNumbers = {-10, -5, 0, 5, 10};

        System.out.println("\nTesting different scenarios:");
        System.out.println("Average of odd numbers [1,3,5,7,9,11]: " + averageWithForLoop(oddNumbers));
        System.out.println("Average of single element [42]: " + averageWithForLoop(singleElement));
        System.out.println("Average of mixed numbers [-10,-5,0,5,10]: " + averageWithForLoop(negativeNumbers));

        // Test safe average with empty array
        int[] emptyArray = {};
        System.out.println("Safe average of empty array: " + safeAverage(emptyArray));

        // Demonstrate exception handling
        System.out.println("\nTesting exception handling:");
        try {
            averageWithForLoop(emptyArray);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Test with large numbers to show overflow protection
        int[] largeNumbers = {Integer.MAX_VALUE, Integer.MAX_VALUE - 1, Integer.MAX_VALUE - 2};
        System.out.println("\nTesting with large numbers:");
        System.out.println("Average of large numbers: " + safeAverage(largeNumbers));
    }
}
