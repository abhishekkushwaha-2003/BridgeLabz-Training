// Write a program calculate the wind chill temperature given the temperature and wind speed


import java.util.Scanner;

// Create a class WindChillTemperatureCalculator to calculate the wind chill temperature

public class WindChillTemperatureCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed : ");
        double windSpeed = sc.nextDouble();

        // Calling  method
        double windChill = calculateWindChill(temperature, windSpeed);

        // printing the result
        System.out.print("The wind chill temperature is: %.2f°F\n", windChill);

        sc.close();
    }

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
	
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		
        return windChill;
    }
}
