public class PeakIndex {

    private static int peakIdx(int[] arr){
        int startIndex = 0;
        int endIndex = arr.length-1;

        if (arr.length < 3){
            System.out.println("Your array is too small.");
        }

        int ans = -1;

        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;

            if (arr[mid] < arr[mid+1]){
                ans = mid + 1;
                startIndex = mid+1;
            }else{
                endIndex = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {0,1,0};
        System.out.println("Peak Index : " + peakIdx(arr));
    }
}
