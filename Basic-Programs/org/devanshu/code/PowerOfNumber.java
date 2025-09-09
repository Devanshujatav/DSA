package org.devanshu.code;

public class PowerOfNumber {

    public int getPower(int base , int exponent){
        int ans = 1;
        for (int i=0 ; i<exponent ; i++){
            ans *= base;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
