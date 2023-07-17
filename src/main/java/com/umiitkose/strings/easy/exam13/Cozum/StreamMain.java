package com.umiitkose.strings.easy.exam13.Cozum;

import java.util.HashMap;
import java.util.Map;

public class StreamMain {

    public static int romanToInteger(String s) {

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        return s.chars()
                .map(i -> romanValues.get((char) i))
                .reduce((a, b) -> a < b ? b - a : a + b)
                .orElse(0);
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        int result = romanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equal to " + result);
    }
}
