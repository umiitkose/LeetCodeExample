package com.umiitkose.array.easy.quiz26;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        Set<int[]> mySet = new HashSet<>();
        Collections.addAll(mySet, nums);
        return mySet.size();
    }
}
