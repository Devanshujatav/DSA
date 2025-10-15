import java.util.*;
import java.lang.*;
import java.io.*;

class InsertionSortProgram{
	
	private static void InsertionSort(int[] arr){
		int n = arr.length;
		
		// for loop start from 1 index
		for(int i=1 ; i<n ; i++){
			
			// Take a varible j to check the previous element whether greater or smaller.
			int j=i;
			
			while (j>0 && arr[j] < arr[j-1]){
				
				// Swaping the Elements 
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				
				// decrement j by 1
				j--;
			}
		}
	}
	
	public static void main(String[] args){
		int[] arr = {10,54,66,98,22};
		
		InsertionSort(arr);
		
		for (int i : arr){
			System.out.println(i + " ");
		}
	}
}
