package com.umiitkose.strings.easy.exam2828;

import java.util.List;

public class CheckIfStringIsAnAcronymOfWords {
    public boolean isAcronym(List<String> words, String s) {
        char[] chars = s.toCharArray();
        if (words.size() != chars.length)
            return false;

        for (int i = 0; i < words.size(); i++) {
            if (chars[i] != words.get(i).charAt(0))
                return false;
        }
        return true;
    }
}
