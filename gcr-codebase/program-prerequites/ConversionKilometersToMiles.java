import java.util.Scanner;
public class ConversionKilometersToMiles {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		double kilometer = sc.nextDouble();
		double miles = kilometer * 0.621371;

		System.out.println(miles);
	}
}