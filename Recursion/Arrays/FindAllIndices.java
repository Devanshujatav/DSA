import java.util.ArrayList;

public class FindAllIndices {

    // Through return type Void
    static private void findIndices(ArrayList<Integer> list , int target , int idx){
        // Base Case
        if (idx >= list.size()) return;

        // Self Work
        if (list.get(idx) == target) {
            System.out.print(idx + " ");
        }

        // Recursive Work
        findIndices(list , target , idx+1);
    }

    // Through return type ArrayList
    static private ArrayList<Integer> allIndices(ArrayList<Integer> list , int target , int idx){

        ArrayList<Integer> ans = new ArrayList<>();

        // Base Class
        if (idx >= list.size()){
            return new ArrayList<Integer>(); // return empty ArrayList
        }

        // Self Work
        if (list.get(idx) == target){
            ans.add(idx);
        }

        // Recursive Work
        ArrayList<Integer> smallAns = allIndices(list , target , idx+1);

        ans.addAll(smallAns);

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(16);
        list.add(22);
        list.add(34);
        list.add(22);
        list.add(22);

        int target = 22;

        System.out.print("Indices where the element "+ target + " is present : ");
        findIndices(list , target , 0);

        System.out.println();

        System.out.print("Through ArrayList Indices where the element "+ target + " is present : ");
        System.out.println(allIndices(list , target , 0));

    }
}
