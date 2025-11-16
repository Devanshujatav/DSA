package org.devanshu.Programs.Operations.InfixToPrefix;

public class Main {
    public static void main(String[] args) {
        Prefix p = new Prefix();
        String infix = "9-(5+3)*4/6";
        String prefixedString = p.infixToPrefix(infix);
        int prefixEvaluation = p.prefixEvaluation(prefixedString);
        String postfix = p.prefixToPostfix(prefixedString);

        System.out.println("PREFIX OPERATIONS");
        System.out.println("------------------------");
        System.out.println("Infix : " + infix);
        System.out.println("------------------------");
        System.out.println("Prefix : " + prefixedString);
        System.out.println("------------------------");
        System.out.println("Prefix Evaluation : " + prefixEvaluation);
        System.out.println("------------------------");
        System.out.println("Prefix To Postfix : " + postfix);
        System.out.println("------------------------");
    }
}
