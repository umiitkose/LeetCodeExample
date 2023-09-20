package com.umiitkose.top150.arrayandstring;


//https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=top-interview-150
public class ReverseWordsinString {
    public static void main(String[] args) {
        ReverseWordsinString reverseWordsinString = new ReverseWordsinString();
        String s = reverseWordsinString.reverseWords("a good   example");
        System.out.println(s);
    }

    public String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strings.length - 1; i > -1; i--) {
            if (!strings[i].isEmpty()) {
                stringBuilder.append(strings[i]).append(" ");
            }
        }

        return stringBuilder.toString().trim();
    }
}
