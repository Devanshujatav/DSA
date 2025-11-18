package com.devanshu.code.Sliding_Window_Maximum;

public class Main {
    public static void main(String[] args) {

        SlidingWindowMaximum swm = new SlidingWindowMaximum();

        int[] nums = {1, 2, 3, 1, 4, 5, 2, 3, 6};

        int k = 3;

        int[] result = swm.findMaximum(nums , k);

        for (int val : result){
            System.out.print(val + " ");
        }
    }
}
