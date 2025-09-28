package org.devanshu.ChefAndWaterBottles_DifficultyRating_662;

import java.util.Scanner;

import static org.devanshu.ChefAndWaterBottles_DifficultyRating_662.MaxFilledBottles.filledBottles;

public class Main {
    public static void main(String[] args) {
        // your code goes here

        MaxFilledBottles mfb = new MaxFilledBottles();

        Scanner sc = new Scanner(System.in);


        int t = sc.nextInt();

        while (t!=0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = sc.nextInt();

            filledBottles(n , x , k);

            // 		System.out.println(result);
            t--;
        }
    }
}
