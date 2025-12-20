// create a class SumOfNaturalNumberForLoop to find the sum of n natural numbers using for loop

import java.util.Scanner;
public class SumOfNaturalNumberForLoop{
	public static void main (String [] args){
	
		// Creating Scanner object to take number as input
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		
		int number = sc.nextInt();
		int sum = 0;
		
		if(number < 0){
			System.out.println("It is not a Natural number");
		}
		
		for(int i=1; i<=number; i++){
		
		sum+= i;
		
		}
		
		int sumByFormula = number*(number+1) /2;
		
		if (sum == sumByFormula){
		
		System.out.print("The result from both computations was correct. "+sum+" == "+sumByFormula);
		
		} else {
		
		System.out.print("The result from both computations was not correct. "+sum+" != "+sumByFormula);
		
		}
		
		sc.close();
	
	}
}