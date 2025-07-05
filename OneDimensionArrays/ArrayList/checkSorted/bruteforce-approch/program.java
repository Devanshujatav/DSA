// QUERY : Check array is sorted or not

import java.util.*;
import java.lang.*;
import java.io.*;

class program{
	
	private static boolean checkSorted(ArrayList<Integer> list){
		for(int i=0 ; i<list.size()-1 ; i++){
			for(int j=i+1 ; j<list.size() ; j++){
				if(list.get(j) < list.get(i)){
					return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(8);
		list.add(5);
		
		System.out.println("Is array sorted : " + checkSorted(list));
	}
}
