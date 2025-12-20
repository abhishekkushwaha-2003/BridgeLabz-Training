// Create a class ArmstrongNumber to check armstrong number

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input input from user
		
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //  Initialize variables
        int originalNumber = number;
        int sum = 0;

        // Use while loop 
        while (originalNumber != 0) {

            //  Get last digit
            int digit = originalNumber % 10;

            //  Find cube of digit and add to sum
            sum = sum + (digit * digit * digit);

            // last digit removing
            originalNumber = originalNumber / 10;
        }

        // Compare sum and number
		
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

        sc.close();
    }
}
