import java.util.*;

//Program to check the number is divisible by 5 or not

public class IsnumberDivisibleBy5
{
	public static void main (String [] args){
	
		// Using scanner class to take input from user		

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter aNumber : "); 

		// create int variable number and assigning it value given by user

		int number = sc.nextInt();

		//Checking which condition is true

		if(number % 5 == 0){

		System.out.print("Is the number "+number+" divisible by 5? "+"Yes");

		} else {

		System.out.print("Is the number "+number+" divisible by 5? "+"No");

		}
		
	}
}