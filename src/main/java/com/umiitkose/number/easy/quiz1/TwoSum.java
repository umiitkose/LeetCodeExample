package com.umiitkose.number.easy.quiz1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{2, 7, 11, 15}, 13)));
    }

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> twoSumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (twoSumMap.containsKey(target - nums[i])) {
                return new int[]{twoSumMap.get(target - nums[i]), i};
            }
            twoSumMap.put(nums[i], i); // 2, 0
        }

        return new int[]{};
    }
}

