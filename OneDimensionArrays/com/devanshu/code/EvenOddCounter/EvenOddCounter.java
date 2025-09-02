package com.devanshu.code.EvenOddCounter;

import java.util.Arrays;
import java.util.Scanner;


public class EvenOddCounter {

    // Method 1: Using a simple for loop
    public static void countEvenOdd(int[] arr){
        int evenCount = 0;
        int oddCount = 0;

        for (int val : arr){
            if (val % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }

        System.out.println("Method 1 (Enhanced for loop):");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println();
    }

    // Method 2: Using traditional for loop with index
    public static int[] countEvenOddWithIndexing(int[] arr){
        int evenCount = 0;
        int oddCount = 0;

        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }

        return new int[]{evenCount , oddCount};
    }

    // Method 3: Using Java 8 Streams
    public static void countEvenOddStreams(int[] arr){
        long evenCount = Arrays.stream(arr).filter(num -> num%2 == 0).count();
        long oddCount = Arrays.stream(arr).filter(num -> num%2 != 0).count();

        System.out.println("Method 3 (Java 8 Streams):");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println();
    }

    // Method 4: Single pass with detailed output
    public static void countWithDetails(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Method 4 (With details):");
        System.out.print("Even numbers: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                evenCount++;
            }
        }
        System.out.println("(Count: " + evenCount + ")");

        System.out.print("Odd numbers: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                oddCount++;
            }
        }
        System.out.println("(Count: " + oddCount + ")");
        System.out.println();
    }

    // Method 5: Using a custom class to encapsulate the result
    // Method 5: Using a custom class to encapsulate the result
    public static class EvenOddResult {
        public final int evenCount;
        public final int oddCount;

        public EvenOddResult(int evenCount, int oddCount) {
            this.evenCount = evenCount;
            this.oddCount = oddCount;
        }

        @Override
        public String toString() {
            return String.format("Even: %d, Odd: %d, Total: %d",
                    evenCount, oddCount, evenCount + oddCount);
        }

        public double getEvenPercentage() {
            int total = evenCount + oddCount;
            return total == 0 ? 0 : (double) evenCount / total * 100;
        }

        public double getOddPercentage() {
            int total = evenCount + oddCount;
            return total == 0 ? 0 : (double) oddCount / total * 100;
        }
    }

    public static EvenOddResult analyzeArray(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return new EvenOddResult(evenCount, oddCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample arrays for demonstration
        int[] sampleArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] sampleArray2 = {15, 22, 33, 44, 55, 66, 77, 88, 99};
        int[] sampleArray3 = {-5, -2, 0, 3, 7, 12, 18, 21};

        System.out.println("=== EVEN AND ODD NUMBER COUNTER ===\n");

        // Test with sample array 1
        System.out.println("Testing with array: " + Arrays.toString(sampleArray1));
        System.out.println("----------------------------------------");

        countEvenOdd(sampleArray1);

        int[] result = countEvenOddWithIndexing(sampleArray1);
        System.out.println("Method 2 (Traditional for loop):");
        System.out.println("Even numbers: " + result[0]);
        System.out.println("Odd numbers: " + result[1]);
        System.out.println();

        countEvenOddStreams(sampleArray1);
        countWithDetails(sampleArray1);

        // Using the custom result class
        EvenOddResult analysis = analyzeArray(sampleArray1);
        System.out.println("Method 5 (Custom result class):");
        System.out.println(analysis);
        System.out.printf("Even percentage: %.1f%%\n", analysis.getEvenPercentage());
        System.out.printf("Odd percentage: %.1f%%\n", analysis.getOddPercentage());
        System.out.println();

        // Test with other sample arrays
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Testing with array: " + Arrays.toString(sampleArray2));
        EvenOddResult analysis2 = analyzeArray(sampleArray2);
        System.out.println(analysis2);

        System.out.println("\nTesting with array: " + Arrays.toString(sampleArray3));
        EvenOddResult analysis3 = analyzeArray(sampleArray3);
        System.out.println(analysis3);

        // Interactive section
        System.out.println("\n" + "=".repeat(50));
        System.out.println("INTERACTIVE MODE");
        System.out.print("Enter the size of your array: ");
        int size = scanner.nextInt();

        if (size > 0) {
            int[] userArray = new int[size];
            System.out.println("Enter " + size + " numbers:");

            for (int i = 0; i < size; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                userArray[i] = scanner.nextInt();
            }

            System.out.println("\nYour array: " + Arrays.toString(userArray));
            EvenOddResult userResult = analyzeArray(userArray);
            System.out.println("Result: " + userResult);
            System.out.printf("Even: %.1f%%, Odd: %.1f%%\n",
                    userResult.getEvenPercentage(),
                    userResult.getOddPercentage());
        }

        scanner.close();
    }
}

