// Create a class FindFactorial to find the factorial of a number

import java.util.Scanner;

public class FindFactorial{
	public static void main (String [] args){
	
		// Create a Scanner class to take the number from user
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number : ");
	
		int number = sc.nextInt();
		
		int temp = number;
		
		if(number <0){
			System.out.print("Number is not a positive integer : ");
			
		}
		
		int factorial = 1;
	
		while(number > 0){
			
		factorial*=number;
		
		number --;
		}
		
		System.out.print(" The factorial of "+temp+" is "+ factorial);
		
		
		sc.close();
	
	}
}