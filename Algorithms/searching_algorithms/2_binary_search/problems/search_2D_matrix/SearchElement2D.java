public class SearchElement2D {

    private static boolean search(int[][] matrix , int target){
        // m --> no. of rows
        int m = matrix.length;

        // n --> no. of columns
        int n = matrix[0].length;

        int startIndex = 0;
        int endIndex = (m*n)-1;

        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex);

            // to find the element at middle index --> formula => matrix[mid/n][mid%n]
            // matrix = name of the matrix
            // mid = mid index of the 2D matrix
            // n = no. of columns
            int midElement = matrix[mid/n][mid%n];

            if (midElement == target){
                return true;
            }else if(target < midElement){
                endIndex = mid-1;
            }else{
                startIndex = mid+1;
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(search(matrix , 5));
    }
}
