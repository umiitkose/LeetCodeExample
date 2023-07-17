package com.umiitkose.strings.medium.quiz17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentSolve {
    Map<Character, Character[]> digitToCharacter = new HashMap<>();

    {
        digitToCharacter.put('2', new Character[]{'a', 'b', 'c'});
        digitToCharacter.put('3', new Character[]{'d', 'e', 'f'});
        digitToCharacter.put('4', new Character[]{'g', 'h', 'i'});
        digitToCharacter.put('5', new Character[]{'j', 'k', 'l'});
        digitToCharacter.put('6', new Character[]{'m', 'n', 'o'});
        digitToCharacter.put('7', new Character[]{'p', 'q', 'r', 's'});
        digitToCharacter.put('8', new Character[]{'t', 'u', 'v'});
        digitToCharacter.put('9', new Character[]{'w', 'x', 'y', 'z'});
    }

    public static void main(String[] args) {
        DifferentSolve differentSolve = new DifferentSolve();
        List<String> strings = differentSolve.letterCombinations("12353");
        System.out.println(strings);
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) {
            return ans;
        }
        int n = digits.length();
        int numberOfCombinations = calculateNumberOfCombinations(digits);
        for (int conbinationIndex = 0; conbinationIndex < numberOfCombinations; conbinationIndex++) {
            String combination = "";
            int temp = conbinationIndex;
            for (int digitIndex = n - 1; digitIndex >= 0; digitIndex--) {
                if (digits.charAt(digitIndex) == '7' || digits.charAt(digitIndex) == '9') {
                    combination = digitToCharacter.get(digits.charAt(digitIndex))[temp % 4] + combination;
                    temp /= 4;
                } else {
                    combination = digitToCharacter.get(digits.charAt(digitIndex))[temp % 3] + combination;
                    temp /= 3;
                }
            }
            ans.add(combination);
        }
        return ans;
    }

    public int calculateNumberOfCombinations(String digits) {
        int ans = 1;
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == '7' || digits.charAt(i) == '9') {
                ans *= 4;
            } else {
                ans *= 3;
            }
        }
        return ans;
    }
}
