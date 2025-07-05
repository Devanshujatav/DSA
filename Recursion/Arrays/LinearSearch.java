import java.util.ArrayList;

public class LinearSearch {

    static private boolean search(ArrayList<Integer> list , int target , int idx){
        // Base Case
        if (idx >= list.size()) return false;

        // Self Work
        if (list.get(idx) == target) return true;

        // Recursive Case
        return search(list , target , idx+1);
    }

    // Find first return index of target if target is present in the array , otherwise return -1
    static private int findIndex(ArrayList<Integer> list , int target , int idx){
        // Base Case
        if (idx >= list.size()) return -1;

        // Self Work
        if (list.get(idx) == target) return idx;

        // Recursive Work
        return findIndex(list , target , idx+1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(16);
        list.add(22);
        list.add(34);
        list.add(43);
        list.add(54);

        int target = 43;

        if (search(list , target , 0)){
            System.out.println("Yes , the element is found in the array.");
            System.out.print("The Index of the element is ");
            System.out.println(findIndex(list , target , 0));
        } else {
            System.out.println("No . the element is not found in the array.");
        }
    }
}
