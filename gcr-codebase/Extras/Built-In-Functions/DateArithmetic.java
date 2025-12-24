// Program to perform date arithmetic operations

// Scanner for taking user input
import java.util.Scanner;
import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take date input from user in yyyy-mm-dd format
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String dateInput = input.nextLine();

        // Convert input string to LocalDate
        LocalDate givenDate = LocalDate.parse(dateInput);

        // Add 7 days to the date
        LocalDate updatedDate = givenDate.plusDays(7);

        // Add 1 month to the date
        updatedDate = updatedDate.plusMonths(1);

        // Add 2 years to the date
        updatedDate = updatedDate.plusYears(2);

        // Subtract 3 weeks from the date
        updatedDate = updatedDate.minusWeeks(3);

        // Display final date
        System.out.println("Final Date after calculations: " + updatedDate);

        input.close();
    }
}
