package com.devanshu.code.LeftShiftByN;
import com.devanshu.code.LeftShiftByOne.LeftShiftArray;

public class leftShiftArrayN {
    // Method to left shift by multiple positions
    public void leftShiftByN(int[] arr , int rotations){

        LeftShiftArray helper = new LeftShiftArray();

        if (arr == null || arr.length <= 1 || rotations <= 0){
            return;
        }

        // Normalize n to avoid unnecessary full rotations
        rotations = rotations % arr.length;

        // Perform n left shifts
        for (int i=0 ; i<rotations ; i++){
            helper.leftShiftByOne(arr);
        }
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

        leftShiftArrayN lsa = new leftShiftArrayN();



        // Test case 2: Left shift by multiple positions
        int[] arr2 = {10, 20, 30, 40, 50, 60};
        System.out.println("Original array:");
        printArray(arr2);

        lsa.leftShiftByN(arr2, 3);
        System.out.println("After left shift by 3 positions:");
        printArray(arr2);


    }
}
