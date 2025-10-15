public class RadixSort {

    // printArray() --> to print the array
    public static void printArray(int[] arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
    }

    // findMax() --> to find the maximum element in the array
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0 ; i<arr.length ; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static void prefixSum(int[] arr){
        for (int i=1 ; i<arr.length ; i++){
            arr[i] += arr[i-1];
        }
    }

    public static void countSort(int[] arr , int place){

        // Output[] --> to store sorted elements from the prefix sum array
        int[] output = new int[arr.length];

        // Count Array --> to count the frequency of the original array elements.
        int[] count = new int[10];

        // Count the frequency of the elements of the original array
        for(int i=0 ; i<arr.length ; i++){
            count[(arr[i]/place)%10]++;
        }

        // Prefix sum of the count array
        prefixSum(count);


        // Backward For-Loop : finding the element from the array and store in the output array at its correct position.
        for (int i= arr.length-1 ; i>=0 ; i--){
            // idx --> to find correct index of the element from the unsorted array
            int idx = count[(arr[i]/place)%10]-1;

            // Storing values to the actual position in the output array
            output[idx] = arr[i];

            // Reduce index of element by 1 for the next element
            count[(arr[i]/place)%10]--;
        }

        for (int i=0 ; i<arr.length ; i++){
            arr[i] = output[i];
        }
    }

    private static void radixSort(int[] arr){

        // findMax() --> to find the max element and use as the length of the count array
        int max = findMax(arr);

        for (int place = 1 ; max/place > 0 ; place*=10){
            countSort(arr , place);
        }
    }

    public static void main(String[] args){

        int[] arr = {170 , 450 , 705 , 900 , 802 , 220};

        System.out.println("Original Array : ");
        printArray(arr);

        System.out.println();

        radixSort(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);
    }
}
