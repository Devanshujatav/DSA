package com.devanshu.code.MergeArrays;

import java.util.Arrays;

public class ArrayMerge {

    // Method 1: Simple concatenation - works with any type
    public static <T> T[] mergeArray(T[] array1 , T[] array2){
        // Create new array with combined length
        T[] result = Arrays.copyOf(array1 , array1.length + array2.length);

        // Copy elements from second array
        System.arraycopy(array2 , 0 , result , array1.length , array2.length);

        return result;
    }

    // Method 2: Simple concatenation for int arrays
    public static int[] mergeArrayTwo(int[] array1 , int[] array2){
        int[] result = new int[array1.length + array2.length];

        // Copy First Array
        System.arraycopy(array1 , 0 , result , 0 , array1.length);

        // Copy Second Array
        System.arraycopy(array2 , 0 , result , array1.length , array2.length);

        return result;
    }

    // Method 3: Merge two sorted arrays maintaining sorted order
    public static int[] mergeSortedArrays(int[] array1 , int[] array2){
        int[] result = new int[array1.length + array2.length];

        int i=0 , j=0 , k=0;

        while (i < array1.length && j < array2.length){
            if (array1[i] <= array2[j]){
                result[k++] = array1[i++];
            }else {
                result[k++] = array2[j++];
            }
        }

        while (i< array1.length){
            result[k++] = array1[i++];
        }

        while (j< array2.length){
            result[k++] = array2[j++];
        }

        return result;
    }

    // Method 4: Alternative using manual copying (educational purpose)
    public static int[] mergeArrayManual(int[] array1 , int[] array2){

        int[] result = new int[array1.length + array2.length];

        for (int i=0 ; i< array1.length ; i++){
            result[i] = array1[i];
        }

        for (int i=0 ; i< array2.length ; i++){
            result[array1.length + i] = array2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1: Merging integer arrays
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        // Simple concatenation
        int[] mergedArray = mergeArrayTwo(array1, array2);
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Example 2: Merging sorted arrays in sorted order
        int[] sortedArray1 = {1, 5, 9, 10, 15, 20};
        int[] sortedArray2 = {2, 3, 8, 13};

        System.out.println("Sorted Array 1: " + Arrays.toString(sortedArray1));
        System.out.println("Sorted Array 2: " + Arrays.toString(sortedArray2));

        int[] mergedSorted = mergeSortedArrays(sortedArray1, sortedArray2);
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedSorted));

        System.out.println("\n" + "=".repeat(50) + "\n");

        // Example 3: Merging string arrays
        String[] names1 = {"Alice", "Charlie", "Eve"};
        String[] names2 = {"Bob", "David", "Frank"};

        System.out.println("Names Array 1: " + Arrays.toString(names1));
        System.out.println("Names Array 2: " + Arrays.toString(names2));

        String[] mergedNames = mergeArray(names1, names2);
        System.out.println("Merged Names: " + Arrays.toString(mergedNames));
    }
}
