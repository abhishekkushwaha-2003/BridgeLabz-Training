// Create a class SumOfNumberUntilZeroUsingBreakStatement to get the sum until the user enters zero

import java.util.Scanner;
public class SumOfNumberUntilZeroUsingBreakStatement{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Number : ");
		
		double number = sc.nextDouble();
		
		double total = 0.0;
		while(true){
		
		     total+=number;
			 
			 System.out.print("Enter another number : ");
			 number=sc.nextDouble();
			 if(number < 1){
			 break;
			 }
		
			}
			System.out.print("Total value is : "+total);
	
		}
	}