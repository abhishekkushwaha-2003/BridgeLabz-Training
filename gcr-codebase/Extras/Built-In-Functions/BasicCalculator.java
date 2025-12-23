// Program for a basic calculator performing +, -, *, /
import java.util.Scanner;

class BasicCalculator {

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
    }

    // Function to display result
    public static void displayResult(double a, double b, double result, String operator) {
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take two numbers from user
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        // Ask user which operation to perform
		
        System.out.println("Choose operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        double result = 0;
        String operator = "";

        // Perform chosen operation
        switch (choice) {
            case 1:
                result = add(num1, num2);
                operator = "+";
                break;
            case 2:
                result = subtract(num1, num2);
                operator = "-";
                break;
            case 3:
                result = multiply(num1, num2);
                operator = "*";
                break;
            case 4:
                result = divide(num1, num2);
                operator = "/";
                break;
            default:
                System.out.println("Invalid choice!");
                input.close();
                return; // exit program
        }

        // Show result
        displayResult(num1, num2, result, operator);

        input.close();
    }
}
