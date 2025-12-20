/* Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint => 
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___” */


// Create a class FindSimpleInterset to calculate Simple interest

import java.util.Scanner;

	public class FindSimpleInterset{
		public static void main (String [] args){
		
		// Taking input and storing them in variable
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Principal Amount : ");
	
		double principalAmount = sc.nextDouble();
	
		System.out.println("Enter Rate of Interest : ");
	
		double interestRate = sc.nextDouble();
	
		System.out.println("Enter Time Duration : ");
	
		double timeDuration = sc.nextDouble();
		
		calculateSimpleInterest(principalAmount, interestRate, timeDuration);
	
	}
	
	public static void calculateSimpleInterest(double principalAmount, double interestRate, double timeDuration){
	
	double interest =  principalAmount * interestRate * timeDuration / 100;
	   
	   System.out.print("The Simple Interest is "+interest+" for Principal "+principalAmount+" , Rate of Interest "+interestRate+" and Time "+timeDuration+" year");
	
	}
}