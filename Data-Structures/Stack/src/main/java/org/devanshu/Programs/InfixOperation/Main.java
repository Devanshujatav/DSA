package org.devanshu.Programs.InfixOperation;

public class Main {
    public static void main(String[] args) {
        InfixOperation infixOps = new InfixOperation();
        String str = "9-5+3*4/6";

        int calculate = infixOps.calculateInfix(str);

        System.out.println(calculate);

    }
}
