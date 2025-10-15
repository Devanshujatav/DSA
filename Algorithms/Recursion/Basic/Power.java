import java.util.Scanner;

public class Power {

//    static int powerOf(int p , int q){
//
//
//       APPROCH 1
//       BASE CASE
//       if (q==0) return 1;
//
//       RECURSIVE WORK AND SELF WORK
//       return powerOf(p , q-1) * p;
//
//
//    }


    static int powerOf(int p , int q){

        // Base Case
        if (q==0) return 1;

        // Self Work
        int smallAns = powerOf(p , q/2);

        if (q%2==0){ // Even case
            return smallAns * smallAns;
        }

        // Odd case
        return p * smallAns * smallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base : ");
        int p = sc.nextInt();

        System.out.print("Enter the Exponent or Power : ");
        int q = sc.nextInt();

        System.out.print(p + " to the power " + q + " : " );
        System.out.println(powerOf(p , q));
    }
}
