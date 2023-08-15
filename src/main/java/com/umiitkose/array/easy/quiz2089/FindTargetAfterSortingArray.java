package com.umiitkose.array.easy.quiz2089;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindTargetAfterSortingArray {

    public static void main(String[] args) {
        FindTargetAfterSortingArray findTargetAfterSortingArray = new FindTargetAfterSortingArray();
        List<Integer> integerList = findTargetAfterSortingArray.targetIndices(new int[]{1, 2, 4, 2, 3}, 2);
        System.out.println(integerList);
    }

    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = search(nums, target);
        list.sort(Comparator.naturalOrder());
        return list;

    }

    private List<Integer> search(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        if (nums[nums.length - 1] < target || nums[0] > target) {
            return list;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}

