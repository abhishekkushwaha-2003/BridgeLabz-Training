// Create a class BMIOfPerson to check Harshad Number

import java.util.Scanner;

public class HarshadNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking input fron user 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables
        int originalNumber = number;
        int sum = 0;

        //  Use while loop to find sum of digits
        while (number != 0) {
		
		
			// last digit calculate
            int digit = number % 10; 
			
			// add digit to sum
            sum = sum + digit; 

			// remove last digit
            number = number / 10;    
        }

        //  Check Harshad number condition
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }

        sc.close();
    }
}
