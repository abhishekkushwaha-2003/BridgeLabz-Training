// Program to calculate GCD and LCM of two numbers
import java.util.Scanner;

class GcdLcmCalculator {

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using the relation LCM * GCD = a * b
	
    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    // Function to display results
	
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("For numbers " + a + " and " + b + ":");
        System.out.println("GCD is: " + gcd);
        System.out.println("LCM is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
		
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Calculate GCD and LCM
		
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        // Show results
		
        displayResult(num1, num2, gcd, lcm);

        input.close();
    }
}
