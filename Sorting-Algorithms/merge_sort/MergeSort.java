public class MergeSort {

    static void merge(int[] arr , int l , int mid , int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        // Left Subarray
        int[] left = new int[n1];
        // Right Subarray
        int[] right = new int[n2];

        int i , j , k ;
        for (i=0 ; i<n1 ; i++) left[i] = arr[l+i];
        for (j=0 ; j<n2 ; j++) right[j] = arr[mid+1+j];

        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2){
            if (left[i] <= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j<n2){
            arr[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] arr , int l , int r){

        // Base Case
        if (l>=r){
            return;
        }

        // Finding the middle element of the array
        int mid = (l+r)/2;

        // Recursive Function for left half of the array
        mergeSort(arr , l , mid);

        // Recursive Function for right half of the array
        mergeSort(arr , mid+1 , r);

        // Self Work
        merge(arr, l , mid , r);
    }

    public static void displayArray(int[] arr){
        int n = arr.length;

        for (int val : arr){
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {4,1,3,5,2};

        System.out.println("Array before Sorting : ");
        displayArray(arr);

        System.out.println();
        mergeSort(arr, 0 , arr.length-1);

        System.out.println("Array after Sorting : ");
        displayArray(arr);

    }
}
