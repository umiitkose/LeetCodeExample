package com.umiitkose.top150.arrayandstring;

public class RomanToInteger {

    public static void main(String[] args) {
    }

    public int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        int currValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);

            switch (currChar) {
                case 'I':
                    currValue = 1;
                    break;
                case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
                case 'L':
                    currValue = 50;
                    break;
                case 'C':
                    currValue = 100;
                    break;
                case 'D':
                    currValue = 500;
                    break;
                case 'M':
                    currValue = 1000;
                    break;
                default:
                    currValue = 0;
                    break;
            }

            if (currValue > prevValue) {
                result += currValue - 2 * prevValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}
