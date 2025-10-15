package com.devanshu.code.Sorting;

import java.util.Arrays;

public class ArraySort {

    // Bubble Sort Implementation
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n-i-1 ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort Implementation
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0 ; i<n-1 ; i++){
            int minIndex = i;
            for (int j=i+1 ; j<n ; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            // Swap the minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Insertion Sort Implementation
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int i=1 ; i<n ; i++){
            int key = arr[i];
            int j=i-1;

            // Move elements greater than key one position ahead
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90, 5, 77, 30};

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Method 1: Using Arrays.sort() (most efficient)
        int[] array1 = numbers.clone();
        Arrays.sort(array1);
        System.out.println("Sorted using Arrays.sort(): " + Arrays.toString(array1));

        // Method 2: Using Bubble Sort (educational purpose)
        int[] array2 = numbers.clone();
        bubbleSort(array2);
        System.out.println("Sorted using Bubble Sort: " + Arrays.toString(array2));

        // Method 3: Using Selection Sort
        int[] array3 = numbers.clone();
        selectionSort(array3);
        System.out.println("Sorted using Selection Sort: " + Arrays.toString(array3));

        // Method 4: Using Insertion Sort
        int[] array4 = numbers.clone();
        insertionSort(array4);
        System.out.println("Sorted using Insertion Sort: " + Arrays.toString(array4));
    }
}
