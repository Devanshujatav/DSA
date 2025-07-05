// Check the array is sorted or not

import java.util.ArrayList;

public class checkSorted {

    private static boolean isSorted(ArrayList<Integer> list , int idx){
        // Base Case
        if (idx == list.size()-1) return true;

        return list.get(idx) < list.get(idx+1) && isSorted(list , idx+1);
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        System.out.println(list);

        System.out.print("Is List Sorted : ");
        System.out.println(isSorted(list , 0));
    }
}
