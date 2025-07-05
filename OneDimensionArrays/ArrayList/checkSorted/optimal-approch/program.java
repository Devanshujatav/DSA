import java.util.*;
import java.lang.*;
import java.io.*;

class program{
		
	private static boolean isSorted(ArrayList<Integer> list){
		for(int i=1 ; i<list.size() ; i++){
			if(list.get(i) < list.get(i-1)){
				return false;
			}
		}
		return true;
	}
		
		
	public static void main(String[] args){
		
			
		ArrayList<Integer> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Elements in the ArrayList : ");
		for(int i=0 ; i<list.size() ; i++){
			int value = input.nextInt();
			list.add(value);
		}
			
		boolean ans = isSorted(list);
			
		if(ans){
			System.out.println("Array is Sorted.");
		} else{
			System.out.println("Array is not sorted");
		}
	}
}
