package org.devanshu.Programs.Operations.InfixToPostFix;

public class Main {
    public static void main(String[] args) {
        Postfix p = new Postfix();
        String infix = "9-(5+3)*4/6";
        String postfixString = p.infixToPostfix(infix);
        int postfixEvaluation = p.postfixEvaluation(postfixString);

        System.out.println("Infix : " + infix);
        System.out.println("Postfix : " + postfixString);
        System.out.println("Postfix Evaluation : " + postfixEvaluation);
    }
}
