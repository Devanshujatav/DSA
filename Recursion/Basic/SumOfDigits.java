import java.util.Scanner;

public class SumOfDigits {

    static int DigitSum(int n){
        if (n>=0 && n<=9) return n;

        return DigitSum(n/10) + n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Digit : ");
        int n = sc.nextInt();

        System.out.print("Sum of Digit : ");
        System.out.println(DigitSum(n));
    }
}
