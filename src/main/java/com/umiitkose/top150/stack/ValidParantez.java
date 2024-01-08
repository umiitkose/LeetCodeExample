package com.umiitkose.top150.stack;

import java.util.Stack;

public class ValidParantez {
    public static void main(String[] args) {
        ValidParantez validParantheses = new ValidParantez();
        boolean valid = validParantheses.isValid("()");
        System.out.println("valid : " + valid);
    }

    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();

        char[] chars = s.toCharArray();

        for (char aChar : chars) {
            if (aChar == '(' || aChar == '{' || aChar == '[') {
                characterStack.push(aChar);
            } else if (!characterStack.isEmpty() && characterStack.peek() == '(' && aChar == ')') {
                characterStack.pop();
            } else if (!characterStack.isEmpty() && characterStack.peek() == '{' && aChar == '}') {
                characterStack.pop();
            } else if (!characterStack.isEmpty() && characterStack.peek() == '[' && aChar == ']') {
                characterStack.pop();
            } else {
                return false;
            }
        }
        return characterStack.isEmpty();

    }
}