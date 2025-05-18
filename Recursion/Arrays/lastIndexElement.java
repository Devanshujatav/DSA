// find last index of the target element

import java.util.ArrayList;

public class lastIndexElement {

    private static void lastIndex(ArrayList<Integer> list , int idx , int target){
        // Base Case
        if (idx >= list.size()) return;

        // Recursive Case
        lastIndex(list , idx+1 , target);

        // Self Work
        if (list.get(idx) == target) {
            System.out.println(idx);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 3;

        System.out.print("The last index of element " + target + " : ");
        lastIndex(list , 0 , target);
    }
}
