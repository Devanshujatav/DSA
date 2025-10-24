import java.util.Scanner;

public class test {
    public static void prefixSum(int[] arr){
        for (int i=1 ; i<arr.length ; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("Enter the Elements : ");
        for (int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        prefixSum(arr);

        System.out.println("Prefix Sum Array : ");
        System.out.println(arr);
    }
}
