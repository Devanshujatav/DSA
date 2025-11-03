package org.devanshu.Programs.StockSpan;

import java.util.ArrayList;

public class Main {

    // Utility method to print ArrayList
    public static void printList(ArrayList<Integer> list, String label) {
        System.out.print(label + ": ");
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Utility method to print array
    public static void printArray(int[] arr, String label) {
        System.out.print(label + ": ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        StockSpan span = new StockSpan();

        // Test Case 1
        System.out.println("===== Test Case 1 =====");
        int[] prices1 = {100, 80, 60, 70, 60, 75, 85};
        printArray(prices1, "Prices");

        ArrayList<Integer> span1 = span.findSpan(prices1);
        printList(span1, "Span (Stack)");

        System.out.println("\nExplanation:");
        for (int i = 0; i < prices1.length; i++) {
            System.out.println("Day " + i + " (price=" + prices1[i] + "): span=" + span1.get(i));
        }

        // Test Case 2
        System.out.println("\n===== Test Case 2 =====");
        int[] prices2 = {10, 4, 5, 90, 120, 80};
        printArray(prices2, "Prices");
        ArrayList<Integer> span2 = span.findSpan(prices2);
        printList(span2, "Span");

        // Test Case 3 - Increasing prices
        System.out.println("\n===== Test Case 3 (Increasing) =====");
        int[] prices3 = {10, 20, 30, 40, 50};
        printArray(prices3, "Prices");
        ArrayList<Integer> span3 = span.findSpan(prices3);
        printList(span3, "Span");

        // Test Case 4 - Decreasing prices
        System.out.println("\n===== Test Case 4 (Decreasing) =====");
        int[] prices4 = {50, 40, 30, 20, 10};
        printArray(prices4, "Prices");
        ArrayList<Integer> span4 = span.findSpan(prices4);
        printList(span4, "Span");

        // Test Case 5 - Single element
        System.out.println("\n===== Test Case 5 (Single Element) =====");
        int[] prices5 = {100};
        printArray(prices5, "Prices");
        ArrayList<Integer> span5 = span.findSpan(prices5);
        printList(span5, "Span");
    }
}
