package DSA.TwoDimensionArrays;

import java.util.Scanner;

public class SpiralMatrixTraversal {
    static void SpiralMatrix(int[][] matrix , int r , int c){
        int topRow = 0;
        int bottomRow = r-1;
        int leftCol = 0;
        int rightCol = c-1;
        int totalElements = 0;

        while(totalElements < r*c){
            // topRow -> leftCol to rightCol
            for (int j=leftCol ; j<=rightCol && totalElements < r*c ; j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int i=topRow ; i<=bottomRow && totalElements < r*c ; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j=rightCol ; j>= leftCol && totalElements < r*c ; j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i=bottomRow ; i>=topRow && totalElements < r*c ; i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows for Matrix : ");
        int r = sc.nextInt();

        System.out.print("Enter Number of Columns for Matrix : ");
        int c = sc.nextInt();

        // Spiral Generated Matrix
        int[][] matrix = new int[r][c];

        for (int i=0 ; i<r ; i++){
            for (int j=0 ; j<c ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        SpiralMatrixTraversal obj1 = new SpiralMatrixTraversal();
        obj1.SpiralMatrix(matrix , r , c);
    }
}
