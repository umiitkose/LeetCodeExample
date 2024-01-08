package com.umiitkose.strings.easy.exam917;

public class ReverseOnlyLetters {

    public static void main(String[] args) {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        System.out.println(reverseOnlyLetters.reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

    public String reverseOnlyLetters(String s) {
        int i = 0, j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i <= j) {
            if (!Character.isLetter(s.charAt(i))) {
                i++;
                continue;
            } else if (!Character.isLetter(s.charAt(j))) {
                j--;
                continue;
            } else {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, s.charAt(i));
            }
            i++;
            j--;
        }
        return sb.toString();

    }

}
