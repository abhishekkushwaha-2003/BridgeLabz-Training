import java.util.*;
public class DistanceConversionUsingScanner{
	public  static void main(String [] args){
		
		double km;
		double miles;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in kilometer : ");

		km = sc.nextDouble();

		miles = km/1.6;

		System.out.print(" The total miles is "+ miles +" mile for the given "+ km +" km");

		}
}