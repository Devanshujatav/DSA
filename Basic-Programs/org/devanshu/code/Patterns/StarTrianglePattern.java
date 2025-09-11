package org.devanshu.code.Patterns;

public class StarTrianglePattern {

    public static void buildPatternOne(int size){
        for (int i=1 ; i<=size ; i++){
            for (int j=1 ; j<=2*size-1 ; j++){
                if ((i+j) >= size+1 && (j-i) <= size-1){
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" "+ " ");
                }
            }
            System.out.println();
        }
    }

    public static void buildPatternTwo(int size){
        for (int i=1 ; i<=size ; i++){
            for (int j=1 ; j<=size-i ; j++){
                System.out.print(" " + " ");
            }

            for (int j=1 ; j<=i ; j++){
                System.out.print("*"+" ");
            }

            for (int j=1 ; j<=i-1 ; j++){
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
