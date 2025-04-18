import java.util.Scanner;

public class RectangularSum {
    static void prefixSum(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;

        // Traverse horizontally to calculate row wise prefix sum
        for (int i=0 ; i<r ; i++){
            for (int j=1 ; j<c ; j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        // Traverse vertically to calculate column wise prefix sum
        for (int j=0 ; j<c ; j++){
            for (int i=1 ; i<r ; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }

    static int findSum(int[][] matrix , int l1 , int r1 , int l2 , int r2){
        // l1 ans r1 : first left and right co-ordinates
        // l2 and r2 : second left and right co-ordinates

        int ans = 0 , sum = 0 , up = 0 , left = 0 , leftUp = 0;

        prefixSum(matrix);

        sum = matrix[l2][r2];

        if (r1>=1){
            left = matrix[l2][r1-1];
        }

        if (l1>=1){
            up = matrix[l1-1][r2];
        }

        if (l1>=1 && r1>=1){
            leftUp = matrix[l1-1][r1-1];
        }

        ans = sum - up - left + leftUp;

        return ans;
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
