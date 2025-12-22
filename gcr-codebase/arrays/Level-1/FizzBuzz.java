// Create a class FizzBuzz to print fizz, buzz and fizzbuzz 

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

		// create scanner object to take user input

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
		
		// check for negative number 

        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        // String array to store results
        String[] result = new String[number + 1];

        // Store FizzBuzz values
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                result[i] = "FizzBuzz";
				}
            else if (i % 3 == 0){
                result[i] = "Fizz";
				}
            else if (i % 5 == 0){
                result[i] = "Buzz";
				}
            else {
                result[i] = String.valueOf(i);
				}
        }

        // Displaying output
        for (int i = 1; i <= number; i++) {
		
            System.out.println("Position " + i + " = " + result[i]);
        }

        sc.close();
    }
}
