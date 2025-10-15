package com.devanshu.code.CopyOfArrays;

import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.Arrays;

public class ArrayCopy {

    // Method 1: Manual copy using for loop
    public static int[] copyUsingLoop(int[] source){
        int[] destination = new int[source.length];

        for (int i=0 ; i< destination.length ; i++){
            destination[i] = source[i];
        }

        return destination;
    }

    // Method 2: Using System.arraycopy()
    public static int[] copyUsingSystemArrayCopy(int[] source){
        int[] destination = new int[source.length];

        System.arraycopy(source , 0 , destination , 0 , source.length);

        return destination;
    }

    // Method 3: Using Arrays.copyOf()
    public static int[] copyUsingArrayCopyOf(int[] source){
        return Arrays.copyOf(source , source.length);
    }

    // Method 4: Using clone()
    public static int[] copyUsingClone(int[] source){
        return source.clone();
    }

    // Method 5: Partial copy using System.arraycopy()
    public static int[] partialCopyUsingSystemArrayCopy(int[] source , int startIndex , int length){
        int[] destination = new int[length];

        System.arraycopy(source , startIndex , destination , 0 , length);

        return destination;
    }

    // Method 6: Copy to existing array
    public static void copyToExistingArray(int[] source , int[] destination){
        if (destination.length >= source.length){
            System.arraycopy(source , 0 , destination , 0 , source.length);
        }else {
            System.out.println("Array is too small");
        }
    }

    // Utility method to print array
    public static void printArray(int[] array) {
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Original array
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Source Array:");
        printArray(sourceArray);

        // Method 1: Using loop (manual copy)
        System.out.println("\n--- Method 1: Using Loop ---");
        int[] copyArray1 = copyUsingLoop(sourceArray);
        printArray(copyArray1);

        // Method 2: Using System.arraycopy()
        System.out.println("\n--- Method 2: Using System.arraycopy() ---");
        int[] copyArray2 = copyUsingSystemArrayCopy(sourceArray);
        printArray(copyArray2);

        // Method 3: Using Arrays.copyOf()
        System.out.println("\n--- Method 3: Using Arrays.copyOf() ---");
        int[] copyArray3 = copyUsingSystemArrayCopy(sourceArray);
        printArray(copyArray3);

        // Method 4: Using clone()
        System.out.println("\n--- Method 4: Using clone() ---");
        int[] copyArray4 = copyUsingClone(sourceArray);
        printArray(copyArray4);

        // Method 5: Partial copy using System.arraycopy()
        System.out.println("\n--- Method 5: Partial Copy (elements 2-6) ---");
        int[] partialCopy = partialCopyUsingSystemArrayCopy(sourceArray, 2, 5);
        printArray(partialCopy);

        // Method 6: Copy to existing array
        System.out.println("\n--- Method 6: Copy to existing array ---");
        int[] existingArray = new int[sourceArray.length];
        copyToExistingArray(sourceArray, existingArray);
        printArray(existingArray);
    }
}
