package com.umiitkose.strings.easy.exam2299;

import java.util.HashMap;
import java.util.Map;

public class StrongPasswordChecker {
    public static void main(String[] args) {
        StrongPasswordChecker strongPasswordChecker = new StrongPasswordChecker();
        boolean b = strongPasswordChecker.strongPasswordCheckerII("-Aa1a1a1");
        System.out.println(b);
    }

    public boolean strongPasswordCheckerII(String password) {

        return checkLengthControl(password) && checkLowerCaseLetter(password) && checkUpperCaseLetter(password)
                && checkDigitLetter(password) && checkSpecialCharacter(password) && isThereSomeCharacter(password);
    }

    private boolean isThereSomeCharacter(String password) {
        Map<Character, Integer> characterControlMap = new HashMap<>();
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != chars.length - 1)
                if (chars[i] == chars[i + 1]) {
                    return false;
                }
        }

        return true;
    }

    private boolean checkSpecialCharacter(String password) {
        return password.matches(".*[!@#\\$%\\^&*\\(\\)\\-+].*");
    }

    private boolean checkDigitLetter(String password) {
        return password.matches(".*[0-9].*");
    }

    private boolean checkUpperCaseLetter(String password) {
        return password.matches(".*[a-z].*");
    }

    private boolean checkLowerCaseLetter(String password) {
        return password.matches(".*[A-Z].*");
    }

    private boolean checkLengthControl(String password) {
        return password.length() > 7;
    }
}

/**
 * A password is said to be strong if it satisfies all the following criteria:
 * <p>
 * It has at least 8 characters.
 * It contains at least one lowercase letter.
 * It contains at least one uppercase letter.
 * It contains at least one digit.
 * It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
 * It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
 * Given a string password, return true if it is a strong password. Otherwise, return false.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: password = "IloveLe3tcode!"
 * Output: true
 * Explanation: The password meets all the requirements. Therefore, we return true.
 * Example 2:
 * <p>
 * Input: password = "Me+You--IsMyDream"
 * Output: false
 * Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.
 * Example 3:
 * <p>
 * Input: password = "1aB!"
 * Output: false
 * Explanation: The password does not meet the length requirement. Therefore, we return false.
 */
