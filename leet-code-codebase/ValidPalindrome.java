// 125. Valid Palindrome

class ValidPalindrome {

    // method to check valid palindrome
    public boolean isPalindrome(String s) {

        String s1 = "";

        // remove non-alphanumeric characters
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'
                    || s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
                    || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                s1 += s.charAt(i);
            }
        }

        // convert to lowercase
        s1 = s1.toLowerCase();

        int i = 0;
        int j = s1.length() - 1;

        // two pointer check
        while (i < j) {
            if (s1.charAt(i) == s1.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }

        return true;
    }

    // main method added
    public static void main(String[] args) {

        ValidPalindrome obj = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";

        boolean result = obj.isPalindrome(s);

        System.out.println(result);
    }
}
