// Create a class BonusOfEmployeee to find the bonus 

import java.util.Scanner;

public class BonusOfEmployeee{
	public static void main (String [] args){
	
		// Create a Scanner class to take the number from user
	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter salary : ");
		
		
		// Assigning values
	
		int salary = sc.nextInt();
		
		System.out.print("Enter year of service: ");
	
		int yearOfService = sc.nextInt();
		
		
		// checking condition
		
		if(yearOfService < 5){
		
		System.out.print("You are not eligible for bonus!");
		
		} else {
		
		int bonus = (salary*5)/100;
		
		// printing bonus amount 
		
		System.out.print("The bonus amount is : "+ bonus);
		
		}
		
		
		sc.close();
	
	}
}