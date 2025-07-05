// Remove all occurrences of 'a' in the user input string

public class RemoveAllOccurrences {

    static private String removeOccurrences(String s){
        String ans = "";
        for (int i=0 ; i<s.length() ; i++){
            if (s.charAt(i) != 'a'){
                ans+=s.charAt(i);
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        String s = "abcax";

        System.out.print("String after removeing all occurrences of 'a' : ");
        System.out.println(removeOccurrences(s));
    }
}
