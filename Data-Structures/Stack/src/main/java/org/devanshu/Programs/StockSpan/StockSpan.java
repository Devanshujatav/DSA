package org.devanshu.Programs.StockSpan;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public ArrayList<Integer> findSpan(int[] prices){
        int n = prices.length;
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i=0 ; i<n ; i++){
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]){
                st.pop();
            }

            if (st.isEmpty()){
                span.add(i+1);
            }else {
                span.add(i-st.peek());
            }
            st.push(i);
        }
        return span;
    }
}
