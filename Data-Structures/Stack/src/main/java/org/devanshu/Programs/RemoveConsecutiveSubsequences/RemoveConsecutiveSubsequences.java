package org.devanshu.Programs.RemoveConsecutiveSubsequences;

import java.util.Stack;

public class RemoveConsecutiveSubsequences {

    public int[] remove(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();

        for (int i=0 ; i<n ; i++){
            if (st.isEmpty() || arr[i] != st.peek()){
                st.push(arr[i]);
            } else if (arr[i] == st.peek()) {
                if (i == n - 1 || arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }

        int[] res = new int[st.size()];
        for (int i=res.length-1 ; i>=0 ; i--){
            res[i] = st.pop();
        }

        return res;
    }
}
