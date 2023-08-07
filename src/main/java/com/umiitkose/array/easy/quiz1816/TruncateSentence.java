package com.umiitkose.array.easy.quiz1816;

public class TruncateSentence {
    public static void main(String[] args) {
        TruncateSentence truncateSentence = new TruncateSentence();
        System.out.println(truncateSentence.truncateSentence("Hello how are you Contestant", 4));
    }

    public String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        StringBuilder truncateSentence = new StringBuilder();


        for (int i = 0; i < k; i++
        ) {
            truncateSentence.append(s1[i] + " ");
        }
        return truncateSentence.toString().trim();
    }
}
