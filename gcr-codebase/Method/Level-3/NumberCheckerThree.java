// Create a program to perform different checks on a number
// like digit count, reverse digits, palindrome check
// array comparison and duck number check

// create a class NumberCheckerThree

public class NumberCheckerThree {

    public static void main(String[] args) {

        int number = 1210;

        // count digits
		
        int count = countDigits(number);
        System.out.println("Total digits : " + count);

        // store digits in array
		
        int[] digits = storeDigits(number);

        System.out.print("Digits array : ");
        printArray(digits);

        // reverse digits array
		
        int[] reverseDigits = reverseArray(digits);

        System.out.print("Reversed digits array : ");
        printArray(reverseDigits);

        // compare original and reversed array
		
        boolean equal = compareArrays(digits, reverseDigits);
        System.out.println("Are both arrays equal : " + equal);

        // check palindrome number
		
        boolean palindrome = isPalindrome(digits, reverseDigits);
        System.out.println("Is Palindrome Number : " + palindrome);

        // check duck number 
		
        boolean duck = isDuckNumber(digits);
        System.out.println("Is Duck Number : " + duck);
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

    // Method to store digits of number in array
	
    public static int[] storeDigits(int number) {

        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    // Method to reverse the digits array
	
    public static int[] reverseArray(int[] digits) {

        int[] reverse = new int[digits.length];
        int j = 0;

        for (int i = digits.length - 1; i >= 0; i--) {
            reverse[j] = digits[i];
            j++;
        }
        return reverse;
    }

    // Method to compare two arrays
	
    public static boolean compareArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check palindrome number using digits
	
    public static boolean isPalindrome(int[] digits, int[] reverseDigits) {

        return compareArrays(digits, reverseDigits);
    }

    // Method to check duck number using digits array
	
    public static boolean isDuckNumber(int[] digits) {

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to print array elements
	
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
