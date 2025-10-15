public class ReverseString {

    // With the index in the parameters
    static private String reverse(String s , int idx){
        // Base Case
        if (idx == s.length()) return "";

        // Recursive Case
        String smallAns = reverse(s , idx+1);

        // Self Work
        return smallAns + s.charAt(idx);
    }

    // Without the index in the parameters
    static private String reverse(String s){
        // Base Case
        if (s.length()==0) return "";

        // Recursive Case
        String smallAns = reverse(s.substring(1));

        // Self Work
        return smallAns + s.charAt(0);
    }

    public static void main(String[] args) {



    }
}
