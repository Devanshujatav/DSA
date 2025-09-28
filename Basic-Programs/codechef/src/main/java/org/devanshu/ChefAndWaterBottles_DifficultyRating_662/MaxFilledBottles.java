package org.devanshu.ChefAndWaterBottles_DifficultyRating_662;
import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxFilledBottles {

    public static void filledBottles(int n , int x , int k){
        // EDGE CASE
        // if (k<x){
        //     return 0;
        // }

        // int totalWaterNeeded = n*x;

        // int maxBottleFilled = 0;


        // if(totalWaterNeeded <= k){
        //     return n;
        // }else{
        //     int remaingingWater = totalWaterNeeded - k;
        //     maxBottleFilled = n - (remaingingWater / x);
        // }

        // return maxBottleFilled;

        if(x>k)
            System.out.println(0);
        else if(n*x<=k)
            System.out.println(n);
        else
            System.out.println(k/x);
    }
}

