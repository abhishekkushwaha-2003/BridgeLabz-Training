package com.hashmapandhashfunction.twosumproblem;

public class TwoSumMain {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        TwoSum obj = new TwoSum();

        int[] result = obj.findTwoSum(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found");
        }
    }
}
