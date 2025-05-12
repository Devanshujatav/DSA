import java.util.Scanner;

public class test {
    static private int GCD(int x , int y){

        // Base Case
        if (y==0) return x;

        // Recursive Case
        return (x*y) / GCD(y , x%y);
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
