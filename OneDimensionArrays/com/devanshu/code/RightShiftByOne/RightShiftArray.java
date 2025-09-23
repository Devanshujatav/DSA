package com.devanshu.code.RightShiftByOne;

public class RightShiftArray {

    // Method 1: Shift right by one position (circular shift)
    public static void rightShiftByOne(int[] arr){
        // EDGE CASE
        if(arr.length <= 1) return;

        int lastElement = arr[arr.length-1];

        // Shift all elements to the right
        for (int i= arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }

        // Place the last element at the beginning
        arr[0] = lastElement;
    }


    // Method 2: Shift right by one position (fill with zero)
    public static void rightShiftWithZero(int[] arr){
        // EDGE CASE
        if (arr.length <= 1){
            return;
        }

        // Shift all elements to the right
        for (int i= arr.length-1 ; i>0 ; i--){
            arr[i] = arr[i-1];
        }

        // Fill the first position with zero
        arr[0] = 0;
    }

    // Method 3: Generic method to shift right by n positions (circular)
    public static void shiftRightByN(int[] arr , int rotations){
        // EDGE CASE
        if (arr.length <= 1 || rotations==0){
            return;
        }

        rotations = rotations % arr.length; // Handle cases where n > array length

        // Create a temporary array
        int[] temp = new int[arr.length];

        // Copy elements to their new positions
        for (int i=0 ; i< arr.length ; i++){
            temp[(rotations + i) % arr.length] = arr[i];
        }

        // Copy back to original array
        System.arraycopy(temp , 0 , arr , 0 , arr.length);
    }

    public static void shiftRightByN_Two(int[] arr , int rotations){
        // EDGE CASE
        if (arr.length <= 1 || rotations==0){
            return;
        }

        rotations = rotations % arr.length; // Handle cases where n > array length

        for (int i=0 ; i<rotations ; i++){
            rightShiftByOne(arr);
        }
    }
    // Utility method to print array
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
        int[] arr = {1,2,3,4,5,6,7};

        System.out.print("Before Shifting : ");

        printArray(arr);

        System.out.print("After Shifting : ");

//        rightShiftByOne(arr);

//        rightShiftWithZero(arr);

        shiftRightByN(arr , 8);

        printArray(arr);
    }
}
