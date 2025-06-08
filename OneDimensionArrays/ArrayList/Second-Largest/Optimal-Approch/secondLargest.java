import java.io.*;
import java.util.*;

class secondLargest{
	
	private static int SecondLargest(ArrayList<Integer> list){
		
		// Edge Case
		if (list.size() < 2 ) return -1;
		
		int largest = Integer.MIN_VALUE;
		int sLargest = Integer.MIN_VALUE;
		
		for(int i=0 ; i<list.size() ; i++){
			if (list.get(i) > largest){
				sLargest = largest;
				largest = list.get(i);
			}
			
			else if(list.get(i) > sLargest && list.get(i) != largest){
				sLargest = list.get(i);
			}
		}
		
		
		return sLargest;
		
	}
	
	public static void main (String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(5);
		
		int ans = SecondLargest(list);
		
		System.out.print("Second Largest : " + ans);
	}

}
