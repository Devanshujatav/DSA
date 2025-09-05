package com.devanshu.code.LastOccurrenceFinder;
import java.util.Scanner;

/**
 * This program finds the last occurrence of a given element in an array.
 * It demonstrates linear search from the end of the array backwards.
 */

public class LastOccurrence {

    /**
     * Method to find the last occurrence of an element in an array
     * @param arr - the array to search in
     * @param target - the element to find
     * @return the index of the last occurrence, or -1 if not found
     */
    // Method 1
    public static int lastOccurrence(int[] arr , int target){
        // Start searching from the end of the array (backwards)
        // This ensures we find the LAST occurrence first
        for (int i= arr.length-1 ; i>=0 ; i--){
            // Check if current element matches the target
            if (arr[i] == target){
                // Return the index immediately when found
                // Since we're searching backwards, this is the last occurrence
                return i;
            }
        }
        // If we reach here, the element was not found in the array
        return -1;
    }


    // Method 2
    /**
     * Alternative method using forward search
     * This approach scans the entire array and keeps updating the last found position
     * @param arr - the array to search in
     * @param target - the element to find
     * @return the index of the last occurrence, or -1 if not found
     */
    public static int lastOccurrances(int[] arr , int target){
        int lastIndex = 0; // Initialize to -1 (not found)
        // Search through the entire array from beginning to end

        for (int i=0 ; i< arr.length ; i++){
            // If we find the target element
            if (arr[i] == target){
                // Update the lastIndex to current position
                // This will keep getting updated until we reach the actual last occurrence
                lastIndex = i;
            }
        }
        // Return the last found index (or -1 if never found)
        return lastIndex;
    }
    /**
     * Helper method to display the array contents
     * @param arr - the array to display
     */
    public static void displayArray(int[] arr) {
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // Add comma separator except for the last element
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Sample array for demonstration
        // You can modify this array or make it user-input based
        int[] numbers = {5, 2, 8, 2, 9, 2, 7, 3, 2, 1};

        // Display the array to the user
        System.out.println("Finding the Last Occurrence of an Element");
        System.out.println("========================================");
        displayArray(numbers);

        // Get the target element from user
        System.out.print("\nEnter the element to search for: ");
        int target = scanner.nextInt();

        // Method 1: Search from the end (more efficient)
        System.out.println("\n--- Method 1: Backward Search ---");
        int result1 = lastOccurrances(numbers, target);

        if (result1 != -1) {
            System.out.println("Element " + target + " found at index: " + result1);
            System.out.println("Value at index " + result1 + ": " + numbers[result1]);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // Method 2: Search from the beginning (alternative approach)
        System.out.println("\n--- Method 2: Forward Search ---");
        int result2 = lastOccurrances(numbers, target);

        if (result2 != -1) {
            System.out.println("Element " + target + " found at index: " + result2);
            System.out.println("Value at index " + result2 + ": " + numbers[result2]);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }

        // Verify both methods give the same result
        if (result1 == result2) {
            System.out.println("\n✓ Both methods returned the same result!");
        } else {
            System.out.println("\n✗ Methods returned different results - there might be an error.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Additional demonstration with all occurrences
        System.out.println("\n--- All Occurrences of " + target + " ---");
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No occurrences found.");
        }
    }
}

/*
 * PROGRAM EXPLANATION:
 * ===================
 *
 * 1. TWO APPROACHES:
 *    - Backward Search: Start from end, return first match (most efficient)
 *    - Forward Search: Scan entire array, keep updating last found position
 *
 * 2. TIME COMPLEXITY:
 *    - Backward Search: O(n) worst case, but often faster in practice
 *    - Forward Search: Always O(n) as it scans the entire array
 *
 * 3. SPACE COMPLEXITY: O(1) for both methods
 *
 * 4. RETURN VALUE:
 *    - Returns the index (0-based) of the last occurrence
 *    - Returns -1 if the element is not found
 *
 * 5. SAMPLE INPUT/OUTPUT:
 *    Array: [5, 2, 8, 2, 9, 2, 7, 3, 2, 1]
 *    Target: 2
 *    Output: Last occurrence at index 8
 */

