package org.devanshu.code;

public class LargestInThree {
    public static void largestInThree(int a , int b , int c){

        // EDGE case
        if(a==b && b==c && c==a){
            System.out.println(a);
            return;
        }

        if (a>b && a>c){
            System.out.println(a);
        }else if(b>a && b>c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 4;

        largestInThree(a , b , c);
    }
}
