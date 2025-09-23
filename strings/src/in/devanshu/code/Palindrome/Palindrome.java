package in.devanshu.code.Palindrome;

public class Palindrome {
    private static void isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        int startIdx = 0;
        int endIdx = s.length()-1;

        Boolean flag = true; // true : it's a palindrome

        while(startIdx < endIdx){
            if (s.charAt(startIdx) != s.charAt(endIdx)){
                flag = false;
                System.out.println("Not a Plaindrome");
                break;
            }
            startIdx++;
            endIdx--;
        }

        if (flag){
            System.out.println("Palindrome");
        }
    }

    public static void main(String[] args){
        String str = "madamji";

        isPalindrome(str);
    }
}


