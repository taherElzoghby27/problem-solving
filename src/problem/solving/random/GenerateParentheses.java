package problem.solving.random;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTracking(result, "", 0, 0, n);
        return result;
    }

    public static void backTracking(List<String> result, String current, int open, int close, int max) {//()(())
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }
        if (close < open) {
            backTracking(result, current + ")", open, close + 1, max);
        }
        if (open < max) {
            backTracking(result, current + "(", open + 1, close, max);
        }
    }
}
