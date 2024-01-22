package com.umiitkose.top150.hashmap;

/**
 * https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
 */
public class RansomNote {
    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        ransomNote.canConstruct("aab", "aba");
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (alphabets_counter[c - 'a'] == 0) return false;
            alphabets_counter[c - 'a']--;
        }
        return true;
    }
}
