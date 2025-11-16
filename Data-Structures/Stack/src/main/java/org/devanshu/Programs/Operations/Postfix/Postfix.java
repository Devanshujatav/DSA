package org.devanshu.Programs.Operations.Postfix;

import java.util.Stack;

public class Postfix {
    public String infixToPostfix(String infix){
        Stack<String> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i=0 ; i<infix.length() ; i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if (ascii>=48 && ascii<=57){
                String s = "" + ch;
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

    public int postfixEvaluation(String postfix){
        Stack<Integer> values = new Stack<>();

        for (int i=0 ; i<postfix.length() ; i++){
            char ch = postfix.charAt(i);
            int ascii = (int) ch;

            // skip spaces
            if (ch == ' ') continue;

            if (ascii >= 48 && ascii <= 57){
                values.push(ascii - 48);
            }else {
                int val2 = values.pop();
                int val1 = values.pop();

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

    public String postfixToPrefix(String postfix){
        Stack<String> values = new Stack<>();

        for (int i=0 ; i<postfix.length() ; i++){
            char ch = postfix.charAt(i);
            int ascii = (int) ch;

            if (ch == ' ') continue;;

            if (Character.isDigit(ch)){
                values.push(ch - '0' + "");
            }else {
                String val2 = values.pop();
                String val1 = values.pop();
                char op = ch;

                String prefix = op + val1 + val2;
                values.push(prefix);
            }
        }

        String prefix = values.pop();
        return prefix;
    }

    public String postfixToInfix(String postfix){
        Stack<String> values = new Stack<>();

        for (int i=0 ; i<postfix.length() ; i++){
            char ch = postfix.charAt(i);

            if (Character.isDigit(ch)){
                values.push(ch - '0' + "");
            }else {
                String val2 = values.pop();
                String val1 = values.pop();
                char op = ch;

                String infix = "(" + val1 + op + val2 + ")";
                values.push(infix);
            }
        }

        String infix = values.pop();
        return infix;
    }
}
