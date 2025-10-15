public class RaceTrack {

    private static boolean isPossible(int[] arr , int k , int dist){
        int kidsPlaced = 1;
        int lastKid = arr[0];

        for (int i=1 ; i<arr.length ; i++){
            if (arr[i] - lastKid >= dist){
                kidsPlaced++;
                lastKid = arr[i];
            }
        }

        return kidsPlaced >= k;
    }

    private static int raceTrack(int[] arr , int k){
        if (arr.length < k) return -1;

        int ans = -1;

        int start = 0 , end = (int) 1e9;

        while(start <= end){

            int mid = start + (end - start)/2;

            if (isPossible(arr , k , mid)){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,8,9};
        int k = 3;

        System.out.println(raceTrack(arr , k));
    }
}
