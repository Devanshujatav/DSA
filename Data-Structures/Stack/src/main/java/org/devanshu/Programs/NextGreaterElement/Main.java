package org.devanshu.Programs.NextGreaterElement;

import java.util.Arrays;

public class Main {

    /**
     * Utility method to print array with better formatting
     */
    public static void printArrayComparison(int[] arr, int[] nge) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Element\t\t->\tNext Greater Element");
        System.out.println("=".repeat(50));
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-8d\t->\t%-8s%n", arr[i],
                    (nge[i] == -1 ? "None" : nge[i]));
        }
        System.out.println("=".repeat(50));
    }


    public static void main(String[] args) {

        NextGreaterElement NGT = new NextGreaterElement();

        // Test Case 1: General case
        System.out.println("TEST CASE 1: General Array");
        int[] arr1 = {4, 5, 2, 25, 7, 8};
        System.out.println("Input Array: " + Arrays.toString(arr1));
        int[] result1 = NGT.findNextGreaterElement(arr1);
        System.out.println("Result:      " + Arrays.toString(result1));
        printArrayComparison(arr1, result1);

        // Test Case 2: Descending order (no next greater elements)
        System.out.println("\n\nTEST CASE 2: Descending Order");
        int[] arr2 = {10, 8, 6, 4, 2};
        System.out.println("Input Array: " + Arrays.toString(arr2));
        int[] result2 = NGT.findNextGreaterElement(arr2);
        System.out.println("Result:      " + Arrays.toString(result2));
        printArrayComparison(arr2, result2);

        // Test Case 3: Ascending order
        System.out.println("\n\nTEST CASE 3: Ascending Order");
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Input Array: " + Arrays.toString(arr3));
        int[] result3 = NGT.findNextGreaterElement(arr3);
        System.out.println("Result:      " + Arrays.toString(result3));
        printArrayComparison(arr3, result3);

        // Test Case 4: Array with duplicates
        System.out.println("\n\nTEST CASE 4: Array with Duplicates");
        int[] arr4 = {5, 3, 8, 3, 8, 2};
        System.out.println("Input Array: " + Arrays.toString(arr4));
        int[] result4 = NGT.findNextGreaterElement(arr4);
        System.out.println("Result:      " + Arrays.toString(result4));
        printArrayComparison(arr4, result4);

        // Demonstrate left-to-right approach
        System.out.println("\n\nVERIFYING LEFT-TO-RIGHT APPROACH:");
        int[] result5 = NGT.findNextGreaterElementLeftToRight(arr1);
        System.out.println("Input Array: " + Arrays.toString(arr1));
        System.out.println("Result:      " + Arrays.toString(result5));
    }
}
