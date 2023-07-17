package com.umiitkose.strings.medium.quiz2390;

public class RemovinStarFromAStringWithStringBuilder {

    public static void main(String[] args) {
        RemovinStarFromAStringWithStringBuilder removinStarFromAString = new RemovinStarFromAStringWithStringBuilder();
        String s = removinStarFromAString.removeStars("leet**cod*e");
        System.out.println(s);
    }

    public String removeStars(String s) {
        StringBuilder stringStack = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '*' && stringStack.length() > 0) {
                stringStack.deleteCharAt(stringStack.length() - 1);
            } else {
                stringStack.append(aChar);
            }
        }


        return stringStack.toString();

    }
}
