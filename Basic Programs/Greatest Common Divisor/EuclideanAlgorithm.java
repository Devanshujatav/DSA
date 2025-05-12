import java.util.Scanner;

public class EuclideanAlgorithm {
    // Long Division method for GCD
    static private int GCD(int x , int y){
        while (x%y!=0){
            int rem = x % y;
            x = y;
            y = rem;
        }

        return y;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Divisor : ");
        int x = sc.nextInt();

        System.out.print("Enter the value of Dividend : ");
        int y = sc.nextInt();

        System.out.print("Greatest Common Divisor of "+ x +" and " + y + " : ");
        System.out.println(GCD(x , y));
    }
}
