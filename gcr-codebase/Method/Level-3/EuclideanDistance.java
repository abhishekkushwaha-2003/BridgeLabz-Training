// Create a class EuclideanDistance for for Euclidean distance between two points as well as the equation of the line using those two points

import java.util.Scanner;
public class  EuclideanDistance{

	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
        //Take coordinates
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
		
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
		
		double distance = findDistance(x1,y1,x2,y2);
		double[] line = findLineEquation(x1,y1,x2,y2);
		
		
		//Display the results
		System.out.println("Euclidean Distance: " + distance);
		System.out.println("Equation: y = " + line[0] + "x + " + line[1]);
	}
	
	//Method to Find Euclidean distance
	
	public static double findDistance (int x1, int y1, int x2, int y2){
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return distance;
	}
	//Method to Find slope and intercept
	
	public static double[] findLineEquation (int x1, int y1, int x2, int y2){
		double m = (double)(y2 - y1) / (x2 - x1);
		double b = y1 - m * x1;
		return new double[] { m, b };
	}

}