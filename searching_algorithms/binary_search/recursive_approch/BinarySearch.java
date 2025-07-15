public class BinarySearch {

    private static boolean binarySearch(int[] arr , int startIndex , int endIndex , int target){
        // Base Case
        if (startIndex > endIndex){
            return false;
        }

        // Self Work
        int mid = (startIndex + endIndex) / 2;

        if (arr[mid] == target){
            return true;
        }else if(arr[mid] > target){
            // Recursive Case
            return binarySearch(arr , startIndex , mid-1 , target); // subProblems
        }else{
            // Recursive Case
            return binarySearch(arr , mid+1 , endIndex , target); // subProblems
        }
    }

    public static void main(String[] args){
        int[] arr = {1,3,4,6,8,9};

        boolean ans = binarySearch(arr , 0 , arr.length-1 , 2);

        if (ans){
            System.out.println("Element is found.");
        }else{
            System.out.println("Element is not found.");
        }
    }
}
