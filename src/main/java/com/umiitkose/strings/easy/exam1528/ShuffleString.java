package com.umiitkose.strings.easy.exam1528;

/**
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 * Example 2:
 * <p>
 * Input: s = "abc", indices = [0,1,2]
 * Output: "abc"
 * Explanation: After shuffling, each character remains in its position.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * s.length == indices.length == n
 * 1 <= n <= 100
 * s consists of only lowercase English letters.
 * 0 <= indices[i] < n
 * All values of indices are unique.
 */
public class ShuffleString {

    public static void main(String[] args) {
        ShuffleString shuffleString = new ShuffleString();
        String testali = shuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println(testali);
    }

    public String restoreString(String s, int[] indices) {
        String[] newText = new String[indices.length];
        int i = 0;
        if (s.length() >= indices.length) {
            for (int index : indices) {
                newText[index] = Character.toString(s.charAt(i));
                i++;
            }
        }

        return String.join("", newText);
    }
}

/*
 Openai çözümü
 char[] result = new char[s.length()];
    for (int i = 0; i < indices.length; i++) {
        result[indices[i]] = s.charAt(i);
    }
    return new String(result);
    }*/
