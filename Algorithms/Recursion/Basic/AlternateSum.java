import java.util.Scanner;

public class AlternateSum {

    static int sum(int n){

        // Base Case
        if (n==0) return 0;

        if (n%2==0) { // even
            // Self work and Recursive work
            return sum(n - 1) - n;
        }else { // odd
            // Self work and Recursive work
            return sum(n-1) + n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit of the Alternate Sum : ");
        int x = sc.nextInt();

        System.out.print("Alternate Sum : ");
        System.out.println(sum(x));
    }
}
