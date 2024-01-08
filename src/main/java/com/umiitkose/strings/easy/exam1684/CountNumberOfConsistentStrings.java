package com.umiitkose.strings.easy.exam1684;

public class CountNumberOfConsistentStrings {

    public static void main(String[] args) {
        CountNumberOfConsistentStrings countNumberOfConsistentStrings = new CountNumberOfConsistentStrings();
        int ab = countNumberOfConsistentStrings.countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"});
        System.out.println(ab);
    }

    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            char[] charArray = words[i].toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                if (!allowed.contains(String.valueOf(charArray[j]))) {
                    count++;
                    break;
                }
            }
        }

        return words.length - count;
    }
}
