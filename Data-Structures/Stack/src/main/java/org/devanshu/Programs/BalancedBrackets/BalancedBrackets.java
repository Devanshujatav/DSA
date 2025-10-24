package org.devanshu.Programs.BalancedBrackets;

import java.util.Stack;

public class BalancedBrackets {
    public boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        for (int i=0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            if (ch == '('){
                st.push(ch);
            }else{
                if (st.isEmpty()){
                    return false;
                }
                if (st.peek() == '('){
                    st.pop();
                }
            }
        }
        if (st.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
