// Create a class GreatestFactorProgram to find the greatest factor of a number

import java.util.Scanner;
public class GreatestFactorProgram{
	public static void main (String []args){
	
		// Creating a scanner object to take number as input
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		//assigning values
		
		int number = sc.nextInt();
		
		int greatestFactor = 1;
		
		for(int i=number-1; i>= 1; i--){
		
		if(number % i == 0){
		
		greatestFactor = i;
		break;
				
				}
			
			}
			
			System.out.print("The Greatest factor of number "+ number+" is "+ greatestFactor);
		
		
		sc.close();
	
	}
}