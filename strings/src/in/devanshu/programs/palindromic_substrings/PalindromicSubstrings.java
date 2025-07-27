package in.devanshu.programs.palindromic_substrings;

public class PalindromicSubstrings {

    private static boolean isPalindrome(String s){
        int startIdx=0;
        int endIdx=s.length()-1;

        while(startIdx<endIdx){
            if (s.charAt(startIdx) != s.charAt(endIdx)) return false;
            startIdx++;
            endIdx--;
        }

        return true;
    }


    private static int palindromicSubstrings(String s){
        int count = 0;
        for (int i=0 ; i<s.length() ; i++){
            for (int j=i+1 ; j<=s.length() ; j++){
                if (isPalindrome(s.substring(i,j)) == true){
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args){
        String str = "abcba";
        int ans = palindromicSubstrings(str);
        System.out.println("Number of palindromic substrings : " + ans);
    }
}
