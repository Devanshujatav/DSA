package org.devanshu.FindingShoes_DifficultyRating_646;

import java.util.Scanner;

public class FindRemainingShoes {
    public static int remainingShoePair(int n , int m){
        int totalPairs = n*2;

        if (totalPairs == m){
            // System.out.println(totalPairs);
            return m-n;
        } else{
            // System.out.println(totalPairs-m);
            return totalPairs-m;
        }
    }


    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){

            int n = sc.nextInt();
            int m = sc.nextInt();

            int ans = remainingShoePair(n , m);

            System.out.println(ans);

            t--;
        }

    }
}
