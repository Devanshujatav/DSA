package com.devanshu.code.Sliding_Window_Maximum;

public class SlidingWindowMaximum {
    public int[] findMaximum(int[] arr , int k){
        int n = arr.length;

        // n-(k-1) = n-k+1
        int[] ans = new int[n-k+1];

        int z = 0;

        for (int i=0 ; i<n-k+1 ; i++){
            int max = Integer.MIN_VALUE;
            for (int j=i ; j<i+k ; j++){
                max = Math.max(max , arr[j]);
            }
            ans[z++] = max;
        }

        return ans;
    }
}
