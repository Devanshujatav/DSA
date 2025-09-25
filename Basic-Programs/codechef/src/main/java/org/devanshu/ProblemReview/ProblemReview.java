package org.devanshu.ProblemReview;

import java.util.Scanner;

public class ProblemReview {
    public static void isReviewGood(int[] arr , int n){
        boolean flag = true;
        for (int i=0 ; i<n ; i++){
            if (arr[i] <= 4){
                flag = false;
            }
        }

        if(flag == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t!=0){

            int n = sc.nextInt();

            int[] reviews = new int[n];

            for(int i=0 ; i<n ; i++){
                reviews[i] = sc.nextInt();
            }

            isReviewGood(reviews , n);

            t--;
        }

    }
}
