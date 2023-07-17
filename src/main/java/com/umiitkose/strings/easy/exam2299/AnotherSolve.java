package com.umiitkose.strings.easy.exam2299;

public class AnotherSolve {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) return false;

        char[] charList = password.toCharArray();

        boolean lowl = false;
        boolean upperl = false;
        boolean digit = false;
        boolean spChar = false;
        String special = "!@#$%^&*()-+";
        char previous = '.';
        for (int i = 0; i < charList.length; i++) {
            if (charList[i] == previous) {
                return false;
            }
            previous = charList[i];
            if (charList[i] >= 'a' && charList[i] <= 'z') {
                lowl = true;
            } else if (charList[i] >= 'A' && charList[i] <= 'Z') {
                upperl = true;
            } else if (charList[i] >= '0' && charList[i] <= '9') {
                digit = true;
            } else if (special.indexOf(charList[i]) != -1) {
                spChar = true;
            }
        }
        return lowl && upperl && digit && spChar;
    }
}
