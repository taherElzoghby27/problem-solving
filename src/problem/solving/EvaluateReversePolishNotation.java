package problem.solving;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String[] str = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        System.out.println(evalRPN(str));
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("/") || token.equals("*")) {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int result = calculate(token, num1, num2);
                stack.push(String.valueOf(result));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private static int calculate(String operator, int num1, int num2) {
        switch (operator) {
            case "+" -> {
                return num2 + num1;
            }
            case "-" -> {
                return num2 - num1;
            }
            case "*" -> {
                return num2 * num1;
            }
            case "/" -> {
                return num2 / num1;
            }
        }
        return 0;
    }
}
