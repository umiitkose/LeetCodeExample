package com.umiitkose.algorithms.twopointer.medium;

//https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println(containerWithMostWater.maxArea(new int[]{1, 1}));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int waterSize = 0;

        while (left < right) {
            int min = Math.min(height[left], height[right]);
            int newWaterSize = min * (right - left);
            if (waterSize < newWaterSize)
                waterSize = newWaterSize;

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return waterSize;

    }
}
