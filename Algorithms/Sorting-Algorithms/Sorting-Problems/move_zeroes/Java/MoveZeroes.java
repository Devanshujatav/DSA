// Problem Statement : Move Zeroes to the end of the array.....


import java.util.*;
import java.lang.*;
import java.io.*;

public class MoveZeroes{
	
	public static void moveZeroes(int[] arr){
		int n = arr.length;
		
		boolean flag = false;
		
		
		for(int i=0 ; i<n ; i++){
			for(int j=i+1 ; j<n-i-1 ; j++){
			
				// finding elements where j -> 0 and j+1 -> non-zero
				if(arr[j] == 0 && arr[j+1] != 0){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					flag = true;
				}
			}
			
			if(flag == false){
				break;
			}
		}
		
		for (int val : arr){
			System.out.print(val + " ");
		}
		

	}
	
	public static void main(String[] args){
		int[] arr = {4,6,0,1,0,2,3};
		
		moveZeroes(arr);
		
		System.out.println();
	}
}
