/*  Leetcode 1 Two Sum 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

public class TwoSum {
	// method to find two numbers whose sum is equal to target number
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
	// main method
    public static void main(String[] args) {

        TwoSum obj = new TwoSum();
		// input data
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);
		// displaying result
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
