package org.devanshu.code.Patterns;

public class AlternateZeroOnePattern {

    public static void buildPattern(int size){
        for (int i=1 ; i<=size ; i++){
            for (int j=1 ; j<=size ; j++){
                if ((i+j) % 2 ==0){
                    System.out.print(1 + " ");
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 5;
        buildPattern(size);
    }
}
