// Create a class FindFactorOfNumber to find the factor of a number

import java.util.Scanner;
public class FindFactorOfNumber{
	public static void main (String []args){
	
		// Creating a scanner object to take number as input
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = sc.nextInt();
		
		// checking for positive integer
		
		if(number > 0){
			
			// loop for checking perfect divisibility
			
			for(int i=1; i<number; i++){
			if(number % i == 0){
			
			System.out.println("The number "+number+" is perfectly divisible by "+ i);
			
			} else {
			
			System.out.println("The number "+number+" is not perfectly divisible by "+ i);
			
			}
			

			}
		
			
		        } else {
		
				System.out.println("Number is not a positive interger!");
		
				}
		
		
				sc.close();
	
	}
}