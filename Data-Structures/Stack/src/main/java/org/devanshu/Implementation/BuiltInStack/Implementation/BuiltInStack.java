package org.devanshu.Implementation.BuiltInStack.Implementation;

import java.util.Scanner;

public class BuiltInStack {
    public java.util.Stack<Integer> addElements(int n){
        java.util.Stack<Integer> st = new java.util.Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the Stack : ");
        int size = sc.nextInt();

        System.out.print("Enter the Elements in the Stack : ");
        for (int i=0 ; i<n ; i++){
            int x = sc.nextInt();
            st.push(x);
        }

        return st;
    }

    public java.util.Stack<Integer> reverse(java.util.Stack<Integer> st){
        java.util.Stack<Integer> rst = new java.util.Stack<>();
        while (st.size() > 0){
//            int x = st.peek();
//            rst.push(x);
//            st.pop();
            rst.push(st.pop());
        }

        return rst;
    }


    public java.util.Stack<Integer> copy(java.util.Stack<Integer> st){
        java.util.Stack<Integer> cst = new java.util.Stack<>();
        java.util.Stack<Integer> rst = reverse(st);
        while (rst.size() > 0){
            cst.push(rst.pop());
        }

        return cst;
    }
}
