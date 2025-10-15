import java.util.Scanner;

public class FibonaaciNumber {

    static int fibonacci(int n){
        if (n==0 || n==1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for the fibonaaci number : ");
        int x = sc.nextInt();

        System.out.print("Fibonacci Number at "+ x + " : ");
        System.out.print(fibonacci(x));
    }
}
