package com.devanshu.code.FindUnique;

public class FindSingleElement {
    // Approach 1: Using XOR (Most efficient - O(n) time, O(1) space)
    public static int findSingleElementXOR(int[] nums){
        int result = 0;

        for (int num : nums){
            result ^= num;
        }

        return result;
    }
}
