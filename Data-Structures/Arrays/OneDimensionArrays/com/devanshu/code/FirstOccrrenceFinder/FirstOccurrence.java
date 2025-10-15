package com.devanshu.code.FirstOccrrenceFinder;

/**
 * FirstOccurrenceFinder class demonstrates how to find the first occurrence
 * of an element in an array using linear search algorithm
 */
public class FirstOccurrence {

    /**
     * Method to find the first occurrence of an integer element in an integer array
     * Uses linear search - checks each element one by one from left to right
     *
     * @param arr - the integer array to search in
     * @param target - the integer element we want to find
     * @return index of first occurrence if found, -1 if not found
     */
    public static int firstOccurrence(int[] arr , int target){
        // Loop through each element in the array starting from index 0
        for (int i=0 ; i<arr.length ; i++){
            // Check if current element matches the target element
            if (arr[i] == target){
                return i; // Return the current index (first occurrence found)
            }
        }
        // If we reach here, element was not found in entire array
        return -1;// Return -1 to indicate element not found
    }


    /**
     * Overloaded method to find first occurrence of a String element in String array
     * Same logic as integer version but uses .equals() method for string comparison
     *
     * @param arr - the String array to search in
     * @param target - the String element we want to find
     * @return index of first occurrence if found, -1 if not found
     */

    public static int firstOccurrenceString(String[] arr , String target){
        // Loop through each element in the string array
        for (int i = 0; i < arr.length; i++) {
            // Use .equals() method to compare strings (not == operator)
            if (arr[i].equals(target)) {
                return i; // Return index where first match is found
            }
        }
        return -1; // Return -1 if no match found
    }


    /**
     * Main method - entry point of the program
     * Contains test cases to demonstrate how the search methods work
     */
    public static void main(String[] args) {

        // ===== TEST CASE 1: Integer Array =====
        // Create an integer array with some duplicate values
        int[] numbers = {5, 2, 8, 2, 9, 1, 2}; // Note: 2 appears at indices 1, 3, and 6
        int targetNum = 2; // Element we want to search for

        // Call the search method and store the result
        int result = firstOccurrence(numbers, targetNum);

        // Check if element was found (result != -1) and display appropriate message
        if (result != -1) {
            System.out.println("First occurrence of " + targetNum + " found at index: " + result);
        } else {
            System.out.println("Element " + targetNum + " not found in the array");
        }

        // ===== TEST CASE 2: String Array =====
        // Create a string array with some duplicate values
        String[] words = {"apple", "banana", "cherry", "banana", "date"}; // "banana" at indices 1 and 3
        String targetWord = "banana"; // String we want to search for

        // Call the overloaded string search method
        int stringResult = firstOccurrenceString(words, targetWord);

        // Display result for string search
        if (stringResult != -1) {
            System.out.println("First occurrence of \"" + targetWord + "\" found at index: " + stringResult);
        } else {
            System.out.println("Element \"" + targetWord + "\" not found in the array");
        }

        // ===== TEST CASE 3: Element Not Found =====
        // Test searching for an element that doesn't exist in the array
        int notFound = firstOccurrence(numbers, 100); // 100 is not in the numbers array

        // Use ternary operator to display result in one line
        System.out.println("Searching for 100: " + (notFound == -1 ? "Not found" : "Found at index " + notFound));
    }
}
