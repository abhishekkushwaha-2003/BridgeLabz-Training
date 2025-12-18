// Create a class QuotientAndReminder to find the quotient and remainder of two number

import java.util.Scanner;
public class QuotientAndReminder{
	public static void main (String [] args){
	
	// create Scanner class to take input of two numbers
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter first number : ");
	
		int number1 = sc.nextInt();
	
		System.out.print("Enter second number : ");
	
		int number2 = sc.nextInt();
	
		int quotient = number1 / number2;
	
		int remainder = number1 % number2;
		
		System.out.print("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+number1+" and "+number2);
		
		sc.close();
	
	}
}