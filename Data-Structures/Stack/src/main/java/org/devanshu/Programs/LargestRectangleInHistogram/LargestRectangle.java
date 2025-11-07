package org.devanshu.Programs.LargestRectangleInHistogram;

import java.util.Stack;

public class LargestRectangle {

    public int[] findNextSmaller(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        result[n-1] = n;

        Stack<Integer> st = new Stack<>();
        st.push(n-1);

        for (int i=n-2 ; i>=0 ; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                result[i] = n;
            }else {
                result[i] = st.peek();
            }

            st.push(i);
        }

        return result;
    }

    public int[] findPreviousSmaller(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        result[0] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i=1 ; i<=n-1 ; i++){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                result[i] = -1;
            }else {
                result[i] = st.peek();
            }

            st.push(i);
        }

        return result;

    }

    public int maxArea(int[] heights){

        int n = heights.length;

        int[] nse = findNextSmaller(heights);
        int[] pse = findPreviousSmaller(heights);

        int max = -1;

        for (int i=0 ; i<n ; i++){
            int area = heights[i] * (nse[i] - pse[i] -1);
            max = Math.max(max , area);
        }

        return max;
    }
}
