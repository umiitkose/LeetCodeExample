package com.umiitkose.strings.easy.exam2114;

public class MaximumNumberOfStringSentence {

    public static void main(String[] args) {
        MaximumNumberOfStringSentence maximumNumberOfStringSentence = new MaximumNumberOfStringSentence();
        long startTime = System.currentTimeMillis();

        int i = maximumNumberOfStringSentence.mostWordsFound(
                new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}
        );
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
        System.out.println(i);

    }

    public int mostWordsFound(String[] sentences) {


        int output;
        int biggestNumber = 0;
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String[] split = sentence.split(" ");
            output = split.length;
            if (output > biggestNumber) {
                biggestNumber = output;
            }
        }
        return biggestNumber;


    }

    /*
    public int mostWordsFound(String[] sentences) {
      return Arrays.stream(sentences)
            .map(sentence -> sentence.split(" "))
            .mapToInt(split -> split.length)
            .max()
            .orElse(0);
    }
    */


}

/**
 * ,A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * <p>
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 * <p>
 * Return the maximum number of words that appear in a single sentence.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * Output: 6
 * Explanation:
 * - The first sentence, "alice and bob love leetcode", has 5 words in total.
 * - The second sentence, "i think so too", has 4 words in total.
 * - The third sentence, "this is great thanks very much", has 6 words in total.
 * Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 * Example 2:
 * <p>
 * Input: sentences = ["please wait", "continue to fight", "continue to win"]
 * Output: 3
 * Explanation: It is possible that multiple sentences contain the same number of words.
 * In this example, the second and third sentences (underlined) have the same number of words.
 */
