// Create a class  PrimeNumberCheck to check the prime number

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
	
	
		// create a scanner object to take user input 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
		
        int number = sc.nextInt();
		
		// create a boolean variable isPrime and assigning it as true

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

			// Printing the output 

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        sc.close();
    }
}
