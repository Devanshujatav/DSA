// Given a string , return all its subsequences in an arraylist.

import java.util.ArrayList;

public class SubSequence {

    private static ArrayList<String> getSSQ(String s){
        ArrayList<String> ans = new ArrayList<>();

        // Base Case
        if (s.isEmpty()){
            ans.add(" ");
            return ans;
        }

        char curr = s.charAt(0);

        // Recursive Case
        ArrayList<String> smallAns = getSSQ(s.substring(1));


        // smallAns = ["bc" , "b" , "c" , " "]
        // Ans = ["bc" , "abc" , "b" , "ab" , "c" , "ac" , " " , "a"]

        // Self Work
        for (String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }

        return ans;

    }


    public static void main(String[] args) {

        ArrayList<String> ans = getSSQ("abc");
        System.out.println(ans);

    }
}
