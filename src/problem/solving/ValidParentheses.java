package problem.solving;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return false;
        }
        char first = s.charAt(0);
        if (first == '}' || first == ')' || first == ']') {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if ((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[')
                        || (ch == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid2("]"));
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty()
                    && 
                    (ch == ')' && stack.peek() == '(' || ch == '}' && stack.peek() == '{' || ch == ']' && stack.peek() == '[')) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }
}
