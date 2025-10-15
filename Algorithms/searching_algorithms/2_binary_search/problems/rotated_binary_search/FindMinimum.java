public class FindMinimum{

    private static int findMin(int[] arr){
        int startIndex = 0;
        int endIndex = arr.length-1;

        int ans = -1;

        while(startIndex <= endIndex){
            // Middle element of the array
            int mid = startIndex + (endIndex - startIndex)/2;

            if (arr[mid] <= arr[arr.length-1]){
                ans = mid;
                endIndex = mid-1;
            }else{
                startIndex = mid+1;
            }

        }
        return ans;
    }

    public static void main(String[] args){
        int[] val = {4,5,1,2,3};
        System.out.println("The minimum element of the array is at index : " + findMin(val));
    }
}