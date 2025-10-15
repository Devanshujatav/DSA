package com.devanshu.code.DescendingSort;

import java.util.Arrays;

import static com.devanshu.code.DescendingSort.DescendingSort.*;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using Collections.reverseOrder() (requires Integer wrapper)
        System.out.println("Method 1: Using Collections.reverseOrder()");
        Integer[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Original array: ");
        System.out.println(Arrays.toString(arr1));
        sortDescending1(arr1);
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(arr1));

        System.out.println("\nMethod 2: Using Bubble Sort");
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Original array: ");
        printArray(arr2);
        sortDescending2(arr2);
        System.out.print("Sorted array: ");
        printArray(arr2);

//        System.out.println("\nMethod 3: Sort then Reverse");
//        int[] arr3 = {64, 34, 25, 12, 22, 11, 90};
//        System.out.print("Original array: ");
//        printArray(arr3);
//        sortDescending3(arr3);
//        System.out.print("Sorted array: ");
//        printArray(arr3);
    }
}
