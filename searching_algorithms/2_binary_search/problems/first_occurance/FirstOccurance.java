public class FirstOccurance {

    private static int firstOccur(int[] arr , int x){
        int n = arr.length;
        int startIndex = 0;
        int endIndex = n-1;

        int firstOccurIndex = -1;

        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex)/2;

            if (arr[mid] == x){
                firstOccurIndex = mid;
                endIndex = mid-1;
            } else if (arr[mid] > x) {
                endIndex = mid -1;
            }else{
                startIndex = mid+1;
            }
        }

        return firstOccurIndex;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,4,5,6,77,77,8};

        int ans = firstOccur(arr , 2);

        System.out.print("The first Occuring index of 2 is : "+ ans);
    }
}
