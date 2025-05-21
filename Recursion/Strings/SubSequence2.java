public class SubSequence2 {


    private static void printSSQ(String s , String currAns){
        // Base Case
        if (s.isEmpty()){
            System.out.println(currAns);
            return;
        }

        // Self Work
        char curr = s.charAt(0);
        String remString = s.substring(1);

        // Recursive Work
        // CurrAns --> Chooses to be a part of currAns
        printSSQ(remString , currAns + curr);

        // CurrAns --> Chooses not to be a part of currAns
        printSSQ(remString , currAns);
    }

    public static void main(String[] args) {

        printSSQ("abc" , " ");

    }
}
