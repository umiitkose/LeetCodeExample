package com.umiitkose.top150.bitmanipulation;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {

    public static void main(String[] args) {
        SingleNumberII singleNumberII = new SingleNumberII();
        int[] nums = new int[]{2, 2, 3, 2};

        System.out.println(singleNumberII.singleNumber(nums));

    }

    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
/*
        for (int n : nums) {
            if (numMap.containsKey(n)) {
                numMap.put(n, numMap.get(n) + 1);
            } else {
                numMap.put(n, 1);
            }
        }
*/

        for (int n : nums) {
            numMap.put(n, numMap.getOrDefault(n, 0) + 1);
        }

        for (int key : numMap.keySet()) {
            if (numMap.get(key) == 1) return key;
        }

        return 0;
    }
}


/*
Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,3,2]
Output: 3
Example 2:

Input: nums = [0,1,0,1,0,1,99]
Output: 99


Hızlı Çözüm : Aklıma gelmezdi :)

    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;

        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }

        return ones;
    }
* */