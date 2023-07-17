package com.umiitkose.strings.medium.quiz5;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abbbabasad";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String strPalindrome = longestPalindrome.longestPalindrome(s);
        System.out.println(strPalindrome + " lentght -> " + strPalindrome.length());
    }

    public String longestPalindrome(String s) {
        return "";
    }

    private String isPalindrome(String s) {


        return "";
    }

    /**
     Given a string s, return the longest
     palindromic

     substring
     in s.



     Example 1:

     Input: s = "babad"
     Output: "bab"
     Explanation: "aba" is also a valid answer.
     Example 2:

     Input: s = "cbbd"
     Output: "bb"


     Constraints:

     1 <= s.length <= 1000
     */
}


/*         int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i + 1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
        * */

