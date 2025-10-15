public class BinarySearch {

    private static boolean binarySearch(int[] arr , int target){
        int n = arr.length;
        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex <= endIndex){
            // Finding the middle index element in the array
            int mid = startIndex + endIndex / 2;

            // checking the 'mid element == target' or not
            if(arr[mid] == target){
                return true;
            }else if(arr[mid] > target){
                endIndex = mid-1;
            }else{
                startIndex = mid+1;
            }
        }

        return false;
    }

    public static void main(String[] args){
        int[] arr = {1,3,5,7,8,9};
        boolean ans = binarySearch(arr , 2);

        if (ans){
            System.out.println("Element is found.");
        }else{
            System.out.println("Element is not found.");
        }
    }
}
