package com.umiitkose.strings.easy.exam13;

public class Main {

    private static int getOneCharacterData(char firstCharacter) {
        int data;
        switch (firstCharacter) {
            case 'M':
                data = 1000;
                break;
            case 'D':
                data = 500;
                break;
            case 'C':
                data = 100;
                break;
            case 'L':
                data = 50;
                break;
            case 'X':
                data = 10;
                break;
            case 'V':
                data = 5;
                break;
            case 'I':
                data = 1;
                break;
            default:
                data = 0;

        }
        return data;
    }

    private static int getTwoCharacterData(String twoCharacter) {
        int data;

        switch (twoCharacter) {
            case "CM":
                data = 900;
                break;
            case "CD":
                data = 400;
                break;
            case "XC":
                data = 90;
                break;
            case "XL":
                data = 40;
                break;
            case "IX":
                data = 9;
                break;
            case "IV":
                data = 4;
                break;

            default:
                data = 0;

        }
        return data;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.readRomanNumber("MCMXCIV"); //1994
    }

    private int readRomanNumber(String s) {

        int data = 0;
        String substring;
        if (s.length() == 1) {
            data = getOneCharacterData(s.charAt(0));
            System.out.println(s + " Roma Rakamının değeri : " + data);
        } else if (s.length() == 2 && getTwoCharacterData(s) != 0) {
            data = getTwoCharacterData(s);
            System.out.println(s + " Roma Rakamının değeri : " + data);
        } else if (s.length() >= 2) {
            for (int i = 0; i < s.length() + 1; i++) {
                if (s.length() <= 1) {
                    data += getOneCharacterData(s.charAt(0));
                    s = s.substring(1);
                } else {
                    substring = s.substring(0, 2);
                    if (getTwoCharacterData(s.substring(0, 2)) > 0) {
                        data += getTwoCharacterData(substring);
                        s = s.substring(2);
                    } else {
                        data += getOneCharacterData(s.charAt(0));
                        s = s.substring(1);
                    }

                }
                i = 0;
            }
            System.out.println(s + " Roma Rakamının değeri : " + data);
        } else {
            System.out.println("s roma rakamı değildir.");
        }


        return data;
    }

}

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 * <p>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 * <p>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */