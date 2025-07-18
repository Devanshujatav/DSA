public class PeakElement {

    private static int peakElement(int[] arr){
        int startIndex = 0;
        int endIndex = arr.length-1;

        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;

            if ((mid==0 || arr[mid] > arr[mid-1]) && (mid == arr.length-1 || arr[mid] > arr[mid+1])){
                return mid;
            }

            if (arr[mid] < arr[mid+1]){
                startIndex = mid+1;
            }else{
                endIndex = mid-1;
            }

        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1,2,1,3,5,6,4};

        System.out.println("Peak Element : " + peakElement(arr));
    }
}
