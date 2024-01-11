package com.umiitkose.strings.easy.exam1773;

import java.util.List;

public class exam1773 {

    /**
     * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
     * <p>
     * The ith item is said to match the rule if one of the following is true:
     * <p>
     * ruleKey == "type" and ruleValue == typei.
     * ruleKey == "color" and ruleValue == colori.
     * ruleKey == "name" and ruleValue == namei.
     * Return the number of items that match the given rule.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
     * Output: 1
     * Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
     * Example 2:
     * <p>
     * Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
     * Output: 2
     * Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
     * https://leetcode.com/problems/count-items-matching-a-rule/description/
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type")) {
                if (items.get(i).get(0).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("color")) {
                if (items.get(i).get(1).equals(ruleValue)) {
                    count++;
                }
            }
            if (ruleKey.equals("name")) {
                if (items.get(i).get(2).equals(ruleValue)) {
                    count++;
                }
            }

        }
        return count;

    }

}
