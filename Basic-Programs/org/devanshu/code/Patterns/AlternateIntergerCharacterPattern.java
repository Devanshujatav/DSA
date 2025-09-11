package org.devanshu.code.Patterns;

public class AlternateIntergerCharacterPattern {
    public static void buildPattern(int size){
        for (int i=1 ; i<=size ; i++){
            char ch = 'a';
            for (int j=1 ; j<=size ; j++){
                if ((i+j) % 2 == 0){
                    System.out.print(ch);
                }else{
                    System.out.print(j);
                }
                ch++;
            }
        }
    }

    public static void main(String[] args) {
        int size = 5;
        buildPattern(size);
    }
}
