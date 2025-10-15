import java.util.ArrayList;

public class MaxInArray {

    static private int maxArray(ArrayList<Integer> list , int idx){
        // Base Case
        if (idx == list.size()-1) return list.get(idx);

        // idx+1 , end of the array --> max
        int smallAns = maxArray(list , idx+1);

        // Self Work
        return Math.max(smallAns , list.get(idx));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(16);
        list.add(22);
        list.add(34);
        list.add(43);
        list.add(54);

        System.out.print("Maximum in the Array : ");
        System.out.println(maxArray(list , 0));
    }
}
