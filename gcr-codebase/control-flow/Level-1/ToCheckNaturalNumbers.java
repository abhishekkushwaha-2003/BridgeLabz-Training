// Create a class ToCheckNaturalNumbers to check for the natural number and write the sum of n natural numbers 

import java.util.Scanner;
public class ToCheckNaturalNumbers{
	public static void main (String [] args){

		//Create scanner object  
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a number : ");

		int number = sc.nextInt();

		int sum = number * (number+1) / 2; 

		// Checking condtion for natural number

		if(number >= 0 ){
		
		System.out.print("The sum of "+number+" natural numbers is "+ sum );

			} else {
	
	       System.out.print("The number " +number+"is not a natural number");
		
		}

		sc.close();
		
	}
}
