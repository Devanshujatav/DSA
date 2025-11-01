package org.devanshu.Programs.NextGreaterElement;

import java.util.Stack;

public class NextGreaterElement {
    public int[] findNextGreaterElement(int[] arr){
        int[] result = new int[arr.length];
        result[result.length-1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);

        for (int i= arr.length-2 ; i>=0 ; i--){
            while (st.peek() < arr[i] && !st.isEmpty()){
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
}
