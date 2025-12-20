// Write a program to check whether a number is positive, negative, or zero.


// Create a classs CheckNumber to find the number is positive, negative or zero

import java.util.Scanner;

	public class CheckNumber{
		public static void main (String [] args){
	
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Enter Number : ");
	
		double number = sc.nextDouble();
		
		// calling the method
	
		numberChecking(number);
		
		sc.close();
	
	
	} // create a method numberChecking to check the number
	
	  public static int numberChecking(double number){
	
	  if(number < 0){
	   return -1;
	  
	  } else if(number == 0){
	   result 0;;
	  
	  } else {
	   return 1;
	  
	  }
	
	}
}