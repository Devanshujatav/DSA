import java.util.ArrayList;
import java.util.Collections;

public class SortedList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(4);
        l1.add(3);
        l1.add(1);
        l1.add(7);
        l1.add(5);
        l1.add(2);

        System.out.println("INTEGER LIST");
        System.out.println("Origional List : " + l1);
        Collections.sort(l1);

//        System.out.println();

        System.out.println("Sorted List : " + l1);

//        System.out.println();

        Collections.sort(l1 , Collections.reverseOrder());
        System.out.println("Sorted List in Descending Order : " + l1);

        ArrayList<String> l2 = new ArrayList<>();

        l2.add("Banana");
        l2.add("Mango");
        l2.add("kiwi");
        l2.add("grapes");
        l2.add("Apple");



        System.out.println();

        System.out.println("STRING LIST");
        // Printing Origional List
        System.out.println("Origional List : " + l2);

        // Printing Sorted List
        Collections.sort(l2);
        System.out.println("Sorted List : " + l2);

        // Printing Sorted List in Descending Order
        Collections.sort(l2 , Collections.reverseOrder());
        System.out.println("Sorted in Descending Order : " + l2);
    }
}
