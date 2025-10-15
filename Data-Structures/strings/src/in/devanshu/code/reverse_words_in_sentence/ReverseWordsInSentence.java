package in.devanshu.code.reverse_words_in_sentence;

public class ReverseWordsInSentence {

    public static String reverse(String s){
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for (int i=0 ; i<s.length() ; i++){

            char ch = s.charAt(i);

            if (ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb = new StringBuilder("");
            }
        }

        sb.reverse();
        ans+=sb;
        return ans;
    }


    public static void main(String[] args){
        String str = "My name is Devanshu Jatav";
        System.out.println("Origional Sentence : "+ str);
        String ans = reverse(str);
        System.out.println("Reversed Sentence : " + ans);
    }
}
