public class QuickSort {

    public static void printArray(int[] arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void swap(int[] arr , int x , int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static int partition(int[] arr , int start , int end){
        int pivot = arr[start];

        // Count variable stores the no. of elements which are lesser than the pivot
        int count = 0;

        // for loop counts the no. of elements which are lesser than the pivot
        for (int i=start+1 ; i<=end ; i++){
            if (arr[i] <= pivot) count++;
        }

        // Pivot Index Element --> Correct position
        int pivotIndex = start + count;

        // Swap the start element and pivot index element to get the correct position of the pivot element in the array.
        swap(arr , start , pivotIndex);

        int i = start;
        int j = end;

        // While loop finds the large number than pivot in the left and small number in the right and swap it
        while(i < pivotIndex && j>pivotIndex){

            // Finds the larger number than pivot in the left part of the pivot
            while(arr[i] <= pivot) i++;

            // Finds the smaller number than pivot in the right part of the pivot
            while(arr[j] > pivot) j--;

            // Condition check for swapping
            if (i < pivotIndex && j > pivotIndex){
                swap(arr , i , j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }


    public static void quickSort(int[] arr , int start , int end){
        // Base Case
        if (start >= end){
            return;
        }

        // Self Work and ptrIndex --> Partition Index
        int ptrIndex = partition(arr , start , end);

        // Recursive Work
        quickSort(arr, start , ptrIndex-1);
        quickSort(arr , ptrIndex+1 , end);
    }




    public static void main(String[] args){
        int[] arr = {7,13,8,5,10,2,4};

        System.out.println("Array before sorting : ");
        printArray(arr);

        System.out.println();
        quickSort(arr , 0 , arr.length-1);

        System.out.println("Array after sorting : ");
        printArray(arr);
    }
}
