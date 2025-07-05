import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {

    static int largest(ArrayList<Integer> list){
//        Collections.sort(list);

        int value = Integer.MIN_VALUE;

        for (int i=0 ; i<list.size() ; i++){
            if (list.get(i) > value){
                value = list.get(i);
            }
        }

        return value;
    }

    static int findSecondLargest(ArrayList<Integer> list){
        int largest = largest(list);
        int secondLargest = 0;


        for (int i=0 ; i<list.size() ; i++){
            if (list.get(i) == largest){
                list.set(i , -1);
            }
        }

        secondLargest = largest(list);

        return secondLargest;
    }

    public static void main(String[] args) {

        ArrayList<Integer> LIST = new ArrayList<>();

        LIST.add(5);
        LIST.add(9);
        LIST.add(8);
        LIST.add(1);

        int large = largest(LIST);
        System.out.println("Largest Element in the ArrayList : " + large);

        int secondLarge = findSecondLargest(LIST);
        System.out.println("Second Largest Element in the ArrayList : " + secondLarge);


    }
}
