package org.devanshu.Programs.Operations.InfixOperation;

import java.util.Stack;

public class InfixOperation {
    public int calculateInfix(String str){
        Stack<Integer> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii<=57){
                values.push(ascii-48);
            } else if (operators.isEmpty() || operators.peek() == '(' || ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                int v2 = values.pop();
                int v1 = values.pop();

                while (operators.peek() != '('){
                    if (operators.peek() == '+'){
                        values.push(v1+v2);
                    }

                    if (operators.peek() == '-'){
                        values.push(v1-v2);
                    }

                    if (operators.peek() == '*'){
                        values.push(v1*v2);
                    }

                    if (operators.peek() == '/'){
                        values.push(v1/v2);
                    }
                    operators.pop();
                }
                operators.pop();
            } else {
                if (ch == '+' || ch=='-'){
                    int v2 = values.pop();
                    int v1 = values.pop();

                    if (operators.peek() == '+'){
                        values.push(v1+v2);
                    }

                    if (operators.peek() == '-'){
                        values.push(v1-v2);
                    }

                    if (operators.peek() == '*'){
                        values.push(v1*v2);
                    }

                    if (operators.peek() == '/'){
                        values.push(v1/v2);
                    }

                    operators.pop();
                    operators.push(ch);
                }

                if (ch == '*' || ch == '/'){
                    if (operators.peek() == '*' || operators.peek()=='/'){
                        int v2 = values.pop();
                        int v1 = values.pop();

                        if (operators.peek() == '*'){
                            values.push(v1*v2);
                        }

                        if (operators.peek() == '/'){
                            values.push(v1/v2);
                        }
                        operators.pop();
                        operators.push(ch);
                    }else {
                        operators.push(ch);
                    }
                }
            }
        }

        while (values.size() > 1){
            int v2 = values.pop();
            int v1 = values.pop();

            if (operators.peek() == '+'){
                values.push(v1+v2);
            }

            if (operators.peek() == '-'){
                values.push(v1-v2);
            }

            if (operators.peek() == '*'){
                values.push(v1*v2);
            }

            if (operators.peek() == '/'){
                values.push(v1/v2);
            }

            operators.pop();
        }

        return values.peek();
    }
}
