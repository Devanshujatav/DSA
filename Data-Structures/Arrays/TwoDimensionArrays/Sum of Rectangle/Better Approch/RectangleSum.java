import java.util.Scanner;

// Rectangle sum through prefix sum
public class RectangleSum {
    static void PrefixSum(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        // traverse horizontally to calculate row wise prefix sum

        for (int i=0 ; i<r ; i++){
            for (int j=1 ; j<c ; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }

    static int findSum(int[][] matrix , int l1 , int r1 , int l2 , int r2){
        int sum=0;
        PrefixSum(matrix);

        for (int i=l1 ; i<=l2 ; i++){
            // r1 to r2 sum for row
            if (r1>=1){
                sum += matrix[i][r2]-matrix[i][r1-1];
            }else {
                sum += matrix[i][r2];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input size for array
        System.out.print("Enter the number of rows in the matrix : ");
        int r = sc.nextInt();

        // input size for nested array
        System.out.print("Enter the number of columns in the matrix : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];


        for (int i=0 ; i<r ; i++){
            for (int j=0 ; j<c ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // (l1 , r1) => first left and right coordinate
        System.out.print("Enter first left co-ordinate : ");
        int l1 = sc.nextInt();

        System.out.print("Enter first right co-ordinate : ");
        int r1 = sc.nextInt();

        // (l1,r1) => first left and right coordinate



        // (l2 , r2) => second left and right coordinate
        System.out.print("Enter second left co-ordinate : ");
        int l2 = sc.nextInt();

        System.out.print("Enter second right co-ordinate : ");
        int r2 = sc.nextInt();
        // (l2 , r2) => second left and right coordinate

        int ans = findSum(matrix , l1 , r1 , l2 , r2);

        System.out.print("Sum of the elements from co-ordinates ("+l1+","+r1+")" + "(" + l2 + "," + r2 +") : " + ans);
    }
}
