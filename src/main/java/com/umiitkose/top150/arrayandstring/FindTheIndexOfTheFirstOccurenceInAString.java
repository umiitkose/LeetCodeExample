package com.umiitkose.top150.arrayandstring;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 */
public class FindTheIndexOfTheFirstOccurenceInAString {
    public int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
