package in.devanshu.code.word_count;

public class WordCount {

    private static String wordCount(String s){
        String ans = "" + s.charAt(0);
        int count = 1;

        for (int i=1 ; i<s.length() ; i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if (curr == prev){
                count++;
            }else{
                if (count>1){
                    ans+=count;
                }
                count=1;
                ans+=curr;
            }
        }

        if (count>1){
            ans+=count;
        }
        return ans;
    }

    public static void main(String[] args){
        String str = "aaaabbbccd";
        String ans = wordCount(str);
        System.out.println("Word Count : " + ans);
    }
}
