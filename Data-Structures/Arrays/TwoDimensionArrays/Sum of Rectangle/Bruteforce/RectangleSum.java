import java.util.Scanner;

public class RectangleSum {

    static int findSum(int[][] matrix , int l1 , int r1 , int l2 , int r2){
        int sum = 0;
        for (int i=l1 ; i<=l2 ; i++){
            for (int j=r1 ; j<=r2 ; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows of the Matrix : ");
        int r = sc.nextInt();

        System.out.print("Enter the Number of Columns of the Matrix : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        // Enter elements in the array
        for (int i=0 ; i<r ; i++){
            for (int j=0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the first coordinate for the rectangle : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();

        System.out.print("Enter the Second Coordinate for the rectangle : ");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

//        RectangleSum obj = new RectangleSum();
//
//        obj.findSum()

        System.out.print("Sum of Rectangle : " + findSum(matrix , l1 , r1 , l2 , r2));
    }
}
