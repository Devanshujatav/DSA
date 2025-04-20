import java.util.ArrayList;

public class ReverseList {
    static void swap(ArrayList<Integer> list , int i , int j){
        list.set(i, list.get(i) ^ list.get(j));
        list.set(j, list.get(i) ^ list.get(j));
        list.set(i, list.get(i) ^ list.get(j));
    }

    static void reverse(ArrayList<Integer> list){
        int i = 0; // index to swap
        int j = list.size() -1;

        // XOR swap
        while(i<j){
            swap(list , i , j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Original List : "+ list);
        reverse(list);
        System.out.print("After Reverse : "+ list);
    }
}