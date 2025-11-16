package org.devanshu.Programs.Operations.InfixToPostFix;

public class Main {
    public static void main(String[] args) {
        Postfix p = new Postfix();
        String infix = "9-(5+3)*4/6";
        String postfixString = p.infixToPostfix(infix);
        int postfixEvaluation = p.postfixEvaluation(postfixString);

        System.out.println("POSTFIX OPERATIONS");
        System.out.println("------------------------");
        System.out.println("Infix : " + infix);
        System.out.println("------------------------");
        System.out.println("Postfix : " + postfixString);
        System.out.println("------------------------");
        System.out.println("Postfix Evaluation : " + postfixEvaluation);
        System.out.println("------------------------");
//        System.out.println("Prefix To Postfix : " + );
//        System.out.println("------------------------");
    }
}
