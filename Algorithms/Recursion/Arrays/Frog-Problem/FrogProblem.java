// Minimum Cost for jump to reach the last index.
public class FrogProblem {

    private static int minCost(int[] h , int n , int idx){
        // Base Case
        if (idx==n-1) return 0;

        // Recursive Case 1
        int opt1 = minCost(h , n , idx+1) + Math.abs(h[idx+1] - h[idx]);

        if(idx == n-2) return opt1;

        // Recursive Case 2
        int opt2 = minCost(h , n , idx+2) + Math.abs(h[idx+2] - h[idx]);

        // Self Work
        return Math.min(opt1 , opt2);
    }

    public static void main(String[] args) {
        int[] arr = {10 , 30 , 40 ,20};

        System.out.print("Minimum Cost to reach last index : ");
        System.out.println(minCost(arr , arr.length , 0));
    }
}
