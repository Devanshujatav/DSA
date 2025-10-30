package org.devanshu.Programs.CountUnbalancedBrackets;

import java.util.Stack;

public class CountUnbalancedBrackets {

    public void countUnbalancedBrackets(String str){
        Stack<Character> st = new Stack<>();
        int unmatchedClosingBrackets = 0;

        for (int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if (ch == '('){
                st.push(ch);
            }else if (!st.isEmpty()  && st.peek() == '(') {
                st.pop();
            }else {
                unmatchedClosingBrackets++;
            }
        }

        int totalBrackets = st.size() + unmatchedClosingBrackets;

        if (totalBrackets == 0){
            System.out.println("Brackets are Balanced");
        }else {
            System.out.println(totalBrackets + " are Unbalanced Brackets");
        }
    }
}
