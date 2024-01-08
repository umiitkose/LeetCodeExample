package com.umiitkose.strings.easy.exam1684;

import java.util.HashSet;

public class UsingHashSet {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        int total = words.length;

        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        for (String str : words) {
            for (char c : str.toCharArray()) {
                if (!set.contains(c)) {
                    total--;
                    break;
                }
            }
        }

        return total;
    }
}
