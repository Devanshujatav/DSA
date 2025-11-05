package org.devanshu.Programs.NextSmallerElement;

import java.util.Stack;

public class NextSmallerElement {
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
}
