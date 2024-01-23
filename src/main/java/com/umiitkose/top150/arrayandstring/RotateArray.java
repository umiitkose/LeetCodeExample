package com.umiitkose.top150.arrayandstring;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {


    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    //Süreye takılan Kodum:
    public void rotate(int[] nums, int k) {

        int loop = 0;
        if (k > nums.length) {
            loop = Math.abs(nums.length - k);
        } else {
            loop = k;
        }

        for (int j = 0; j < loop; j++)
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i - 1 != -1) {
                    int temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                }
            }

        System.out.println(Arrays.toString(nums));

    }


    /** Çalışna KOD :
     *
     *
     *  public void rotate(int[] nums, int k) {
     *         k%=nums.length;
     *         reverse(0,nums.length-1,nums);
     *         reverse(0,k-1,nums);
     *         reverse(k,nums.length-1,nums);
     *
     *     }
     *     public void reverse(int start,int end,int[]nums){
     *         while(start<=end){
     *             int temp=nums[start];
     *             nums[start]=nums[end];
     *             nums[end]=temp;
     *             start++;
     *             end--;
     *         }
     *     }
     * */
}
