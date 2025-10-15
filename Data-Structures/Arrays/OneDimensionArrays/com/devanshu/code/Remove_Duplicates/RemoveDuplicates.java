package com.devanshu.code.Remove_Duplicates;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    // Approch 1 :  Through Functional Programming
//    public static int[] removeDuplicate(int[] arr){
//        return Arrays.stream(arr).distinct().toArray();
//    }

    // Approch 2
//    public static int[] removeDuplicate(int[] arr){
//        Arrays.sort(arr);
//        int n = arr.length;
//        int k = 0;
//        for (int i=0 ; i<n ; i++){
//            if (i==0 || arr[i]!=arr[i-1]){
//                arr[k++] = arr[i];
//            }
//        }
//
//        return Arrays.copyOf(arr , k);
//    }

    // Approch 3
    public static int[] removeDuplicate(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr){
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i=0;
        for (int num : set){
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,1,3,2};
        int[] result = removeDuplicate(arr);
        for (int val : result){
            System.out.println(val);
        }
    }
}
