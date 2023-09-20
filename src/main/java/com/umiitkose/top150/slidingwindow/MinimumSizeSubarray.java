package com.umiitkose.top150.slidingwindow;

public class MinimumSizeSubarray {

    public static void main(String[] args) {
        MinimumSizeSubarray sizeSubarray = new MinimumSizeSubarray();
        System.out.println(sizeSubarray.minSubArrayLen(213, new int[]{12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12}));
    }

    public int minSubArrayLen(int target, int[] nums) {

        int l = 0, r = 0, res = Integer.MAX_VALUE, s = 0;
        for (r = 0; r < nums.length; r++) {

            s += nums[r];
            while (s >= target) {
                s -= nums[l];
                res = Math.min(res, r - l + 1);
                l++;
            }
        }
        if (res == Integer.MAX_VALUE)
            return 0;
        return res;
    }


}
