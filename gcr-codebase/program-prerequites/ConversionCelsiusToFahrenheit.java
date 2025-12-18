import java.util.Scanner;
public class ConversionCelsiusToFahrenheit {
	public static void main(String [] args) {
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter temperature in Celsius : ");
	       int Celsius = sc.nextInt();
	       double Fehrenheit = (Celsius * 9/5) + 32.;
               System.out.println("Tempearture in Fehrenheit is "+ Fehrenheit);
	}
}