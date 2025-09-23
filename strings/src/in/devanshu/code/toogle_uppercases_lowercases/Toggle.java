package in.devanshu.code.toogle_uppercases_lowercases;
// ASCII VALUES
// 'A' --> 65
// 'a' --> 97
// 0 --> 48
import java.util.Scanner;

public class Toggle {

    private static void toggle(StringBuilder s){
        for (int i=0 ; i<s.length() ; i++){
            // flag = true }--> letter --> CAPITAL
            Boolean flag = true;
            char ch = s.charAt(i);
//            if (ch == ' ') {
//                continue;
//            }

            int asciiValue = (int) ch;

            if (asciiValue == 32 || asciiValue >= 48 && asciiValue <= 57){
                continue;
            }

            if (asciiValue >= 97){
                flag = false; // flag = false }--> [letter --> small]
            }

            if (flag){
                asciiValue += 32; // 'A' - 'a' => 32
                char updtChar = (char) asciiValue;
                s.setCharAt(i , updtChar);
            }else{
                asciiValue -= 32;
                char updtChar = (char) asciiValue;
                s.setCharAt(i , updtChar);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.print("Enter the String : ");
        String s = sc.nextLine();

        sb.append(s);


        System.out.println("Origional String : " + sb);
        toggle(sb);
        System.out.println("Toggled String : " + sb);
    }
}
