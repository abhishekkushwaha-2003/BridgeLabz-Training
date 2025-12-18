// create a class RocketLaunch to count the number from user input to launch rocket

import java.util.Scanner;
public class RocketLaunch{
	public static void main (String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");

		int counter = sc.nextInt();

		// while loop for iteration
			
		while( counter > 1){

		System.out.print(counter + "  ");

		counter--;

		}
 

	}

}