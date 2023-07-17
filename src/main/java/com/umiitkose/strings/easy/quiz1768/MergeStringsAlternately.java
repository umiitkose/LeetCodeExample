package com.umiitkose.strings.easy.quiz1768;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        System.out.println(mergeStringsAlternately.mergeAlternately("abcd", "pqrs"));
    }

    public String mergeAlternately(String word1, String word2) {
        int word1Length = word1.length();
        int word2Length = word2.length();
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();

        int enKucukDeger = Math.min(word1Length, word2Length);
        int enBuyukDeger = Math.max(word1Length, word2Length);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < enKucukDeger; i++) {
            stringBuilder.append(word1Char[i]).append(word2Char[i]);
        }

        if (enBuyukDeger == word1Char.length) {
            stringBuilder.append(word1, enKucukDeger, enBuyukDeger);
        } else {
            stringBuilder.append(word2, enKucukDeger, enBuyukDeger);
        }

        return stringBuilder.toString();
    }
}
