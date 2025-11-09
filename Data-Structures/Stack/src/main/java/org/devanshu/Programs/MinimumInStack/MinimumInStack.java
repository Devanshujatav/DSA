package org.devanshu.Programs.MinimumInStack;

import java.util.Stack;

public class MinimumInStack {
    // Approch 1
    public int getMinimum(Stack<Integer> st){
        Stack<Integer> helper = new Stack<>();
        int min = Integer.MAX_VALUE;

        for (int i=0 ; i<st.size() ; i++){
            int x = st.pop();
            if (x < min){
                min = x;
            }

            helper.push(x);
        }

        while(!helper.isEmpty()){
            st.push(helper.pop());
        }
        return min;
    }
}
