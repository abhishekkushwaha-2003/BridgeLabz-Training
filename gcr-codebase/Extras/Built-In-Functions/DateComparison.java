// Program to compare two dates

// Scanner for taking user input
import java.util.Scanner;
import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take first date input from user
        System.out.print("Enter first date (yyyy-mm-dd): ");
        String firstDateInput = input.nextLine();

        // Take second date input from user
        System.out.print("Enter second date (yyyy-mm-dd): ");
        String secondDateInput = input.nextLine();

        // Convert input strings to LocalDate
        LocalDate firstDate = LocalDate.parse(firstDateInput);
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Check if first date is before second date
        if (firstDate.isBefore(secondDate)) {

            System.out.println("First date is before second date");

        }
        // Check if first date is after second date
        else if (firstDate.isAfter(secondDate)) {

            System.out.println("First date is after second date");

        }
        // Check if both dates are equal
        else if (firstDate.isEqual(secondDate)) {

            System.out.println("Both dates are the same");

        }

        input.close();
    }
}
