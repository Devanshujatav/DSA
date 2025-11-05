package org.devanshu.Programs.NextSmallerElement;

public class Main {
    public static void main(String[] args) {
        NextSmallerElement nse = new NextSmallerElement();
        int[] arr = {4,8,5,2,25};
        int[] result = nse.findNextSmaller(arr);

        System.out.print("Next Smaller Elements : ");
        for (int val : result){
            System.out.print(val + " ");
        }
    }
}