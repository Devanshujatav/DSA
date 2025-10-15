package org.devanshu.Implementation.BuiltInStack.Implementation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        BuiltInStack stk = new BuiltInStack();

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        System.out.println("----------------------");

        System.out.println("For Reverse Method");
        System.out.println("----------------------");


        System.out.println("Origional Stack : " + st);


        System.out.println("Reverse Stack : " + stk.reverse(st));



        System.out.println("-------------------");


        System.out.println("For Copy Method");

        System.out.println("-------------------");

        // Stack for copy method
        Stack<Integer> st2 = new Stack<>();

        st2.push(1);
        st2.push(2);
        st2.push(3);
        st2.push(4);
        st2.push(5);

        System.out.println("Origional Stack : " + st2);


        System.out.println("Copy Stack : " + stk.copy(st2));
    }
}
