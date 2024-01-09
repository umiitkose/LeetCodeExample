package com.umiitkose.strings.easy.quiz2942;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWordsContainingCharacter {

    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        FindWordsContainingCharacter findWordsContainingCharacter = new FindWordsContainingCharacter();
        List<Integer> e = findWordsContainingCharacter.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a');
        System.out.println(Arrays.toString(e.toArray()));
    }

    public List<Integer> findWordsContaining(String[] words, char x) {
        for (int i = 0; i < words.length; i++)
            if (words[i].indexOf(x) != -1)
                list.add(i);

        return list;
    }
}
