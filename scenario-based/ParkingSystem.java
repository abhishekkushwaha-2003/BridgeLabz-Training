// Parking Lot Gate System 🚗
	  
import java.util.Scanner;	  
public class ParkingSystem{
	public static void main(String [] args){
	
	// Scanner object to take user input
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Welcome to ParkingSystem!");
	
	
	int parkingCapacity = 10;
	int parkedCar = 0;
	
	while(true){
	System.out.println("Choose Option : ");
	System.out.println("1 For Parking");
	System.out.println("2 For Exit!");
	System.out.println("3 For Check Occupancy");

	
	// create int variable number to store the value given by user
	int number = sc.nextInt();
	if(number == 2 || parkingCapacity < parkedCar){
		System.out.println("Exit");
		break;
	}
	switch (number){
		
		// if parking capacity is vacant then car parked
		case 1 : {
		System.out.println("Car Parked!");
		parkedCar++;
		break;
		}
		
		// this case shows occupied space and remaining space
        case 3 : {
        System.out.println("Total Capacity : "+parkingCapacity);
		System.out.println("Space Occupied : "+parkedCar);
		System.out.println("Remaining Space : "+(parkingCapacity - parkedCar));
		break;
		}		
		
		// If user enters another option
		default : {
		System.out.println("Invalid Option!");
		break;
		}
		
	
	}
	
}
	
	}
	
}	  
	  