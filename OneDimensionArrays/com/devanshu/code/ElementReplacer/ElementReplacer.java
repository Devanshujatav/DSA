package com.devanshu.code.ElementReplacer;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
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
    public static <T> T[] replaceInNewArray(T[] original, T oldValue, T newValue) {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[original.length];

        for (int i = 0; i < original.length; i++) {
            if (Objects.equals(original[i], oldValue)) {
                newArray[i] = newValue;
            } else {
                newArray[i] = original[i];
            }
        }
        return newArray;
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
    public static <T> List<T> replaceWithStream(List<T> list , T oldValue , T newValue){
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
}
