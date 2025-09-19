package com.devanshu.code.LeftShiftByOne;

public class LeftShiftArray {
    // Method to left shift array elements by one position
    public void leftShiftByOne(int[] arr){
        // Edge Cases
        if (arr == null || arr.length <= 1){
            return; // No shifting needed for empty or single element array
        }

        // Store the first element
        int firstElement = arr[0];

        // Shift all elements to the left by one position
        for (int i=0 ; i< arr.length-1 ; i++){
            arr[i] = arr[i+1];
        }

        // Place the first element at the end
        arr[arr.length-1] = firstElement;
    }

    // Method to print array elements
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

    public static void main(String[] args) {
        // Test case 1: Basic left shift by one position
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(arr1);

        LeftShiftArray lsa = new LeftShiftArray();

        lsa.leftShiftByOne(arr1);
        System.out.println("After left shift by 1 position:");
        printArray(arr1);

        System.out.println();

        System.out.println();

        // Test case 3: Edge cases
        int[] arr3 = {100};
        System.out.println("Single element array:");
        printArray(arr3);
        lsa.leftShiftByOne(arr3);
        System.out.println("After left shift (no change expected):");
        printArray(arr3);

        System.out.println();

        // Test case 4: Empty array handling
        int[] arr4 = {};
        System.out.println("Empty array length: " + arr4.length);
        lsa.leftShiftByOne(arr4);
        System.out.println("Left shift on empty array completed (no error)");
    }

}
