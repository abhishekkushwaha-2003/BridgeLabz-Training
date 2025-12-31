/*19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.*/

import java.util.Scanner;
public class BusRouteDistanceTracker{
	public static void main(String[] args){
		// create a Scanner object to take user input
		Scanner sc = new Scanner(System.in);

		int totalDistance = 0;
		int stop = 1;
		char choice = 'n';

		// while loop for bus stops
		while(true){
			System.out.print("Enter distance covered till Stop " + stop + ": ");
			int distance = sc.nextInt();

			totalDistance += distance;
			// asking user to get off or want to go more
			System.out.print("Do you want to get off at this stop? (y/n): ");
			choice = sc.next().toLowerCase().charAt(0);

			if(choice == 'y'){
				break;
			}

			stop++;
		}
		// displaying total distance travelled by the user
		System.out.println("Total distance travelled: " + totalDistance + " km");

		sc.close();
	}
}
