// Create a class MultiplicationTable to print the multiplication table of a number

import java.util.Scanner;

public class MultiplicationTable{
	public static void main (String [] args){
	
		// Create a scanner object to take the user input
	
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter a number from 6 and 9 : ");
	
		int number = sc.nextInt();
	
		
		for (int i=1;i<=10;i++){
		
	    int	ans = number*i; 
		
		if(number < 6 || number > 9){
	
		System.out.println("Entered number is out of range!");
		break;
	
		}
		
		System.out.println(number +" * "+ i +" = "+ ans);
		
		}
		
		sc.close();
	
	}
	
}