// Program to convert temperatures between Fahrenheit and Celsius
import java.util.Scanner;

class TemperatureConverter {

    // Function to convert Celsius to Fahrenheit
	
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
	
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to display conversion results
	
    public static void displayResult(double originalTemp, double convertedTemp, String fromUnit, String toUnit) {
        System.out.println(originalTemp + " " + fromUnit + " is equal to " + convertedTemp + " " + toUnit);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for temperature value
		
        System.out.print("Enter the temperature value: ");
        double temp = input.nextDouble();

        // Ask user for conversion choice
		
        System.out.print("Convert to (1) Fahrenheit or (2) Celsius? Enter 1 or 2: ");
        int choice = input.nextInt();

        // Perform conversion based on user choice
		
        if (choice == 1) {
            double result = celsiusToFahrenheit(temp);
            displayResult(temp, result, "Celsius", "Fahrenheit");
        } else if (choice == 2) {
            double result = fahrenheitToCelsius(temp);
            displayResult(temp, result, "Fahrenheit", "Celsius");
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        input.close();
    }
}
