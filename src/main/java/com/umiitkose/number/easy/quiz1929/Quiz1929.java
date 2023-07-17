package com.umiitkose.number.easy.quiz1929;

public class Quiz1929 {
    public static void main(String[] args) {

    }

    public int[] getConcatenation(int[] nums) {
        int[] concatNums = new int[(nums.length * 2) - 1];
        for (int i = 0; i < nums.length * 2; i++) {
            if (i < nums.length)
                concatNums[i] = nums[i];
            else
                concatNums[i] = nums[i - nums.length];
        }
        return concatNums;
    }

}

/**
 * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, ans is the concatenation of two nums arrays.
 * <p>
 * Return the array ans.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * - ans = [1,2,1,1,2,1]
 * Example 2:
 * <p>
 * Input: nums = [1,3,2,1]
 * Output: [1,3,2,1,1,3,2,1]
 * Explanation: The array ans is formed as follows:
 * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
 * - ans = [1,3,2,1,1,3,2,1]
 */
