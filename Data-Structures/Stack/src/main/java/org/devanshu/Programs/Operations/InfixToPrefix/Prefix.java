package org.devanshu.Programs.Operations.InfixToPrefix;

import java.util.Stack;

public class Prefix {
    public String infixToPrefix(String infix){
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

                    String prefix = o + v1 + v2;

                    values.push(prefix);
                }
                operators.pop();
            } else {
                if (ch == '+' || ch == '-'){
                    String v2 = values.pop();
                    String v1 = values.pop();
                    char o = operators.pop();

                    String prefix = o + v1 + v2;

                    values.push(prefix);
                    operators.push(ch);
                }

                if (ch == '*' || ch == '/'){
                    if (operators.peek() == '*' || operators.peek() == '/'){
                        String v2 = values.pop();
                        String v1 = values.pop();
                        char o = operators.pop();

                        String prefix = o + v1 + v2;
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

            String prefix = o + v1 + v2;
            values.push(prefix);
        }
        String prefix = values.pop();
        return prefix;
    }

    public int prefixEvaluation(String prefix){
        Stack<Integer> values = new Stack<>();

        for (int i=prefix.length() - 1 ; i>=0 ; i--){
            char ch = prefix.charAt(i);

            if (ch == ' ') continue;


            if (Character.isDigit(ch)){
                values.push(ch - '0');
            }else {
                int val1 = values.pop();
                int val2 = values.pop();

                switch (ch) {
                    case '+': values.push(val1 + val2); break;
                    case '-': values.push(val1 - val2); break;
                    case '*': values.push(val1 * val2); break;
                    case '/': values.push(val1 / val2); break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + ch);
                }
            }
        }

        int evaluationResult = values.pop();
        return evaluationResult;
    }
}
