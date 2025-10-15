public class SearchElement {

    private static boolean searchMatrix(int[][] matrix , int target){
        // m --> No. of rows
        int m = matrix.length;

        // n --> No. of columns
        int n = matrix.length-1;

        // [i==0] => start from the first row of the matrix to search element
        int i = 0;

        // [j = n-1] ==> start from the last column of the matrix to search element
        int j = n-1;

        while(i<m && j>=0){
            if (matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;

        System.out.println(searchMatrix(matrix , target));
    }
}
