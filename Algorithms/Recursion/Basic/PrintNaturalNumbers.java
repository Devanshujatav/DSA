import java.util.Scanner;

public class PrintNaturalNumbers {

    static void IncreasingNaturalNo(int n){
        // Base Case
        if (n==1){
            System.out.println(1);
            return;
        }

        // Recursive Work
        IncreasingNaturalNo(n-1);


        // Self Work
        System.out.println(n);
    }

    static void DecreasingNaturalNo(int n){
        // Base Case
        if (n==1){
            System.out.println(1);
            return;
        }

        // Self Work
        System.out.println(n);

        // Recursive Work
        DecreasingNaturalNo(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number limit to print natural numbers : ");
        int x = sc.nextInt();

        DecreasingNaturalNo(x);
    }
}
