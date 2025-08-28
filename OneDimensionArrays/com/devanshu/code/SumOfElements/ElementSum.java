package com.devanshu.code.SumOfElements;

public class ElementSum {

    // Method 1: Using traditional for loop
    public static int sumWithForLoop(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Method 2: Using enhanced for loop (for-each)
    public static int sumWithEnhancedForLoop(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    // Method 3: Using while loop
    public static int sumWithWhileLoop(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum;
    }

    // Method 4: Using recursion
    public static int sumWithRecursion(int[] arr , int index){
        // Base Case
        if (index >= arr.length){
            return 0;
        }

        // Recursive + Self work
        return arr[index] + sumWithRecursion(arr , index+1);
    }

    // Overloaded method for easier recursion call
    public static int sumWithRecursion(int[] arr) {
        return sumWithRecursion(arr, 0);
    }

    public static void main(String[] args) {
        // Test array
        int[] numbers = {10, 25, 30, 45, 50, 15, 20};

        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Calculate sum using different methods
        int sum1 = sumWithForLoop(numbers);
        int sum2 = sumWithEnhancedForLoop(numbers);
        int sum3 = sumWithWhileLoop(numbers);
        int sum4 = sumWithRecursion(numbers);

        // Display results
        System.out.println("\nSum calculations:");
        System.out.println("Using for loop: " + sum1);
        System.out.println("Using enhanced for loop: " + sum2);
        System.out.println("Using while loop: " + sum3);
        System.out.println("Using recursion: " + sum4);

        // Test with empty array
        int[] emptyArray = {};
        System.out.println("\nTesting with empty array:");
        System.out.println("Sum of empty array: " + sumWithForLoop(emptyArray));

        // Test with single element array
        int[] singleElement = {42};
        System.out.println("\nTesting with single element array:");
        System.out.println("Sum of single element array: " + sumWithForLoop(singleElement));
    }
}
