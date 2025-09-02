package com.devanshu.code.Comparision_of_Arrays;

import java.util.Arrays;

public class ArrayComparision {
    /**
     * Manual method to compare two arrays for equality
     * @param array1 First array
     * @param array2 Second array
     * @return true if arrays are equal, false otherwise
     */
    public static boolean areEqual(int[] array1 , int[] array2){
        // Check if both arrays are null
        if (array1 == null && array2 == null){
            return true;
        }

        // Check if one is null and other one is not
        if (array1 == null || array2 == null){
            return false;
        }

        // Check if lengths are different
        if (array1.length != array2.length){
            return false;
        }

        // Compare each element
        for (int i=0 ; i< array1.length ; i++){
            if (array1[i] != array2[i]){
                return false;
            }
        }

        return true;
    }


    /**
     * Generic method to compare two arrays of any type
     * @param array1 First array
     * @param array2 Second array
     * @param <T> Type of array elements
     * @return true if arrays are equal, false otherwise
     */
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        // Check if both arrays are null
        if (array1 == null && array2 == null){
            return true;
        }

        // Check if one is null and other one is not
        if (array1 == null || array2 == null){
            return false;
        }

        // Check if lengths are different
        if (array1.length != array2.length){
            return false;
        }

        // Compare the cases
        for (int i=0 ; i< array1.length ; i++){
            if (array1 == null && array2 == null){
                continue;
            }

            if (array1==null || array2==null){
                return false;
            }

            if (!array1[i].equals(array2[i])){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        // Test arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};
        int[] array4 = {1, 2, 3, 4};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("Array 3: " + Arrays.toString(array3));
        System.out.println("Array 4: " + Arrays.toString(array4));
        System.out.println();

        // Method 1: Using Arrays.equals() - Recommended approach
        System.out.println("=== Using Arrays.equals() ===");
        System.out.println("Array1 equals Array2: " + Arrays.equals(array1, array2));
        System.out.println("Array1 equals Array3: " + Arrays.equals(array1, array3));
        System.out.println("Array1 equals Array4: " + Arrays.equals(array1, array4));
        System.out.println();

        // Method 2: Manual comparison
        System.out.println("=== Using manual comparison ===");
        System.out.println("Array1 equals Array2: " + areEqual(array1, array2));
        System.out.println("Array1 equals Array3: " + areEqual(array1, array3));
        System.out.println("Array1 equals Array4: " + areEqual(array1, array4));
        System.out.println();

        // Test with String arrays
        String[] strArray1 = {"apple", "banana", "orange"};
        String[] strArray2 = {"apple", "banana", "orange"};
        String[] strArray3 = {"apple", "banana", "grape"};

        System.out.println("=== String Array Comparison ===");
        System.out.println("String Array1: " + Arrays.toString(strArray1));
        System.out.println("String Array2: " + Arrays.toString(strArray2));
        System.out.println("String Array3: " + Arrays.toString(strArray3));
        System.out.println("strArray1 equals strArray2: " + Arrays.equals(strArray1, strArray2));
        System.out.println("strArray1 equals strArray3: " + Arrays.equals(strArray1, strArray3));
        System.out.println();

        // Test with 2D arrays
        int[][] array2D1 = {{1, 2}, {3, 4}};
        int[][] array2D2 = {{1, 2}, {3, 4}};
        int[][] array2D3 = {{1, 2}, {3, 5}};

        System.out.println("=== 2D Array Comparison ===");
        System.out.println("2D Array1 equals 2D Array2 (shallow): " + Arrays.equals(array2D1, array2D2));
        System.out.println("2D Array1 equals 2D Array2 (deep): " + Arrays.deepEquals(array2D1, array2D2));
        System.out.println("2D Array1 equals 2D Array3 (deep): " + Arrays.deepEquals(array2D1, array2D3));
    }
}
