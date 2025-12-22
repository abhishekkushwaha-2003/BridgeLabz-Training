// Write a program that takes a year as input and outputs the Year is a Leap Year or not 

// create a class LeapYearOrNot to check for leap year
import java.util.Scanner;
public class LeapYearOrNot {

    public static void main(String[] args) {

        //create Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking year input from user
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Checking Gregorian calendar condition (year >= 1582)
        if (year < 1582) {
            System.out.println("Leap year check is valid only for year 1582 or later.");
            return;
        }

        // Calling method to check leap year
        boolean result = LeapYearOrNot.isLeapYear(year);

        // Displaying result
        if (result) {
            System.out.println(year + " is a Leap Year.");

        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    // Method to check whether the given year is a leap year
    public static boolean isLeapYear(int year) {

        // Check for leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


}
