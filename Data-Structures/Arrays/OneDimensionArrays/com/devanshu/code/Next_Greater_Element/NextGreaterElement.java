package com.devanshu.code.Next_Greater_Element;

public class NextGreaterElement {

    private static int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        for (int i=0 ; i<n ; i++){
            result[i] = -1;
            for (int j=i+1 ; j<n ; j++){
                if (arr[j] > arr[i]){
                    result[i] = arr[j];
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};

        int[] ans = nextGreaterElement(arr);

        for (int val : ans){
            System.out.print(val + " ");
        }
    }
}
