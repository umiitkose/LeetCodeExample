package com.umiitkose.array.medium.quiz916;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/word-subsets/solutions/2353039/java-easy-solution-with-explanation/
public class WordSubsets {
    public static void main(String[] args) {
        WordSubsets wordSubsets = new WordSubsets();
        System.out.println(wordSubsets.wordSubsets(new String[]{"amazon", "apple", "facebook", "google", "leetcode"},
                new String[]{"lo", "eo"}));
    }

    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        int[] words2Freq = getMaxFrequencies(words2);

        //get frequencies for letters in words1 array and compare with
        //getMaxFrequencies of words2, check if it is valid
        //if yes then add it to a result list
        for (int i = 0; i < words1.length; i++) {
            int[] word1Freq = getFrequency(words1[i]);
            boolean flag = true;
            for (int j = 0; j < 26; j++) {
                if (word1Freq[j] < words2Freq[j]) {
                    flag = false;
                    continue;
                }
            }

            if (flag) {
                result.add(words1[i]);
            }
        }

        return result;
    }

    //get maximum of freq of letters for all words in an array
    public int[] getMaxFrequencies(String[] word2) {
        int[] max = new int[26];
        for (int i = 0; i < word2.length; i++) {
            int[] wordFrequencies = getFrequency(word2[i]);

            for (int j = 0; j < 26; j++) {
                max[j] = Math.max(max[j], wordFrequencies[j]);
            }
        }
        return max;
    }

    //get frequency of letters for a word
    public int[] getFrequency(String s) {
        int[] frequencies = new int[26];
        for (char c : s.toCharArray()) {
            frequencies[c - 'a']++;
        }
        return frequencies;
    }
}

/**
 * You are given two string arrays words1 and words2.
 * <p>
 * A string b is a subset of string a if every letter in b occurs in a including multiplicity.
 * <p>
 * For example, "wrr" is a subset of "warrior" but is not a subset of "world".
 * A string a from words1 is universal if for every string b in words2, b is a subset of a.
 * <p>
 * Return an array of all the universal strings in words1. You may return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
 * Output: ["facebook","google","leetcode"]
 * Example 2:
 * <p>
 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
 * Output: ["apple","google","leetcode"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= words1.length, words2.length <= 104
 * 1 <= words1[i].length, words2[i].length <= 10
 * words1[i] and words2[i] consist only of lowercase English letters.
 * All the strings of words1 are unique.
 */
