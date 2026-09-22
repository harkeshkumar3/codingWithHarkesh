package org.example.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses2 {
    public static void main(String[] args) {
        String exp = "[](()){}";
        System.out.println(isValid(exp));

    }

    private static boolean isValid(String exp) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty())
                return false;

            char check;
            switch (ch) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }


}
