// create a program LeapYearProgram to check leap year

import java.util.Scanner;

public class LeapYearProgram {

    public static void main(String[] args) {
		
		//Create scanner object to take user input as year

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
		
        int year = sc.nextInt();

        //  LeapYear program only works for year >= 1582
		
		
        if (year >= 1582) {
			
			// checking conditions for leap year 

            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            }
            else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            }
            else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            }
            else {
                System.out.println("Year is not a Leap Year");
            }

        } else {
            System.out.println("Year out of Gregorian  Calender ");
        }

        sc.close();
    }
}
