// create a class RocketLaunch to count the number from user input to launch rocket using for loop 

import java.util.Scanner;
public class RocketLaunchUsingForLoop{
	public static void main (String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");

		int counter = sc.nextInt();

		// for loop for iteration
			
		for(int i = counter; i > 1 ; i --){

		System.out.print(i + "  ");

		}
 

	}

}
