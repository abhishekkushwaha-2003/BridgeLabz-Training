// Leetcode 258. Add Digits

class AddDigits {

    // method to add digits until single digit remains
    public int addDigits(int num) {

        if (num == 0) {
            return 0;
        }

        return 1 + (num - 1) % 9;
    }

    // main method 
    public static void main(String[] args) {

        AddDigits obj = new AddDigits();

        int num = 38;   // sample input

        int result = obj.addDigits(num);

        System.out.println(result);
    }
}
