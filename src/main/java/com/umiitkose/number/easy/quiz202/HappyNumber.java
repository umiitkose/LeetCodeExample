package com.umiitkose.number.easy.quiz202;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(100));
    }

    public boolean isHappy(int n) {
        Set<Integer> numberList = new HashSet<>();


        while (n != 1 && !numberList.contains(n)) {
            numberList.add(n);

            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }


            n = sum;
        }

        return n == 1;
    }
}
