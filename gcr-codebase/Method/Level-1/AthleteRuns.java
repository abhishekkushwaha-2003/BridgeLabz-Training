//An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete


// Create a classs AthleteRuns to find the number of rounds to cover 5 km distance

import java.util.Scanner;

	public class AthleteRuns{
		public static void main (String [] args){
	
		Scanner sc = new Scanner (System.in);
	
		System.out.print("Enter First Side length in meter : ");
	
		double firstSide = sc.nextDouble();
	
		System.out.print("Enter Second Side length in meter : ");
	
		double secondSide = sc.nextDouble(); 
	
		System.out.print("Enter Third Side length in meter : ");
	
		double thirdSide = sc.nextDouble(); 
		
		// calling the method
	
		distanceCalculate(firstSide, secondSide, thirdSide);
		
		sc.close();
	
	
	} // create a method distanceCalculate to calculate distance 
	
	  public static void distanceCalculate(double firstSide, double secondSide, double thirdSide){
	
	  double perimeter = firstSide + secondSide + thirdSide;
	  
	  double distance = 5*1000;
	  
	  double round = distance / perimeter;
	  
	  // printing result
	  
	  System.out.print("The number of rounds user needs to do to complete 5km run are "+ round);
	
	}
}