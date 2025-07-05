public class Palindrome {

    static private String reverse(String s){
        // Base Case
        if (s.length()==0) return "";

        // Recursive Case
        String smallAns = reverse(s.substring(1));

        // Self Work
        return smallAns + s.charAt(0);
    }


    // Method by reversing the string
    static private void checkPalindrome(String s){
        String revStr = reverse(s);

        if (revStr.equals(s)){
            System.out.println(s +" is Palindrome.");
        } else{
            System.out.println(s + " is not a Palindrome.");
        }
    }

    // Method without reversing the string
    static private boolean isPalindrome(String s , int l , int r){
        // Base Case
        if (l>=r) return true;

        // Self Work and Recursive Work
        return (s.charAt(l)==s.charAt(r) && isPalindrome(s , l+1 , r-1));

    }

    public static void main(String[] args) {
        String s = "level";

        // call for the first method
        checkPalindrome(s);

        // Call for the second method
        if (isPalindrome(s , 0 , s.length()-1)){
            System.out.println("true");
        } else{
            System.out.println("False");
        }
    }
}
