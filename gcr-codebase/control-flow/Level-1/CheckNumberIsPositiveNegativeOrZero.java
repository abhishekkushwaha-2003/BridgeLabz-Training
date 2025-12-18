// Create a class CheckNumberIsPositiveNegativeOrZero to check the given number is positive, negative or zero

import java.util.Scanner;

public class CheckNumberIsPositiveNegativeOrZero{
	public static void main (String [] args){

		Scanner sc = new Scanner(System.in);

		// taking input from user 

		System.out.print("Enter a number : ");

		int number = sc.nextInt();


		// checking the conditions 

		if(number == 0){

		System.out.print("The number is Zero");

		
		} else if(number >= 0){

		System.out.print("The number is Positive");

		
		} else{

		System.out.print("The number is Negative");
		
		}

		sc.close();


	}


}