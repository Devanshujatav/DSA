 package org.devanshu.code.Patterns;

import java.sql.SQLOutput;

public class StarDiamondPattern {

    public static void buildPatternOne(int size){
        for (int i=1 ; i<=2*size-1 ; i++){
            for (int j=1 ; j<=2*size-1 ; j++){
                if ((i+j)>size && (j-i)<size && (i-j)<size &&(i+j) < 3*size){
                    System.out.print("*" + " ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    public static void buildPatternTwo(int size){
        // UPPER HALF
        for (int i=1 ; i<=size ; i++){
            for (int j=1 ; j<=size-i ; j++){
                System.out.print(" " + " ");
            }

            for (int j=1 ; j<=2*i-1 ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 3;
        buildPatternTwo(size);
    }
}
