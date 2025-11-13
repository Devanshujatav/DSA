package org.devanshu.Programs.Operations.InfixToPostFix;

import java.util.Stack;

public class Postfix {
    public String infixToPostfix(String infix){
        Stack<String> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i=0 ; i<infix.length() ; i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57){
                String s = " " + ch;
                values.push(s);
            } else if (operators.isEmpty() || operators.peek() == '(' || ch=='(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '('){
                    String v2 = values.pop();
                    String v1 = values.pop();
                    char o = operators.pop();

                    String prefix = v1 + v2 + o;

                    values.push(prefix);
                }
                operators.pop();
            } else {
                if (ch == '+' || ch == '-'){
                    String v2 = values.pop();
                    String v1 = values.pop();
                    char o = operators.pop();

                    String prefix = v1 + v2 + o;

                    values.push(prefix);
                    operators.push(ch);
                }

                if (ch == '*' || ch == '/'){
                    if (operators.peek() == '*' || operators.peek() == '/'){
                        String v2 = values.pop();
                        String v1 = values.pop();
                        char o = operators.pop();

                        String prefix = v1 + v2 + o;
                        values.push(prefix);
                        operators.push(ch);
                    }else{
                        operators.push(ch);
                    }
                }
            }
        }

        while (values.size() > 1){
            String v2 = values.pop();
            String v1 = values.pop();
            char o = operators.pop();

            String prefix = v1 + v2 + o;
            values.push(prefix);
        }
        String prefix = values.pop();
        return prefix;
    }
}
