public class SortPositiveNegetive {

    private static void printArray(int[] arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
    }

    private static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void partition(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start < end) {
            // Checking the first partition have all negetive
            while(nums[start] < 0) start++;

            // Checking the first partition have all positive
            while(nums[end] >= 0) end--;

            // Check for the swap
            if (start < end){
                swap(nums , start , end);
            }
        }
    }



    public static void main(String[] args){
        int[] arr = {-13 , 20 , 7 , 0 , -4 , -13 , -11 , -5 , -15};

        System.out.println("Before Partition : ");
        printArray(arr);

        System.out.println();

        partition(arr);
        System.out.println("After Partition : ");
        printArray(arr);

    }
}
