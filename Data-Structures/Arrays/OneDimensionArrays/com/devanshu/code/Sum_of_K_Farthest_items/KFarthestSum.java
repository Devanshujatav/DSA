package com.devanshu.code.Sum_of_K_Farthest_items;

import java.util.Arrays;

public class KFarthestSum {

    public static void prefixSumInPlace(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
    }

    private static int kFarthestSum(int[] arr , int k , int n){
        Arrays.sort(arr);

        prefixSumInPlace(arr);

        return arr[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {21,4,15,17,11};

        int kSum = kFarthestSum(arr , 20 , 3);

        System.out.println(kSum);
    }
}
