package com.umiitkose.top150.arrayandstring;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("hello world"));
    }

    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}
