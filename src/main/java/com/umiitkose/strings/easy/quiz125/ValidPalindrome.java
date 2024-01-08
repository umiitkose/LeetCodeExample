package com.umiitkose.strings.easy.quiz125;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean raceACar = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(raceACar);
    }

    public boolean isPalindrome(String s) {
        if (s.length() < 2)
            return true;

        String newStr = s.replace(" ", "").replace(",", "").replace(":", "").toLowerCase();
        int length = newStr.length() - 1;
        for (int i = 0; i < length / 2 + 1; i++) {
            if (newStr.charAt(length - i) != newStr.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
