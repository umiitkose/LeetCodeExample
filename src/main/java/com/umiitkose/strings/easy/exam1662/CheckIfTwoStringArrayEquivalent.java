package com.umiitkose.strings.easy.exam1662;

import java.util.Arrays;

public class CheckIfTwoStringArrayEquivalent {
    public static void main(String[] args) {
        CheckIfTwoStringArrayEquivalent checkIfTwoStringArrayEquivalent = new CheckIfTwoStringArrayEquivalent();
        boolean b = checkIfTwoStringArrayEquivalent.arrayStringsAreEqual(new String[]{"a", "bc"}, new String[]{"ab", "c"});
        System.out.println(b);
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordOne = new StringBuilder();
        Arrays.stream(word1).forEach(wordOne::append);
        System.out.println(wordOne);
        StringBuilder wordTwo = new StringBuilder();
        Arrays.stream(word2).forEach(wordTwo::append);
        System.out.println(wordTwo);

        return wordOne.toString().contentEquals(wordTwo);
    }
}
