public class KeypadCombinations {

    private static void Combinations(String dig , String[] keypad , String res){
        // Base Case
        if (dig.isEmpty()){
            System.out.print(res + " ");
            return;
        }

        // Self Work
        int currNum = dig.charAt(0) - '0';
        String currChoices = keypad[currNum];

        // Recursive Work
        for (int j=0 ; j<currChoices.length() ; j++){
            Combinations(dig.substring(1) , keypad , res + currChoices.charAt(j));
        }
    }

    public static void main(String[] args) {

        String[] keypad = {" " , " " , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"};
        String s = "23";

        Combinations(s , keypad , " ");
    }
}
