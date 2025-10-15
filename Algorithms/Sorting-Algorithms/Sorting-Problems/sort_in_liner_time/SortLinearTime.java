public class SortLinearTime {

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

    private static void sortArray(int[] nums){
        int n=nums.length;
        int x = -1;
        int y = -1;

        // Edge Cases
        if (n<=1) {
            return;
        }

        for (int i=1 ; i<n ; i++){
            if (nums[i-1] > nums[i]){
                if (x==-1){ // first conflict
                    x = i-1;
                    y = i;
                }else{ // Second Conflict
                    y = i;
                }
            }
        }

        swap(nums , x , y);
    }

    public static void main(String[] args){
        int[] arr = {10,5,6,7,8,9,3};

        System.out.println("Original Array : ");
        printArray(arr);

        System.out.println();
        sortArray(arr);

        System.out.println("Sorted Array : ");
        printArray(arr);
    }

}
