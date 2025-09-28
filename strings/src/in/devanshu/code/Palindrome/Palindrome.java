package in.devanshu.code.Palindrome;

public class Palindrome {

    // Method 1: Using two pointers approach
    public static Object isPalindrome1(String s){
        if (s == null) return null;

        // Convert to lowercase and remove spaces for case-insensitive check
        s = s.toLowerCase().replaceAll("\\s+", "");

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
        return null;
    }

    // Method 2: Using StringBuilder reverse
    public static boolean isPalindrome2(String str){

        // EDGE CASES
        if (str == null){
            return false;
        }

        str = str.toLowerCase().replaceAll("\\s+" , "");

        String reversedString = new StringBuilder(str).reverse().toString();

        return str.equals(reversedString);
    }








}


