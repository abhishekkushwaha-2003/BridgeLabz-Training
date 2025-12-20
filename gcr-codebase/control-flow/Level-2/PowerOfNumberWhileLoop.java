//Creatte a clas PowerOfNumberWhileLoop to  print the power of a number using while loop

import java.util.Scanner;

public class PowerOfNumberWhileLoop {

    public static void main(String[] args) {
		
		//create scanner class to take user input
		
        Scanner sc = new Scanner(System.in);
		
		// Assign values 

			System.out.print("Enter number: ");
			int number = sc.nextInt();

			System.out.print("Enter power: ");
			int power = sc.nextInt();
			
			// initialize result and counter

			int result = 1;
			int counter = 0;
			
			// whille loop for iteration

			 while (counter < power) {
				 result = result * number;
					counter++;
			}

			 System.out.println("Result : " + result);

			 sc.close();
    }
}
