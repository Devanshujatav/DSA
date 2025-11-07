package org.devanshu.Programs.PreviousSmallerElement;

import java.util.Stack;

public class PreviousSmallerElement {
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
}
