package com.umiitkose.array.medium.quiz380;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/insert-delete-getrandom-o1
 */
public class RandomizedSet {

    List<Integer> data;

    public RandomizedSet() {
        data = new ArrayList<>();
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.remove(1);
        randomizedSet.insert(2);
        randomizedSet.getRandom();

    }

    public boolean insert(int val) {
        return data.add(val);
    }

    public boolean remove(int val) {
        if (data.contains(val)) {
            data.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        return data.get(data.size() - 1);
    }


}
