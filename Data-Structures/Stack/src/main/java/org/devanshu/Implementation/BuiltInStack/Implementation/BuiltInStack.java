package org.devanshu.Implementation.BuiltInStack.Implementation;

import java.util.Scanner;
import java.util.Stack;

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


    public Stack<Integer> insertAt(Stack<Integer> st , int index , int value){
        Stack<Integer> temp = new Stack<>();
        while (st.size() > index){
            temp.push(st.pop());
        }
        st.push(value);

        while(!temp.isEmpty()){
            st.push(temp.pop());
        }

        return st;
    }

    public void insertRecursively(Stack<Integer> st, int index, int value) {
        // ✅ Base Case
        if (st.size() == index) {
            st.push(value);
            return;
        }

        // ✅ Pop the top element
        int top = st.pop();

        // ✅ Recursive call
        insertRecursively(st, index, value);

        // ✅ Push back the popped element
        st.push(top);
    }


    public void display(Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()){
            temp.push(st.pop());
        }

        while (!temp.isEmpty()){
            int x = temp.pop();
            System.out.print(x + " ");
            st.push(x);
        }
    }

    public void displayThroughArray(Stack<Integer> st){
        int n = st.size();
        int[] arr = new int[n];

        for (int i=n-1 ; i>=0 ; i--){
            arr[i] = st.pop();
        }

        for (int i=0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
            st.push(arr[i]);
        }
    }

    public void displayReverseRecursively(Stack<Integer> st){
        // BASE CASE
        if (st.isEmpty()) return;

        // SELF WORK
        int topElement = st.pop();
        System.out.print(topElement + " ");

        // RECURSIVE WORK
        displayReverseRecursively(st);

        // SELF WORK
        st.push(topElement);
    }


    public void displayRecursively(Stack<Integer> st){
        // BASE CASE
        if (st.isEmpty()){
            return;
        }

        // SELF WORK
        int topElement = st.pop();

        // RECURSIVE WORK
        displayRecursively(st);

        // SELF WORK
        System.out.print(topElement + " ");
        st.push(topElement);
    }


}
