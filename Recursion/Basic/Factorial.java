import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        // Base Case :
        if (n==0) return 1;

//        int smallAns = factorial(n-1);
//        int ans = n * smallAns;
//        return ans;

        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value : ");
        int x = sc.nextInt();

        System.out.println(factorial(x));
    }
}
