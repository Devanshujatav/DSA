package org.devanshu.Programs.CopyStack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        MoveStackInSameOrder stk = new MoveStackInSameOrder();

//        System.out.println("Origional Stack : " + stk.addElements(5));


        // Stack for reverse method
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // Stack for copy method
        Stack<Integer> st2 = new Stack<>();

        st2.push(1);
        st2.push(2);
        st2.push(3);
        st2.push(4);
        st2.push(5);



        System.out.println("Origional Stack : " + st2);

//        System.out.println("----------------------------------------------------------------------------------------");

//        System.out.println("Reverse Stack : " + stk.reverse(st));




        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Copy Stack : " + stk.copy(st2));

    }

}
