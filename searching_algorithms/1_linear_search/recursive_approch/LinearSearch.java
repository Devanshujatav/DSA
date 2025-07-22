public class LinearSearch {
    private static int linearSearch(int[] arr, int target, int index) {
        // Base case: reached end of array
        if (index >= arr.length) {
            return -1;  // Element not found
        }

        // Base case: found the element
        if (arr[index] == target) {
            return index;
        }

        // Recursive case: search in the rest of the array
        return linearSearch(arr, target, index + 1);
    }

    public static void main(String[] args){
        int[] arr = {1,2,4,5,8,7};

        int ans = linearSearch(arr , 9 , 0);

        if (ans >= 0){
            System.out.println("Element is found.");
        }else{
            System.out.println("Element is not found.");
        }
    }
}
