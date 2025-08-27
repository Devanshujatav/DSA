package com.devanshu.code.nth_Largest_and_nth_Smallest;

import java.util.Arrays;

public class nthLargestAndnthSmallest {

    private static void NthLargestNthSmallest(int[] arr , int n){
        Arrays.sort(arr);

        System.out.println(arr[n-1] +" "+ arr[arr.length - n]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        int n = 3;

        NthLargestNthSmallest(arr , n);

    }
}
