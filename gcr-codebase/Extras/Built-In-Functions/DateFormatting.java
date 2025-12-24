// Program to display current date in different formats

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Create formatter for dd/MM/yyyy format
        DateTimeFormatter formatOne = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Create formatter for yyyy-MM-dd format
        DateTimeFormatter formatTwo = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Create formatter for EEE, MMM dd, yyyy format
        DateTimeFormatter formatThree = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display date in dd/MM/yyyy format
        System.out.println("Date in dd/MM/yyyy format: " + currentDate.format(formatOne));

        // Display date in yyyy-MM-dd format
        System.out.println("Date in yyyy-MM-dd format: " + currentDate.format(formatTwo));

        // Display date in EEE, MMM dd, yyyy format
        System.out.println("Date in EEE, MMM dd, yyyy format: " + currentDate.format(formatThree));
    }
}
