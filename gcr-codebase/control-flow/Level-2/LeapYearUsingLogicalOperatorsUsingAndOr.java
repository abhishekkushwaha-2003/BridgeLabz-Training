// create a LeapYearUsingLogicalOperatorsUsingAndOr to check leap year with logical AND, OR

import java.util.Scanner;

public class LeapYearUsingLogicalOperatorsUsingAndOr {

    public static void main(String[] args) {
	
	// create scanner object to take year as input 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();
		
		// checking conditions for leap year

			if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
				System.out.println("Year is a Leap Year");
			
			} else if (year >= 1582) {
				System.out.println("Year is not a Leap Year");
			
			} else {
				System.out.println("Year must be 1582 or later");
			}

			sc.close();
    }
}
