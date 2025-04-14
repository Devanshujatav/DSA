package DSA.TwoDimensionArrays;

import java.util.Scanner;

public class GenerateSpiral {

    static void printArray (int[][] matrix , int r , int c){
        for (int i=0 ; i<r ; i++){
            for (int j=0 ; j<c ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] SpiralMatrix(int n){

        // Spiral Matrix
        int[][] matrix = new int[n][n];

        // Top Row
        int topR = 0;

        // Bottom Row
        int bottomR = n-1;

        // Left Column
        int leftC = 0;

        // Right Column
        int rightC = n-1;

        // To print the digits in the matrix
        int currElement = 1;


        while (currElement <= n*n){
            // Top Row -> Left Column to Right Column
            for (int j=leftC ; j<=rightC && currElement<=n*n ; j++){
                matrix[topR][j] = currElement++;
            }
            topR++;

            // Right Column -> Top Row to Bottom Row
            for (int i=topR ; i<=bottomR && currElement<=n*n ; i++){
                matrix[i][rightC] = currElement++;
            }
            rightC--;

            // Bottom Row -> Right Column to left Column
            for (int j=rightC ; j>=leftC && currElement<=n*n ; j--){
                matrix[bottomR][j] = currElement++;
            }
            bottomR--;

            // Left Column -> Bottom Row to Top Row
            for (int i=bottomR ; i>=topR && currElement<=n*n ; i--){
                matrix[i][leftC] = currElement++;
            }
            leftC++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows and Columns for Matrix : ");
        int n = sc.nextInt();

        // Spiral Generated Matrix
        int[][] matrix = new int[n][n];

        GenerateSpiral obj = new GenerateSpiral();
        matrix = obj.SpiralMatrix(n);

        obj.printArray(matrix , n , n);
    }
}
