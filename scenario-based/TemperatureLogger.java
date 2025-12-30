/* 11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks. */


// import Scanner class to take user input
import java.util.Scanner;
// create a TemperatureLogger class to find the maximum temperature and avearge Temperature
public class TemperatureLogger{
	
	public static void main (String [] args){
	// create a Scanner object to take user input	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter temperature of last 7 Days in Celcius : ");
	
	// create array to store temperature and variables to store Total Temperature and Maximum Temperature
	double temperature[] = new double [7];
	double temperatureTotal=0;
	double maxTemperature = 0;
	
	// using for loop to store temperature in array
	for(int i=0; i<7;i++){
		System.out.println("Enter Day "+(i+1)+" Temperature : ");
		temperature[i] = sc.nextDouble();
	}
	
	// using for loop to check maximum temperature and Total temperature
	for(int i=0; i<temperature.length; i++){
		temperatureTotal += temperature[i];
		if(temperature[i]>maxTemperature){
			maxTemperature = temperature[i];
		}
	}
	
	// Displaying results as maximum temperature and Total temperature
	double aveargeTemperature = temperatureTotal/temperature.length;
	System.out.println("Maximum temperature of last 7 Days is : "+maxTemperature);
	System.out.printf("The Average temperature of last 7 Days is : "+"%.2f",aveargeTemperature);
	
	sc.close();
	}
}