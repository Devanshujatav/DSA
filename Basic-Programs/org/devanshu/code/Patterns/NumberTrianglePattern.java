package org.devanshu.code.Patterns;

public class NumberTrianglePattern {

    public static void buildPattern(int size){
        for (int i=1 ; i<=size ; i++){
            int num = 1;
            for (int j=1 ; j<=2*size-1 ; j++){
                if (j+i>size && j-i<size){
                    if (j<size){
                        System.out.print(num++);
                    }else{
                        System.out.print(num--);
                    }
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
