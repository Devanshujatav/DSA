public class DistributedChocolates {

    private static boolean isDivisionPossible(int arr[] , int m , int mxChocAllowed){
        int numOfStudents = 1;
        int choc = 0;

        for (int i=0 ; i<arr.length ; i++){
            if(arr[i] > mxChocAllowed){
                return false;
            }

            if (choc + arr[i] <= mxChocAllowed){
                choc+=arr[i];
            }else{
                numOfStudents++;
                choc = arr[i];
            }
        }

        return numOfStudents <= m;
    }

    private static int distributedChocolates(int[] arr , int m){ // m --> no. of students
        int n = arr.length;

        if(n<m) return -1;

        int ans = 0;
        int start = 1 , end = (int) 1e9;

        while(start <= end){
            int mid = start + (end-start) / 2;

            if (isDivisionPossible(arr , m , mid)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int[] arr = {5,3,1,4,2};
        int m = 3;

        System.out.println(distributedChocolates(arr , m));
    }

}
