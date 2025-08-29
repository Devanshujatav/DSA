package com.devanshu.code.ElementSearch;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr , int target){
        for (int i=0 ; i< arr.length ; i++){
            if (arr[i] == target){
                return i;
            }
        }

        return -1;
    }


    // Method to print search result
    public static void printResult(int result, int target, String method) {
        if (result != -1) {
            System.out.println(method + ": Element " + target + " found at index " + result);
        } else {
            System.out.println(method + ": Element " + target + " not found in the array");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array for demonstration
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90, 5, 77, 30};
        int[] sortedArray = {5, 11, 12, 22, 25, 30, 34, 64, 77, 90};

        System.out.println("Element Search Program");
        System.out.println("=====================");
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        System.out.println();

        while (true) {
            System.out.print("Enter the element to search for (or -999 to exit): ");
            int target = scanner.nextInt();

            if (target == -999) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.println("\nSearching for: " + target);
            System.out.println("------------------------");

            // Linear search on unsorted array
            int linearResult = linearSearch(unsortedArray, target);
            printResult(linearResult, target, "Linear Search (unsorted array)");

            // Linear search on sorted array
            int linearResultSorted = linearSearch(sortedArray, target);
            printResult(linearResultSorted, target, "Linear Search (sorted array)");

        }

        scanner.close();
    }
}
