// create a class FindDistanceInYardsAndMiles to find the distance in yards and miles

import java.util.Scanner;
public class FindDistanceInYardsAndMiles{
	public static void main (String [] args){
		
		// Create scanner object to take input
		
		Scanner sc = new Scanner (System.in);
		System.out.print(" Enter distance in feet : ");
		
		// Storing 
		
		double distanceInFeet = sc.nextDouble();
		
		double distanceInYards = distanceInFeet/3;
		
		double distanceInMiles = distanceInYards/1760;
		
		// printing output
		
		System.out.print("The distance in yards is "+distanceInYards+" while the distance in miles is "+distanceInMiles);
		
		sc.close();
	
	}
	
}