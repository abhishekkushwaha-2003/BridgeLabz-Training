// Create a class EvenOrOdd to find even and odd numbers

import java.util.Scanner;

public class EvenOrOdd{
	public static void main (String [] args){

		// Create a scanner class to take input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number : ");
		
		int number = sc.nextInt();
		
		for(int i =1; i< number; i++){
		
		if(i % 2 == 0){
		
		System.out.println("The number "+i+" is Even");
		
		
			} else {
			
			System.out.println("The number "+i+" is Odd");
			
			}
		}	
		
		sc.close();
	}

}
