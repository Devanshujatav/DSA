import java.util.ArrayList;

public class SumOfElements {

    static private int sum(ArrayList<Integer> list , int idx){
        // Base Case
        if (idx == list.size()-1) return list.get(idx);

        // Self Work
        int smallAns = sum(list , idx+1);

        // Recursive Case
        return list.get(idx) + smallAns;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.print("Sum of all the element present in the Array : ");
        System.out.println(sum(list , 0));
    }
}
