// QUERY : Program to check whether the number is starting from a number which is greater than 0 and the number has 5 digits only...

import java.util.*;
import java.lang.*;
import java.io.*;

class program{

	private static void isValid(int n){
		int count = 1;
		
		
		while(n>=1){
			if (1 <= n && n<= 9) break;

			n = n/10;
			
			count++;
			
			//System.out.println(n + " " + count);
			// System.out.println(count);
		}
		
		if (n > 0 && count == 5){
			System.out.println("YES");
		}else{
			System.out.println("No");
		}
	}

	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		int n = input.nextInt();
		
		isValid(n);		
	}
}
