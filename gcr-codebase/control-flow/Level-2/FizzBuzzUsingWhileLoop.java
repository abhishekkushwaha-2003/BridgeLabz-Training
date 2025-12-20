// Create a class FizzBuzzUsingWhileLoop for a program to perform some task on multiple of 3, 5, and both using while loop

import java.util.Scanner;
public class FizzBuzzUsingWhileLoop{
	public static void main (String []args){
	
		// Creating a scanner object to take number as input
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = sc.nextInt();
		
		
		if(number > 0){
			int positiveInteger = 0;
		
			while(positiveInteger <= number){
		
				if(positiveInteger % 3 == 0 && positiveInteger % 5 == 0){
			
				System.out.println("FizzBuzz");
			
				} else if (positiveInteger % 3 == 0){
			
				System.out.println("Fizz");

			
				} else if (positiveInteger % 5 == 0){
			
				System.out.println("Buzz");

			
				} else {
			
				System.out.println(positiveInteger);
			
				}
				
				positiveInteger++;
		
				}
		        } else {
		
				System.out.println("Number is not a positive interger!");
		
				}
		
		
				sc.close();
	
	}
}