package org.devanshu.Programs.NextGreaterElement;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public int[] findNextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        result[result.length-1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);

        for (int i= arr.length-2 ; i>=0 ; i--){
            while (!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                result[i] = -1;
            }else {
                result[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return result;
    }


    /**
     * Alternative approach: Traverse from left to right
     * This stores indices in the stack instead of values
     */
    public int[] findNextGreaterElementLeftToRight(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        Arrays.fill(arr , -1);

        for (int i=0 ; i<n ; i++){
            while (!st.isEmpty() && arr[i] > arr[st.peek()]){
                int index = st.pop();
                result[index] = arr[i];
            }

            st.push(i);
        }

        return result;
    }
}
