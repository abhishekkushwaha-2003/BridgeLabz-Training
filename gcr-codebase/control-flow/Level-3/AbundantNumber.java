// Create a class AbundantNumber to check the number is Abundant number or not 

import java.util.Scanner;

public class AbundantNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //taking Input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //  Initialize sum variable
        int sum = 0;

        // for loop 
        for (int i = 1; i < number; i++) {

            //  Check if i is a divisor
            if (number % i == 0) {
                sum += i;  // Add divisor to sum
            }
        }

        //  Checking condition for AbundantNumber
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        sc.close();
    }
}
