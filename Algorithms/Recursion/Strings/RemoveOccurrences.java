import java.util.Scanner;

public class RemoveOccurrences {

    // With the index parameter in the function
    static private String removeA(String s , int idx){
        // Base Case
        if (idx == s.length()) return "";

        // Recursive Case
        String smallAns = removeA(s , idx+1);

        // currChar variable --> store current element
//        char currChar = s.charAt(idx);

        // Self Work
        if (s.charAt(idx) != 'a'){
            return s.charAt(idx)+smallAns;
        }else{
            return smallAns;
        }

        // try self work before recursive work
        // try without using currChar variable ----> Correct
    }

    // Without the index parameter in the function
    static private String removeA2(String s){
        // Base Case
        if (s.length() == 0) return " ";

        // Recursive Case
        String smallAns = removeA2(s.substring(1));

        // Self Work
        if (s.charAt(0) != 'a'){
            return s.charAt(0) + smallAns;
        } else{
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String s = input.nextLine();

        System.out.print("String after removing Occurrences of A : ");
        System.out.println(removeA(s , 0));
        System.out.println(removeA2(s));
    }
}
