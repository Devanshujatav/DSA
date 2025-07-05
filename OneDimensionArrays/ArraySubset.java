import java.util.ArrayList;

public class ArraySubset {

    static

    static boolean checKEntry(ArrayList<Integer> l1 , ArrayList<Integer> l2){
        ArrayList<Integer> entries = new ArrayList<>();

        for (int i=0 ; i<l2.size() ; i++){
            for (int j=0 ; j<l1.size() ; j++){
                if (l2.get(i) == l1.get(j)){
                    entries.add(i , 1);
                } else
            }
        }
    }

    public static void main(String[] args) {

    }
}
