package org.devanshu.code.Patterns;

public class LeftTrianglePattern {
    public static void buildPattern(char ch , int size){
        for (int i=1 ; i<=size ; i++){
            for (int j=1 ; j<=i ; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char ch = '*';
        buildPattern(ch , 4);
    }
}
