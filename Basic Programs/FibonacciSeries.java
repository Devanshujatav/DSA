import java.util.Scanner;

public class FibonacciSeries {

    static void fibonacci(int n){

        // EDGE CASE
        if (n==0) return;

        // EDGE CASE
        if (n<0) return;


        int first = 0;
        int second = 1;

        int next = first + second;

        System.out.print(first + " ");
        System.out.print(second + " ");
        System.out.print(next + " ");

//        int i = 2;
        while(next<n){
//            System.out.println(next + " ");
            first = second;
            second = next;
            next = first + second;
            System.out.print(next + " ");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Fibonacci Number : ");
        int x = sc.nextInt();


        if (x <= 0){
            System.out.println("Wrong Input.....Enter a valid fibonacci limit!!!!!");
            return;
        }else {
            fibonacci(x);
        }

    }
}
