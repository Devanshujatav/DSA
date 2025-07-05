import java.util.ArrayList;

public class PrintArray {

// Static Memory Allocation
//    static private void print(int[] arr , int idx){
//        // Base Case
//        if (idx == arr.length){
//            return;
//        }
//
//        // Self Work
//        System.out.println(arr[idx]);
//
//        // Recursive Work
//        print(arr, idx+1);
//    }

    // Dynamic Memory Allocation
    static private void print(ArrayList<Integer> list , int idx){

        // Base Case
        if (idx == list.size()) return;

        // Self Work
        System.out.print(list.get(idx) + " ");

        // Recursive Work
        print(list , idx+1);
    }


    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        print(list , 0);
    }
}
