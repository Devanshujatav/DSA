import java.util.*;
import java.io.*;
import java.lang.*;

class test{
	
	private static int isValid(int n){
		
		int count = 1;
		
		int ans = 0;
		
		
		//BASE CASE
		if(n>=1 && n<=9){
			return 1;
		}
			
		// Recursive Case
		isValid(n/10);
		
		// Self Work				
		count++;
		
		if(count == 5){
			ans = 1;
		}
		
		return ans;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		
		int n = input.nextInt();
		
		int ans = isValid(n);
		
		if(ans == 1){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
