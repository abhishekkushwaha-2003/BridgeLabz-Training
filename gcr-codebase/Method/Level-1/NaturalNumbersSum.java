// Write a program to find the sum of n natural numbers using loop

//create a class NaturalNumbersSum to find sum of n natural numbers
import java.util.Scanner;
public class NaturalNumbersSum{
	
	public static void main(String [] args){
	
		//create a scanner object
		
		Scanner sc = new Scanner(System.in);
	
		//taking input from the user number
		
		System.out.print("Enter a number : ");
		int number = sc.nextInt();
	
		int sum = calculateSumOfNaturalNumbers(number);
	
		//display a result	
		
		System.out.print("The sum of Natural number : "+sum);
		
		sc.close();
		
	}
	
	// Create a method calculateSumOfNaturalNumbers for calculation
	
	public static int calculateSumOfNaturalNumbers(int number){

		int sum = 0;
		
		//checking  a number is natural or not
		
		if(number > 0){
			for(int i = 1; i<=number; i++){
			sum += i;
			}
		}
		return sum;
		
	}
	
}
	