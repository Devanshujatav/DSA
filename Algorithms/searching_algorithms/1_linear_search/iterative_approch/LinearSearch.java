public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i; // Found
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 30, 20, 50, 40};
        int target = 90;

        int result = linearSearch(numbers, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }
}
