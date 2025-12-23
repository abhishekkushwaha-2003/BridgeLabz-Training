// Create a program to perform different operations on a number
// like digit count, sum of digits, sum of squares, Harshad check
// and frequency of digits

// create a class NumberCheckerTwo
public class NumberCheckerTwo {

    public static void main(String[] args) {

        int number = 2121;

        // find count of digits
        int count = countDigits(number);
        System.out.println("Total digits in number : " + count);

        // store digits in array
        int[] digits = storeDigits(number);

        // display digits
        System.out.println("Digits of the number are : ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // find sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits : " + sum);

        // find sum of squares of digits
        int squareSum = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits : " + squareSum);

        // check harshad number
        boolean harshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number : " + harshad);

        // find frequency of digits
        int[][] freq = digitFrequency(digits);

        System.out.println("Digit  Frequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + "      " + freq[i][1]);
            }
        }
    }

    // Method to count number of digits in a number
    public static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public static int[] storeDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {

        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum = sum + digits[i];
        }
        return sum;
    }

    // Method to find sum of squares of digits using Math.pow()
    public static int sumOfSquaresOfDigits(int[] digits) {

        int sum = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }

    // Method to check if number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {

        int sum = sumOfDigits(digits);

        if (number % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Method to find frequency of each digit
    // 2D array - digit in first column and frequency in second column
    public static int[][] digitFrequency(int[] digits) {

        int[][] freq = new int[10][2];

        // initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        // count frequency
        for (int i = 0; i < digits.length; i++) {
            freq[digits[i]][1]++;
        }

        return freq;
    }
}
