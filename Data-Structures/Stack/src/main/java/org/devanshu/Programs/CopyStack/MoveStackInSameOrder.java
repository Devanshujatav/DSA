package org.devanshu.Programs.CopyStack;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOrder {

    public Stack<Integer> addElements(int n){
        Stack<Integer> st = new Stack<>();

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

    public Stack<Integer> reverse(Stack<Integer> st){
        Stack<Integer> rst = new Stack<>();
        while (st.size() > 0){
//            int x = st.peek();
//            rst.push(x);
//            st.pop();
            rst.push(st.pop());
        }

        return rst;
    }


    public Stack<Integer> copy(Stack<Integer> st){
        Stack<Integer> cst = new Stack<>();
        Stack<Integer> rst = reverse(st);
        while (rst.size() > 0){
            cst.push(rst.pop());
        }

        return cst;
    }

}
