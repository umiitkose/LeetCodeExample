package com.umiitkose.top150.bactracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    List<List<Integer>> lists = new ArrayList<>();

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        System.out.println(combinations.combine(5, 3));
    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> integers = new ArrayList<>();
        solveProblem(1, n, k, integers);

        return lists;
    }

    void solveProblem(int num, int n, int k, List<Integer> integers) {
        if (integers.size() == k) {
            lists.add(new ArrayList<>(integers));
            return;
        }

        for (int i = num; i <= n; i++) {
            integers.add(i);
            solveProblem(i + 1, n, k, integers);
            integers.remove(integers.size() - 1);
        }
    }
}

/**
 * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
 * <p>
 * You may return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 4, k = 2
 * Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
 * Explanation: There are 4 choose 2 = 6 total combinations.
 * Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
 * Example 2:
 * <p>
 * Input: n = 1, k = 1
 * Output: [[1]]
 * Explanation: There is 1 choose 1 = 1 total combination.
 */