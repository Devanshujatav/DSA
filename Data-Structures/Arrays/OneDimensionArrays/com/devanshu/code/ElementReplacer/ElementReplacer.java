package com.devanshu.code.ElementReplacer;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ElementReplacer {

    /**
     * Replace elements in an integer array (in-place modification)
     * @param arr The array to modify
     * @param oldValue The value to replace
     * @param newValue The replacement value
     * @return Number of replacements made
     */
    public static int replaceInArray(int[] arr , int oldValue , int newValue){
        int replacements = 0;
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] == oldValue){
                arr[i] = newValue;
                replacements++;
            }
        }
        return replacements;
    }



    /**
     * Generic method to replace elements in any array type (in-place)
     * @param array The array to modify
     * @param oldValue The value to replace
     * @param newValue The replacement value
     * @return Number of replacements made
     */
    public static <T> int replaceInArrayGeneric(T[] array , T oldValue , T newValue){
        int replacements = 0;
        for (int i=0 ; i<array.length ; i++){
            if (Objects.equals(array[i] , oldValue)){
                array[i] = newValue;
                replacements++;
            }
        }
        return replacements;
    }

    /**
     * Create a new array with replacements (non-destructive)
     * @param original The original array
     * @param oldValue The value to replace
     * @param newValue The replacement value
     * @return New array with replacements
     */
    public static <T> List<T> replaceInNewArray(T[] original, T oldValue, T newValue) {
        @SuppressWarnings("unchecked")
//        T[] newArray = (T[]) new Object[original.length];

        List<T> newList = new ArrayList<>();
        for (int i = 0; i < original.length; i++) {
            if (Objects.equals(original[i], oldValue)) {
//                newArray[i] = newValue;
                newList.set(i , newValue);
            } else {
//                newArray[i] = original[i];
                newList.set(i , newValue);
            }
        }
        return newList;
    }

    // ====== LIST REPLACEMENT METHODS ======

    /**
     * Replace elements in a List (in-place modification)
     * @param list The list to modify
     * @param oldValue The value to replace
     * @param newValue The replacement value
     * @return Number of replacements made
     */
    public static <T> int replaceInList(List<T> list, T oldValue, T newValue) {
        int replacements = 0;
        for (int i = 0; i < list.size(); i++) {
            if (Objects.equals(list.get(i), oldValue)) {
                list.set(i, newValue);
                replacements++;
            }
        }
        return replacements;
    }

    /**
     * Replace using Java 8 Streams (creates new list)
     * @param list The original list
     * @param oldValue The value to replace
     * @param newValue The replacement value
     * @return New list with replacements
     */
    public static <T> List<T> replaceWithStreams(List<T> list , T oldValue , T newValue){
        return list.stream().map(element -> Objects.equals(element , oldValue) ? newValue : oldValue).collect(Collectors.toList());
    }

    /**
     * Replace using Collections.replaceAll() - built-in method
     * @param list The list to modify
     * @param oldValue The value to replace
     * @param newValue The replacement value
     * @return True if any replacements were made
     */
    public static <T> boolean replaceUsingCollections(List<T> list, T oldValue, T newValue) {
        return Collections.replaceAll(list, oldValue, newValue);
    }

    /**
     * Replace with condition (using predicate)
     * @param list The list to modify
     * @param condition The condition for replacement
     * @param newValue The replacement value
     * @return Number of replacements made
     */
    public static <T> int replaceWithCondition(List<T> list,
                                               java.util.function.Predicate<T> condition,
                                               T newValue) {
        int replacements = 0;
        for (int i = 0; i < list.size(); i++) {
            if (condition.test(list.get(i))) {
                list.set(i, newValue);
                replacements++;
            }
        }
        return replacements;
    }

    /**
     * Print array contents with a label
     */
    public static <T> void printArray(String label, T[] array) {
        System.out.println(label + ": " + Arrays.toString(array));
    }


    /**
     * Demonstrate array replacement
     */
    public static void demonstrateArrayReplacement() {
        System.out.println("=== ARRAY REPLACEMENT DEMONSTRATION ===");

        // Integer array example
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        System.out.println("Original array: " + Arrays.toString(numbers));
        int replacements = replaceInArray(numbers, 2, 99);
        System.out.println("After replacing 2 with 99: " + Arrays.toString(numbers));
        System.out.println("Number of replacements: " + replacements);
        System.out.println();

    }

    /**
     * Demonstrate list replacement
     **/

    public static void demonstrateListReplacement() {
        System.out.println("=== LIST REPLACEMENT DEMONSTRATION ===");

        // Basic list replacement
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 10));
        System.out.println("Original list: " + numbers);
        int replacements = replaceInList(numbers, 10, 100);
        System.out.println("After replacing 10 with 100: " + numbers);
        System.out.println("Number of replacements: " + replacements);
        System.out.println();

        // Using Collections.replaceAll
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "pear", "apple", "grape", "apple"));
        System.out.println("Original fruits: " + fruits);
        boolean hasReplacements = replaceUsingCollections(fruits, "apple", "mango");
        System.out.println("After using Collections.replaceAll: " + fruits);
        System.out.println("Replacements made: " + hasReplacements);
        System.out.println();

        // Using streams (creates new list)
        List<Integer> originalNumbers = Arrays.asList(5, 10, 5, 15, 5);
        List<Integer> modifiedNumbers = replaceWithStreams(originalNumbers, 5, 50);
        System.out.println("Original (unchanged): " + originalNumbers);
        System.out.println("Stream result (new list): " + modifiedNumbers);
        System.out.println();

        // Conditional replacement
        List<Integer> scores = new ArrayList<>(Arrays.asList(85, 92, 78, 96, 89, 74));
        System.out.println("Original scores: " + scores);
        int conditionalReplacements = replaceWithCondition(scores,
                score -> score < 80,
                80);
        System.out.println("After replacing scores < 80 with 80: " + scores);
        System.out.println("Conditional replacements: " + conditionalReplacements);
        System.out.println();
    }


    public static void main(String[] args) {
        demonstrateArrayReplacement();
        demonstrateListReplacement();

        System.out.println("Program completed successfully!");
    }



}
