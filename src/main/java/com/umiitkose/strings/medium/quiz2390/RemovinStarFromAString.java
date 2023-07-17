package com.umiitkose.strings.medium.quiz2390;

import java.util.Stack;

public class RemovinStarFromAString {

    public static void main(String[] args) {
        RemovinStarFromAString removinStarFromAString = new RemovinStarFromAString();
        String s = removinStarFromAString.removeStars("leet**cod*e");
        System.out.println(s);
    }

    public String removeStars(String s) {
        Stack<Character> stringStack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '*') {
                stringStack.pop();
            } else {
                stringStack.push(aChar);
            }
        }
        // Create a new StringBuilder to store the characters in the stack
        StringBuilder sb = new StringBuilder();

        // Iterate over each character in the stack and append it to the StringBuilder
        for (char c : stringStack) {
            sb.append(c);
        }


        return sb.toString();

    }
}
