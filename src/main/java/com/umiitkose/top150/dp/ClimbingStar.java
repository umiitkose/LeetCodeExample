package com.umiitkose.top150.dp;

public class ClimbingStar {
    //Fibonacci mantığında düşün..

    public int climbStairs(int n) {
        int toplam1 = 1;
        int toplam = 1;
        int toplam2 = 1;

        for (int i = 2; i <= n; i++) {
            toplam2 = toplam1 + toplam;
            toplam = toplam1;
            toplam1 = toplam2;
        }

        return toplam2;

    }


}

/**
 * Question:
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 */
