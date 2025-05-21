public class SubsetSum {

    private static void findSum(int[] a , int n , int idx , int sum){
        // Base Case
        if (idx >= n){
            System.out.println(sum);
            return;
        }

        // Recursive Case
        findSum(a , n , idx+1 , sum+a[idx]); // Inclusive Case : Add the element at idx

        findSum(a , n , idx+1 , sum); // Exclusive Case : Not add the element at idx
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5};

        // Method Call
        findSum(arr , arr.length , 0 , 0);

    }
}
