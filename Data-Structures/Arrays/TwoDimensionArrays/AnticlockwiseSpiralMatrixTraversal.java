package DSA.TwoDimensionArrays;

import java.util.Scanner;

public class AnticlockwiseSpiralMatrixTraversal {
    static void anticlockSpiralMatrix(int[][] matrix , int r , int c){
        int topRow = 0;
        int bottomRow = r-1;
        int leftCol = 0;
        int rightCol = c-1;
        int totalElements = 0;

        while (totalElements <= r*c){
            // Left Column -> topRow to Bottom Row
            for (int j=topRow ; j<=bottomRow && totalElements<r*c ; j++){
                System.out.print(matrix[j][leftCol] + " ");
                totalElements++;
            }
            leftCol++;

            // BottomRow -> leftCol to rightCol
            for (int i=leftCol ; i<=rightCol && totalElements<r*c; i++){
                System.out.print(matrix[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;

            // Right Col -> BottomRow to TopRow
            for (int j=bottomRow ; j>=topRow && totalElements<r*c ; j--){
                System.out.print(matrix[j][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            // Top Row -> Right Col to left Col
            for (int i=rightCol ; i>=leftCol && totalElements<r*c ; i--){
                System.out.print(matrix[topRow][i] + " ");
                totalElements++;
            }
            topRow++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows : ");
        int r = sc.nextInt();

        System.out.print("Enter the Number of Columns : ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        for (int i=0 ; i<r ; i++){
            for (int j=0 ; j<c ; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        AnticlockwiseSpiralMatrixTraversal obj = new AnticlockwiseSpiralMatrixTraversal();
        obj.anticlockSpiralMatrix(matrix , r, c);
    }
}
