// Write a Java program to simulate Metro Smart Card Fare Deduction system.

import java.util.Scanner;
public class MetroSmartCard{


	public static void main(String[] args){
	
	    
		// Create a Scanner object to take input from user
	
		Scanner sc = new Scanner(System.in);
		//initial smart card balance
		double balance = 100; 
		
		System.out.println("Distance 0 to 5 km  : 10 Rs.");
		System.out.println("Distance 5 to 15 km : 20 Rs.");
		System.out.println("Distance more than 15 km : 30 Rs.");
	 
	    // using while loop until balance is greater than 0
		while(balance > 0){
			
			System.out.println();
			System.out.println("Current Balance : "+balance+" Rs.");
			System.out.println("Enter distance traveled (or -1 to quit): ");
		
			int distance = sc.nextInt();
	
			//Exit condition
			if(distance == -1){
				break;
			}
		
			int fare = calculateFare(distance);
			
			System.out.println("Fare : "+fare+" Rs.");
			
			//check sufficient balance
			if(balance >= fare){
				balance = deductBalance(balance, fare);
				displayBalance(balance);
				
			}
			
			else{
				System.out.println("Insufficient balance. Please recharge.");
				break;
			}
		}
		
		System.out.println("Thank you for using Delhi Metro");
		sc.close();
	}

	//calculate fare using ternary operator
	public static int calculateFare(int distance){
	
		return (distance <= 5) ? 10 : (distance <= 15) ? 20 : 30;
	}
	
	public static double deductBalance(double balance, int fare){
		return balance - fare;
	}
	
	public static void displayBalance(double balance){
		System.out.println("Remaining Balance : "+balance+" Rs.");
	}
	
}