package in.devanshu.code.substrings;

public class Substrings {

    private static void subStrings(String s){
        for (int i=0 ; i<=s.length()-1 ; i++){
            for (int j=i+1 ; j<=s.length() ; j++){
                System.out.print(s.substring(i , j) + " ");
            }
        }
    }

    public static void main(String[] args){
        String s = "devanshu";
        subStrings(s);
    }
}
