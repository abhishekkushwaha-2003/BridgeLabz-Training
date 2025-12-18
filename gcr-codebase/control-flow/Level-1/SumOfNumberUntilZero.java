// Create a class SumOfNumberUntilZero to get the sum until the user enters zero

import java.util.Scanner;
public class SumOfNumberUntilZero{
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Number : ");
		
		double number = sc.nextDouble();
		
		double total = 0.0;
		while(number!=0){
		
		     total+=number;
			 
			 System.out.print("Enter another number : ");
			 number=sc.nextDouble();
		
			}
			System.out.print("Total value is : "+total);
	
		}
	}