package com.umiitkose.top150.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII {
    public static void main(String[] args) {
        TwoSumII twoSum = new TwoSumII();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> twoSumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (twoSumMap.containsKey(target - nums[i])) {
                return new int[]{twoSumMap.get(target - nums[i]), i + 1};
            }
            twoSumMap.put(nums[i], i + 1); // 2, 0
        }

        return new int[]{};
    }
}

