package com.devanshu.code.EvenOddSeperator;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddSeperator {

    public static void seperateEvenOddDynamic(int[] numbers){
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int val : numbers){
            if (val % 2 == 0){
                evenList.add(val);
            }else {
                oddList.add(val);
            }
        }

        // Convert Arraylist to arrays
        int[] evenArray = evenList.stream().mapToInt(i -> i).toArray();
        int[] oddArray = oddList.stream().mapToInt(i -> i).toArray();

        // Display results
        System.out.println("Method 1 (Dynamic Arrays):");
        System.out.println("Even numbers: " + Arrays.toString(evenArray));
        System.out.println("Odd numbers: " + Arrays.toString(oddArray));
        System.out.println("Even count: " + evenArray.length);
        System.out.println("Odd count: " + oddArray.length);
    }


    // Method 2: Using fixed arrays (count first, then fill)
    public static void separateEvenOddFixed(int[] numbers) {
        // First pass: count even and odd numbers
        int evenCount = 0, oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Create arrays with exact sizes
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        // Second pass: fill the arrays
        int evenIndex = 0, oddIndex = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }
        }


        // Display results
        System.out.println("Method 2 (Fixed Arrays):");
        System.out.println("Even numbers: " + Arrays.toString(evenArray));
        System.out.println("Odd numbers: " + Arrays.toString(oddArray));
        System.out.println("Even count: " + evenArray.length);
        System.out.println("Odd count: " + oddArray.length);
    }


    // Utility method to separate even/odd and return both arrays
    public static int[][] separateEvenOdd(int[] numbers) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        int[] evenArray = evenList.stream().mapToInt(i -> i).toArray();
        int[] oddArray = oddList.stream().mapToInt(i -> i).toArray();

        return new int[][]{evenArray, oddArray};
    }

    public static void main(String[] args) {
        // Sample input array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Method 1: Using ArrayList (dynamic sizing)
        seperateEvenOddDynamic(numbers);

        System.out.println();

        // Method 2: Using fixed arrays (need to count first)
        separateEvenOddFixed(numbers);
    }
}
