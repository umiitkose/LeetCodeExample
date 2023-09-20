package com.umiitkose.top150.math;

public class PalindromeX {

    public static void main(String[] args) {
        PalindromeX palindromeX = new PalindromeX();
        System.out.println(palindromeX.isPalindrome(100));
    }

    public boolean isPalindrome(int x) {

        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return (x == rev || x == rev / 10);

    }
}
