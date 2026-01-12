// 136. Single Number

class SingleNumber {

    // method to find the element that appears only once
    public int singleNumber(int[] nums) {

        int ans = 0;

        // XOR all elements
        for (int i : nums) {
            ans ^= i;
        }

        return ans;
    }

    // main method added for execution
    public static void main(String[] args) {

        SingleNumber obj = new SingleNumber();

        int[] nums = {4, 1, 2, 1, 2};  // sample input

        int result = obj.singleNumber(nums);

        System.out.println(result);
    }
}
