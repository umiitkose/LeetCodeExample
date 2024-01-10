package com.umiitkose.strings.easy.quiz1221;

public class SplitStringInBalancedString {

    /**
     * Çözüm Hazır olarak alındı..
     * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
     * <p>
     * Given a balanced string s, split it into some number of substrings such that:
     * <p>
     * Each substring is balanced.
     * Return the maximum number of balanced strings you can obtain.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: s = "RLRRLLRLRL"
     * Output: 4
     * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
     * Example 2:
     * <p>
     * Input: s = "RLRRRLLRLL"
     * Output: 2
     * Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
     * Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
     * Example 3:
     * <p>
     * Input: s = "LLLLRRRR"
     * Output: 1
     * Explanation: s can be split into "LLLLRRRR".
     */
    public int balancedStringSplit(String s) {
        int count = 0;
        int cha = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                cha++;
            } else {
                cha--;
            }
            if (cha == 0) {
                count++;
            }

        }
        return count;
    }
}
