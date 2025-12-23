// Create a program to check different special numbers
// like prime, neon, spy, automorphic and buzz number

public class NumberCheckerFour {

    public static void main(String[] args) {

        int number = 7;

        // check prime number
		
        System.out.println("Is Prime Number : " + isPrime(number));

        // check neon number
		
        System.out.println("Is Neon Number : " + isNeon(number));

        // check spy number
		
        System.out.println("Is Spy Number : " + isSpy(number));

        // check automorphic number
		
        System.out.println("Is Automorphic Number : " + isAutomorphic(number));

        // check buzz number
		
        System.out.println("Is Buzz Number : " + isBuzz(number));
    }

    // Method to check prime number
	
    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check neon number
    // sum of digits of square = number
	
    public static boolean isNeon(int number) {

        int square = number * number;
        int sum = 0;

        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check spy number
    // sum of digits = product of digits
	
    public static boolean isSpy(int number) {

        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit;
            product = product * digit;
            number = number / 10;
        }

        return sum == product;
    }

    // Method to check automorphic number
    // square ends with the number itself
	
    public static boolean isAutomorphic(int number) {

        int square = number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp = temp / 10;
            square = square / 10;
        }
        return true;
    }

    // Method to check buzz number
    // divisible by 7 or ends with 7
	
    public static boolean isBuzz(int number) {

        if (number % 7 == 0 || number % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }
}
