/* 12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break). */

import java.util.Scanner;

public class TrainReservationQueue  {
    public static void main(String[] args) {

        // create Scanner object
        Scanner sc = new Scanner(System.in);

        // variable to store total seats
        int totalSeats = 1;
			System.out.println("Welcome To Indian Railways!\n");
			
			
			
			// condition to check seat availability 
			while(true){
				
			if(totalSeats == 0){
				System.out.println("Seats are Full ");
				break;
			}
				
			System.out.println("From Station : ");
			String currentStation = sc.next();
            System.out.println("To Station : ");
			String destinationStation = sc.next();
			
	        System.out.println("1. for JANSHATABDI EXPRESS \n2. for AMARKANTAK EXPRESS \n3. for INTERSITY \n4. for VANDE BHARAT");

            int trainName = sc.nextInt();
			
            // switch case to show 
            switch (trainName) {
                case 1:
                    System.out.println("You have successfully booked seat in JANSHATABDI EXPRESS From "+currentStation+" To "+destinationStation);
                    break;

                case 2:
                    System.out.println("You have successfully booked seat in AMARKANTAK EXPRESS From "+currentStation+" To "+destinationStation);
                    break;

                case 3:
                    System.out.println("You have successfully booked seat in INTERSITY From "+currentStation+" To "+destinationStation);
                    break;

                case 4:
                    System.out.println("You have successfully booked seat in VANDE BHARAT From "+currentStation+" To "+destinationStation);
                    break;

                default:
                    System.out.println("Invalid station or train selected");
            }
            totalSeats--;
            // asking user if they want to book ticket again
            System.out.println();
            System.out.print("Do you want to book ticket again? (y/n): ");
			
			char choice = sc.next().toLowerCase().charAt(0);
			
			if(choice != 'y'){
				break;
			}

        

        
			}
			System.out.println("Thank you for using Indian Railways!");
			System.out.println("------------------------------------");
			sc.close();
    }
}