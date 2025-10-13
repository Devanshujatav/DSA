package com.devanshu.code.DescendingSort;

import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    // Method 1: Using Arrays.sort() with reverse order
    public static void sortDescending1(Integer[] arr){
        Arrays.sort(arr , Collections.reverseOrder());
    }

    // Method 2: Manual sorting using bubble sort
    public static void sortDescending2(int[] arr){
        int n = arr.length;
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n-i-1 ; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
