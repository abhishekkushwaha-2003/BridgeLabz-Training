// create a class CountNumberOfDigits to count the number of digits 

import java.util.Scanner;

public class CountNumberOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize count variable
        int count = 0;

        // while Loop for iteration
        while (number != 0) {

            //  Remove last digit
			
            number = number / 10;

            count++;
        }

        // Display result
		
        System.out.println("Number of digits : " + count);

        sc.close();
    }
}
