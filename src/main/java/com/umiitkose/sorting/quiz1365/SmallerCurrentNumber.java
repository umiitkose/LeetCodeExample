package com.umiitkose.sorting.quiz1365;

import java.util.Arrays;

public class SmallerCurrentNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 5, 4, 8};
        SmallerCurrentNumber smallerCurrentNumber = new SmallerCurrentNumber();
        System.out.println(Arrays.toString(smallerCurrentNumber.smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] counter = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
            int yedek = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    yedek++;
                }
            }
            counter[i] = yedek;
            yedek = 0;
        }
        return counter;
    }

}
