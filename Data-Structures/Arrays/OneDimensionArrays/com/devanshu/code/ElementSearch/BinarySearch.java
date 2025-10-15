package com.devanshu.code.ElementSearch;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {

    public static int binarySearch(int[] arr , int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
            }else {
                right = mid-1;
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

            // Binary search on sorted array
            int binaryResult = binarySearch(sortedArray, target);
            printResult(binaryResult, target, "Binary Search (sorted array)");

            // Using built-in binary search
            int builtInResult = Arrays.binarySearch(sortedArray, target);
            if (builtInResult >= 0) {
                System.out.println("Built-in Binary Search: Element " + target + " found at index " + builtInResult);
            } else {
                System.out.println("Built-in Binary Search: Element " + target + " not found in the array");
            }

            System.out.println();
        }

        scanner.close();
    }
}
