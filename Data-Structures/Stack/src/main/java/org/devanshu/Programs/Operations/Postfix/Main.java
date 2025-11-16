package org.devanshu.Programs.Operations.Postfix;

public class Main {
    public static void main(String[] args) {
        Postfix p = new Postfix();
        String infix = "9-(5+3)*4/6";
        String postfixString = p.infixToPostfix(infix);
        int postfixEvaluation = p.postfixEvaluation(postfixString);
        String prefix = p.postfixToPrefix(postfixString);
        String infixString = p.postfixToInfix(postfixString);

        System.out.println("POSTFIX OPERATIONS");
        System.out.println("------------------------");
        System.out.println("Infix : " + infix);
        System.out.println("------------------------");
        System.out.println("Postfix : " + postfixString);
        System.out.println("------------------------");
        System.out.println("Postfix Evaluation : " + postfixEvaluation);
        System.out.println("------------------------");
        System.out.println("Postfix To Prefix : " + prefix);
        System.out.println("------------------------");
        System.out.println("Postfix To Infix : " + infixString);
        System.out.println("------------------------");
    }
}
