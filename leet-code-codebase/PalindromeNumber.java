// leetcode 9. Palindrome Number

class PalindromeNumber {

    // method to check palindrome number
    public boolean isPalindrome(int x) {

        // condition to check negative numbers
        if (x < 0) {
            return false;
        }

        int n = x;
        int revnum = 0;

        // reversing the number
        while (n > 0) {
            int d = n % 10;
            revnum = revnum * 10 + d;
            n = n / 10;
        }

        // comparing original and reversed number
        if (revnum == x) {
            return true;
        } else {
            return false;
        }
    }

    // main method added
    public static void main(String[] args) {

        PalindromeNumber obj = new PalindromeNumber();

        int x = 121;   // test value

        boolean result = obj.isPalindrome(x);

        System.out.println(result);
    }
}
