package org.devanshu.code;

public class Factorial {

    public static int getFactorial(int number){

        int product = 1;

        for (int i=1 ; i<=number ; i++){
            product *= i;
        }

        return product;
    }

    public static void main(String[] args) {
        int number = 5;
        int ans = getFactorial(number);
        System.out.println(ans);
    }
}
