// Create a class FindFactorOfNumberUsingWhileLoop to find the factor of a number using whilke loop

import java.util.Scanner;
public class FindFactorOfNumberUsingWhileLoop{
	public static void main (String []args){
	
		// Creating a scanner object to take number as input
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = sc.nextInt();
		
		// Checking for positive integer
		
		if(number > 0){
		
		// creating a counter variable
		
		    int counter = 1;
			while(counter < number){
			if(number % counter == 0){
			
			System.out.println("The number "+number+" is perfectly divisible by "+ counter);
			
			} else {
			
			System.out.println("The number "+number+" is not perfectly divisible by "+ counter);
			
			
			}
			counter++;
			}
			
		        } else {
		
				System.out.println("Number is not a positive interger!");
		
				}
		
		
				sc.close();
	
	}
}