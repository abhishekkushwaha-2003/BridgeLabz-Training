// Create a program to find factors of a number and perform various operations

public class FindFactor {

    public static void main(String[] args) {

        int number = 12;

        // find factors of number
		
        int[] factors = findFactors(number);

        // display factors
		
        System.out.print("Factors of " + number + " are: ");
        printArray(factors);

        // find greatest factor
		
        int greatest = greatestFactor(factors);
        System.out.println("Greatest factor: " + greatest);

        // find sum of factors
		
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);

        // find product of factors
		
        int product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);

        // find product of cube of factors
		
        double cubeProduct = productOfCubeOfFactors(factors);
        System.out.println("Product of cube of factors: " + cubeProduct);
    }

    // Method to find factors of a number and return them as an array
	
    public static int[] findFactors(int number) {

        // first loop to count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // second loop to store factors
		
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find greatest factor
	
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    // Method to find sum of factors
	
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find product of factors
	
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find product of cube of factors using Math.pow()
	
    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    // Helper method to print array
	
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
