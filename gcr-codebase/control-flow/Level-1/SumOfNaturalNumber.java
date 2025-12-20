// create a class SumOfNaturalNumber to find the sum of n natural numbers

import java.util.Scanner;
public class SumOfNaturalNumber{
	public static void main (String [] args){
	
		// Creating Scanner object to take number as input using while loop
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		
		int number = sc.nextInt();
		int sum = 0;
		
		if(number < 0){
			System.out.println("It is not a Natural number");
		}
		int sumByFormula = number*(number+1)/2;
		
		while (number > 0){
		
		sum += number;
		
		number--;
		
		}
		
		
		
		if (sum == sumByFormula){
		
		System.out.print("The result from both computations was correct "+sum+" == "+sumByFormula);
		
		} else {
		
		System.out.print("The result from both computations was not correct "+sum+" != "+sumByFormula);
		
		}
		
		sc.close();
	
	}
}