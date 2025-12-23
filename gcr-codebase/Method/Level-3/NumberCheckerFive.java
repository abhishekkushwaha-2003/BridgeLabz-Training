// Create a program to check if a number is perfect, abundant, deficient or strong number

public class NumberCheckerFive {

    public static void main(String[] args) {

        int number = 28;

        // check perfect number
		
        System.out.println("Is Perfect Number : " + isPerfect(number));

        // check abundant number
		
        System.out.println("Is Abundant Number : " + isAbundant(number));

        // check deficient number
		
        System.out.println("Is Deficient Number : " + isDeficient(number));

        // check strong number
		
        System.out.println("Is Strong Number : " + isStrong(number));
    }

    // Method to calculate sum of proper divisors of a number
	
    public static int sumOfProperDivisors(int number) {

        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    // Method to check perfect number
	
    public static boolean isPerfect(int number) {

        int sum = sumOfProperDivisors(number);

        return sum == number;
    }

    // Method to check abundant number
	
    public static boolean isAbundant(int number) {

        int sum = sumOfProperDivisors(number);

        return sum > number;
    }

    // Method to check deficient number
	
    public static boolean isDeficient(int number) {

        int sum = sumOfProperDivisors(number);

        return sum < number;
    }

    // Method to calculate factorial of a number
	
    public static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    // Method to check strong number
    // sum of factorial of digits = number
	
    public static boolean isStrong(int number) {

        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }

        return sum == number;
    }
}
