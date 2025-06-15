// This approch is used when no duplicates are there in the array

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BruteForceApproch {

    static private int secondLargest(ArrayList<Integer> list){

        // Size of the Arraylist
        int n = list.size();

        // Edge Cases
        if (n==0 || n==1){
            return -1;
        }

        // Sorting the list
        Collections.sort(list);

        return list.get(list.size()-2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the Number of Elements in an Array : ");
        int n = sc.nextInt();

        System.out.print("Enter "+ n +" elements in an Array : ");
        for (int i=0 ; i<n ; i++){
            int element = sc.nextInt();
            list.add(element);
        }

        int ans = secondLargest(list);

        System.out.print("Second Largest Element in an Array : " + ans);



    }
}
