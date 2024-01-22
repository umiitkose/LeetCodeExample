package com.umiitkose.top150.math;

/**
 * https://leetcode.com/problems/factorial-trailing-zeroes/description/?envType=study-plan-v2&envId=top-longerview-150
 */
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        System.out.println(factorialTrailingZeroes.trailingZeroes(1003));
    }

    public int trailingZeroes(int n) {
        int result = 0;
        if (n >= 5) result += n / 5;
        if (n >= 25) result += n / 25;
        if (n >= 125) result += n / 125;
        if (n >= 625) result += n / 625;
        if (n >= 3125) result += n / 3125;
        return result;
    }
}
