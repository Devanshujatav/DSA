package com.devanshu.code.Prefix_Sum;

public class PrefixSum {
    // Method 1: Create new array for prefix sums
    public static int[] prefixSum(int[] arr) {
        if (arr.length == 0) return new int[0];

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    // Method 2: In-place modification
    public static void prefixSumInPlace(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }
}



