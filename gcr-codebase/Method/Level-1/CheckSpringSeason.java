// Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 


import java.util.Scanner;
//create a class CheckSpringSeason to check the season is Spring Season or not
public class CheckSpringSeason{

	public static void main(String [] args){
		
		// Create a scanner object 
	
	Scanner sc = new Scanner (System.in);
		
		//taking input 
		
		System.out.print("Enter Month : ");
		int month = sc.nextInt();
		
		System.out.print("Enter Day : ");
		int day =  sc.nextInt();
		
		
		  boolean isSpring = checkSpringSeason(month, day);
		
		//display a result 
		if(isSpring){
			System.out.print("It is a Spring Season");
		}
		else{
			System.out.print("Not a Spring Season");
		}
		
	}
	
	
	  // Create a method checkSpringSeason to check the season is spring or not 
	public static boolean checkSpringSeason(int month, int day){
		
		// Checking condition
		
		if(month > 3 && month < 6){
			return true;
		}
		else if (month == 3 && day >= 20 || month == 6 && day <= 20){
			return true;
		}
		else{
			return false;
		}
	
	}
	
}
		
		