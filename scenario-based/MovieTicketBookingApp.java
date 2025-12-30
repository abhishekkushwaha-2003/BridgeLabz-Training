/* 14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBookingApp {
    public static void main(String[] args) {

        // create a Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // loop for multiple customers (3 customers)
        for (int customer = 1; customer <= 3; customer++) {

            System.out.println("Enter details for Customer : " + customer);

            // taking movie type as input
            System.out.println("Enter Movie Type (1-Hollywood, 2-Bollywood, 3-South): ");
            int movieType = sc.nextInt();

            // taking seat type as input
            System.out.println("Enter Seat Type (1-Gold, 2-Silver): ");
            int seatType = sc.nextInt();

            // taking snacks choice as input
            System.out.println("Do you want Snacks? (1-Yes, 2-No): ");
            int snacksChoice = sc.nextInt();

            int ticketPrice = 0;
            int snacksPrice = 0;

            // switch case for movie type
            switch (movieType) {
                case 1:
                    ticketPrice = 200;
                    break;
                case 2:
                    ticketPrice = 150;
                    break;
                case 3:
                    ticketPrice = 180;
                    break;
                default:
                    System.out.println("Invalid Movie Type");
                    continue;
            }

            // if-else for seat type
            if (seatType == 1) {
                ticketPrice += 100; // gold seat extra charge
            } else if (seatType == 2) {
                ticketPrice += 50;  // silver seat extra charge
            } else {
                System.out.println("Invalid Seat Type");
                continue;
            }

            // if condition for snacks
            if (snacksChoice == 1) {
                snacksPrice = 80;
            }

            // calculating total bill
            int totalAmount = ticketPrice + snacksPrice;

            System.out.println("Total Ticket Price for Customer " + customer + " : " + totalAmount + " Rupees\n");
        }

        // closing scanner
        sc.close();
    }
}
