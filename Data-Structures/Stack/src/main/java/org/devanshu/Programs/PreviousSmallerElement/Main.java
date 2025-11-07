package org.devanshu.Programs.PreviousSmallerElement;

import org.devanshu.Programs.NextSmallerElement.NextSmallerElement;

public class Main {
    public static void main(String[] args) {
        PreviousSmallerElement nse = new PreviousSmallerElement();
        int[] arr = {4,8,5,2,25};
        int[] result = nse.findPreviousSmaller(arr);

        System.out.print("Next Smaller Elements : ");
        for (int val : result){
            System.out.print(val + " ");
        }
    }
}
