import java.util.Scanner;

public class CountOfDigits {

    static int countDigits(int n){
        // Convert negetive number to positive
        n = Math.abs(n);

        // Base Case : When the number is between 0 to 9 , it has only 1 digit
        if (n>=0 && n<=9) return 1;

        // Recursive case : Remove the last digit and add 1 to the count
        return 1 + countDigits(n/10);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Digit : ");
        int n = sc.nextInt();

        System.out.print("Count of Digits : ");
        System.out.println(countDigits(n));
    }
}
