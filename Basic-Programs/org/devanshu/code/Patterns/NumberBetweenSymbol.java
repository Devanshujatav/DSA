package org.devanshu.code.Patterns;

public class NumberBetweenSymbol {

    public static void buildPattern(int size){
        int count = 1;
        for (int i=1 ; i<=size ; i++){
            for (int j=1 ; j<=i ; j++){
                if (j==1 || i==size || i==j){
                    System.out.print(1 + " ");
                }else {
                    System.out.print(count++ +" ");
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
