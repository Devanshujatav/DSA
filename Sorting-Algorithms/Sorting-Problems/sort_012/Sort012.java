public class Sort012 {

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

    // Using Count Sort Algorithm
    private static void sort012_basic(int[] arr){
        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        // Count 0 , 1 and 2 in count_0 , count_1 and count_2 variables respectively.
        for (int val : arr){
            if (val == 0){
                count_0++;
            }

            if (val == 1){
                count_1++;
            }

            if (val == 2){
                count_2++;
            }
        }

        // k --> iterator for while loop
        int k = 0;
        while(count_0 > 0){
            arr[k++] = 0;
            count_0--;
        }

        while(count_1 > 0){
            arr[k++] = 1;
            count_1--;
        }

        while (count_2 > 0) {
            arr[k++] = 2;
            count_2--;
        }
    }

    private static void sort012(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid <= high){
            if (arr[mid] == 0){
                swap(arr , low , mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else{
                swap(arr , mid , high);
                high--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,0};

        System.out.println("Array before sorting : ");
        printArray(arr);

        System.out.println();

        System.out.println("Array after sorting : ");
        sort012(arr);
        printArray(arr);
    }
}
