package com.umiitkose.strings.medium.quiz17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhone {
    private static String getLetterForDigit(int digit) {
        Map<Integer, String> letterMap = new HashMap<>();
        letterMap.put(2, "abc");
        letterMap.put(3, "def");
        letterMap.put(4, "ghi");
        letterMap.put(5, "jkl");
        letterMap.put(6, "mno");
        letterMap.put(7, "pqrs");
        letterMap.put(8, "tuv");
        letterMap.put(9, "wxyz");
        letterMap.put(0, " ");

        return letterMap.get(digit);
    }

    public static void main(String[] args) {

        String[] strings = new String[]{"123", "456", "412"};


        String a = "123";
        String b = "456";
        String c = "456";
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < b.length(); j++) {
                System.out.println(a.charAt(i) + String.valueOf(b.charAt(j)));
            }
        }

    }

    public List<String> letterCombinations(String digits) {
        if ("".equals(digits))
            return new ArrayList<>();


        return new ArrayList<>();
    }
}



