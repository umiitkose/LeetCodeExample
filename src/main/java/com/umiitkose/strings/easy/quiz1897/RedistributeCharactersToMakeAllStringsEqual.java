package com.umiitkose.strings.easy.quiz1897;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersToMakeAllStringsEqual {
    public static void main(String[] args) {
        RedistributeCharactersToMakeAllStringsEqual redistributeCharactersToMakeAllStringsEqual = new RedistributeCharactersToMakeAllStringsEqual();
        System.out.println(redistributeCharactersToMakeAllStringsEqual.makeEqual(new String[]{"abc", "aabc", "bc"}));
    }

    public boolean makeEqual(String[] words) {
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int length = words.length;
        for (int i = 0; i < length; i++) {

            for (char c : words[i].toCharArray()) {
                characterIntegerMap.put(c, characterIntegerMap.getOrDefault(c, 0) + 1);
            }
        }
        for (Integer key : characterIntegerMap.values()) {
            if (key % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}

/**
 * Best solution
 * int[] alph = new int[26];
 * for (String word : words) for (char c : word.toCharArray()) alph[c - 'a']++;
 * for (int n : alph) if (n % words.length != 0) return false;
 * return true;
 * <p>
 * <p>
 * You are given an array of strings words (0-indexed).
 * <p>
 * In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].
 * <p>
 * Return true if you can make every string in words equal using any number of operations, and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["abc","aabc","bc"]
 * Output: true
 * Explanation: Move the first 'a' in words[1] to the front of words[2],
 * to make words[1] = "abc" and words[2] = "abc".
 * All the strings are now equal to "abc", so return true.
 * Example 2:
 * <p>
 * Input: words = ["ab","a"]
 * Output: false
 * Explanation: It is impossible to make all the strings equal using the operation.
 */


/**
 *
 * You are given an array of strings words (0-indexed).
 *
 * In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].
 *
 * Return true if you can make every string in words equal using any number of operations, and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["abc","aabc","bc"]
 * Output: true
 * Explanation: Move the first 'a' in words[1] to the front of words[2],
 * to make words[1] = "abc" and words[2] = "abc".
 * All the strings are now equal to "abc", so return true.
 * Example 2:
 *
 * Input: words = ["ab","a"]
 * Output: false
 * Explanation: It is impossible to make all the strings equal using the operation.
 * */