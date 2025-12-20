// Create a class FindFactorialsingForLoop to find the factorial of a number using for loop

import java.util.Scanner;

public class FindFactorialUsingForLoop{
	public static void main (String [] args){
	
		// Create a Scanner class to take the number from user
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a number : ");
	
		int number = sc.nextInt();
	
		int factorial = 1;
	
		if(number < 0 ){
		System.out.print("Number is not a positive integer");
		}
	
		for(int i=1; i<=number; i++){
		
		factorial*=i;
		
	
		}
		
		System.out.print(" The factorial of "+number+" is "+ factorial);
		
		sc.close();
	
	}
}