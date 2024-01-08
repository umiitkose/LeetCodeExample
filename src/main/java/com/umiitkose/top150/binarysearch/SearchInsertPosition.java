package com.umiitkose.top150.binarysearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 4, 5}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1])
            return nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i])
                return i;
            if (target < nums[i])
                return i;

        }
        return -1;
    }
}
