// Create a class FizzBuzz for a program to perform some task on multiple of 3, 5, and both

import java.util.Scanner;
public class FizzBuzz{
	public static void main (String []args){
	
		// Creating a scanner object to take number as input
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		int number = sc.nextInt();
		
		for(int i=0; i<=number; i++){
		
			if(i % 3 == 0 && i % 5 == 0){
			
			System.out.println("FizzBuzz");
			
			} else if (i % 3 == 0){
			
			System.out.println("Fizz");

			
			} else if (i % 5 == 0){
			
			System.out.println("Buzz");

			
			} else {
			
			System.out.println(i);
			
				}
		
			
			}
		
		
		sc.close();
	
	}
}