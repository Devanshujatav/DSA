package org.devanshu.code;

public class ArmstrongNumber {

    public static int countDigits(int number){
        int value = number;
        int digit = 0;
        int count = 0;

        while(value != 0){
            value/=10;
            count++;
        }

        return count;
    }

    public static boolean isArmstrong(int number){

        PowerOfNumber pn = new PowerOfNumber();
        int value = number;
        int digit = 0;
        int isResult = 0;
        int count = countDigits(number);

        while (value != 0){
            digit = value%10;
//            System.out.println("digit : " + digit);
            isResult += pn.getPower(digit , count);
//            System.out.println(isResult);
            value/=10;
        }

        if (isResult == number){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int number = 145;

        boolean ans = isArmstrong(number);
        System.out.println(ans);

    }
}
