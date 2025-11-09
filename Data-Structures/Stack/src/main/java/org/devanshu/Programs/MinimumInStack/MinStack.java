package org.devanshu.Programs.MinimumInStack;

import java.util.Stack;

// Approch 2
//public class MinStack {
//    Stack<Integer> st = new Stack<>();
//    Stack<Integer> min = new Stack<>();
//
//    public MinStack() {
//
//    }
//
//    public void push(int val) {
//        if (st.isEmpty()){
//            st.push(val);
//            min.push(val);
//        }else{
//            st.push(val);
//            if(min.peek() < val){
//                min.push(min.peek());
//            }else{
//                min.push(val);
//            }
//        }
//    }
//
//    public void pop() {
//        st.pop();
//        min.pop();
//    }
//
//    public int top() {
//        return st.peek();
//    }
//
//    public int getMin() {
//        return min.peek();
//    }
//}


// Approch 3

public class MinStack {
    Stack<Long> st = new Stack<>();
    long min = -1;
    public void MinStack(){
        // Default Constructor
    }

    public void push(int val){
        long x = (long) val;
        if (st.isEmpty()){
            st.push(x);
            min = x;
        } else if (x >= min) {
            st.push(x);
        } else if (x < min) {
            st.push(2*x - min);
            min = x;
        }
    }

    public void pop(){
        if (st.isEmpty()){
            return;
        } else if (st.peek() >= min) {
            st.pop();
        } else if (st.peek() < min) {
            long old = (2*min) - st.peek();
            min = old;
            st.pop();
        }
    }

    public int top(){
        if (st.isEmpty()){
            return -1;
        }

        long q = st.peek();

        if (q >= min){
            return (int)q;
        }

        if (q<min){
            return (int)min;
        }

        return 0;
    }

    public int getMin(){
        if (st.isEmpty()){
            return -1;
        }
        return (int)min;
    }
}