package com.umiitkose.strings.easy.quiz1704;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/description/?envType=daily-question&envId=2024-01-12
 */
public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int length = s.length();
        int midPoint = length / 2;

        String firstHalf = s.substring(0, midPoint);
        String secondHalf = s.substring(midPoint);

        return countVowels(firstHalf, vowels) == countVowels(secondHalf, vowels);
    }

    private int countVowels(String str, Set<Character> vowels) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                count++;
            }
        }
        return count;
    }
}
