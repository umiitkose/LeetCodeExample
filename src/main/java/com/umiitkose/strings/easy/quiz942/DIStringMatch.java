package com.umiitkose.strings.easy.quiz942;

import java.util.Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        DIStringMatch diStringMatch = new DIStringMatch();
        System.out.println(Arrays.toString(diStringMatch.diStringMatch("IDID")));
    }

    public int[] diStringMatch(String s) {
        char[] charArray = s.toCharArray();
        int[] permArr = new int[charArray.length + 1];
        int left = 0;
        int right = charArray.length;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'D') {
                permArr[i] = right;
                right--;
            } else {
                permArr[i] = left;
                left++;
            }

        }
        permArr[charArray.length] = left;

        return permArr;
    }


}
