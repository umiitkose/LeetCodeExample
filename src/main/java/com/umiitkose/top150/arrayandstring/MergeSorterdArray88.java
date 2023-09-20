package com.umiitkose.top150.arrayandstring;


//https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
public class MergeSorterdArray88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Length = m - 1, nums2Length = n - 1, sizeTotal = n + m - 1;
        while (nums2Length >= 0) {
            if (nums1Length >= 0 && nums1[nums1Length] > nums2[nums2Length]) {
                nums1[sizeTotal--] = nums1[nums1Length--];
            } else {
                nums1[sizeTotal--] = nums2[nums2Length--];
            }

        }

    }

}
