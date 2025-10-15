public class SearchElement {

    private static int search(int[] arr , int target){
        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex <= endIndex){

            int mid = startIndex + (endIndex - startIndex)/2;

            if (arr[mid] == target){
                return mid;
            }else if(arr[mid] < arr[endIndex]){
                if (arr[mid] < target && target <= arr[endIndex]){
                    startIndex = mid + 1;
                }else{
                    endIndex = mid-1;
                }
            }else{
                if (arr[startIndex] <= target && target < arr[mid]){
                    endIndex = mid-1;
                }else{
                    startIndex = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] val = {3,4,5,1,2};

        System.out.println("Search element is at index " + search(val , 4));
    }
}
