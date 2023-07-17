package com.umiitkose.strings.easy.exam557;

public class ReverseWordsInStringIII {

    public static void main(String[] args) {
        ReverseWordsInStringIII reverseWordsInStringIII = new ReverseWordsInStringIII();
        System.out.println(reverseWordsInStringIII.reverseWords("Let's take LeetCode contest"));
        //System.out.println(reverseWordsInStringIII.reverseWords("Ali Babanin Bir Çiftliği Var."));
    }

    public String reverseWords(String s) {
        String[] wordArray = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordArray.length; i++) {
            char[] chars = wordArray[i].toCharArray();
            swap(chars);

            StringBuilder append = stringBuilder.append(chars);
            if (i != wordArray.length - 1) {
                append.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private char[] swap(char[] c) {
        int i = 0;
        int j = c.length - 1;
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
        return c;
    }
}


/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 * Example 2:
 * <p>
 * Input: s = "God Ding"
 * Output: "doG gniD"
 */
