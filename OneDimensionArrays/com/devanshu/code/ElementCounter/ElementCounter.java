package com.devanshu.code.ElementCounter;

import java.util.*;

public class ElementCounter {

    // Method 1: Count occurrences in an integer array
    public static int countOccurrences(int[] arr , int target){
        int count=0;
        for (int val : arr){
            if (val == target){
                count++;
            }
        }

        return count;
    }


    // Method 2: Count occurrences in a generic array (works with any object type)
    public static <T> int countOccurrencesGeneric(T[] array , T target){
        int count=0;
        for (T val : array){
            if (Objects.equals(val , target)){
                count++;
            }
        }

        return count;
    }

    // Method 3: Count occurrences in a List
    public static <T> int countOccurrencesGenericList(List<T> list, T target) {
        int count = 0;
        for (T element : list) {
            if (Objects.equals(element, target)) {
                count++;
            }
        }
        return count;
    }

    // Method 4: Using Java 8 Streams (more modern approach)
    public static <T> long countOccurrencesStream(List<T> list , T target){
        return list.stream().filter(element -> Objects.equals(element , target)).count();
    }

    // Method 5: Using Collections.frequency() - built-in Java method
    public static <T> int countOccurrencesBuiltIn(List<T> list, T target) {
        return Collections.frequency(list, target);
    }

    public static void main(String[] args) {
        // Example 1: Integer array
        int[] intArray = {1, 2, 3, 2, 4, 2, 5, 2};
        int targetInt = 2;
        System.out.println("Integer Array: " + Arrays.toString(intArray));
        System.out.println("Count of " + targetInt + ": " + countOccurrences(intArray, targetInt));
        System.out.println();

        // Example 2: String array
        String[] stringArray = {"apple", "banana", "apple", "orange", "apple", "grape"};
        String targetString = "apple";
        System.out.println("String Array: " + Arrays.toString(stringArray));
        System.out.println("Count of \"" + targetString + "\": " + countOccurrencesGeneric(stringArray, targetString));
        System.out.println();

        // Example 3: List with different approaches
        List<Integer> numberList = Arrays.asList(10, 20, 10, 30, 10, 40, 10);
        int targetNumber = 10;
        System.out.println("Number List: " + numberList);
        System.out.println("Count using loop: " + countOccurrencesGenericList(numberList, targetNumber));
        System.out.println("Count using streams: " + countOccurrencesStream(numberList, targetNumber));
        System.out.println("Count using Collections.frequency(): " + countOccurrencesBuiltIn(numberList, targetNumber));
        System.out.println();

        // Example 4: Case with null values
        List<String> listWithNulls = new ArrayList<>();
        listWithNulls.add("hello");
        listWithNulls.add(null);
        listWithNulls.add("world");
        listWithNulls.add(null);
        listWithNulls.add("hello");

        System.out.println("List with nulls: " + listWithNulls);
        System.out.println("Count of null: " + countOccurrencesStream(listWithNulls, null));
        System.out.println("Count of \"hello\": " + countOccurrencesStream(listWithNulls, "hello"));

        // Interactive example
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter numbers separated by spaces: ");
        String input = scanner.nextLine();

        if (!input.trim().isEmpty()) {
            String[] inputArray = input.split("\\s+");
            List<String> inputList = Arrays.asList(inputArray);

            System.out.print("Enter the element to count: ");
            String searchElement = scanner.nextLine();

            int occurrences = countOccurrencesGenericList(inputList, searchElement);
            System.out.println("The element \"" + searchElement + "\" occurs " + occurrences + " times.");
        }

        scanner.close();
    }

}

