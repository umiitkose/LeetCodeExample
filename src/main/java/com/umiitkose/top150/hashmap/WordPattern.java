package com.umiitkose.top150.hashmap;

import java.util.HashMap;

/**
 * Here follow means a full match, such that there is a bijection between a letter in pattern
 * and a non-empty word in s.
 * Example 1:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat dog"
 * Output: true
 * Example 2:
 * <p>
 * Input: pattern = "abba", s = "dog cat cat fish"
 * Output: false
 * Example 3:
 * <p>
 * Input: pattern = "aaaa", s = "dog cat cat dog"
 * Output: false
 * https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
 * <p>
 * <p>
 * ------
 * <p>
 * a
 * b
 */
public class WordPattern {
    public static void main(String[] args) {
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] word = s.split(" ");
        HashMap<Character, String> wordControlMap = new HashMap<>();

        if (word.length != pattern.length())
            return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (wordControlMap.containsKey(pattern.charAt(i))) {
                if (!wordControlMap.get(pattern.charAt(i)).equals(word[i]))
                    return false;
            } else {
                if (wordControlMap.containsValue(word[i]))
                    return false;
                wordControlMap.put(pattern.charAt(i), word[i]);
            }

        }

        return true;
    }

}
