package problem.solving.random;

import java.util.Stack;

public class LargestRectangleinHistogram {

    public static void main(String[] args) {
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea1(heights));
    }

    public static int largestRectangleArea1(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static int largestRectangleArea(int[] heights) {
        //2,1,5,6,2,3
        int size = heights.length;
        int[] result = new int[size];
        //
        for (int i = 0; i < size; i++) {
            result[i] = (countMaxWidth(heights, 0, i - 1, i) + countMaxWidth(heights, i + 1, size - 1, i) + 1) * heights[i];
        }
        int max = result[0];
        for (int i = 0; i < size; i++) {
            if (result[i] > max) {
                max = result[i];
            }
        }
        return max;
    }

    public static int countMaxWidth(int[] arr, int leftIndex, int rightIndex, int currentIndex) {
        int count = 0;
        if (leftIndex == currentIndex || currentIndex == rightIndex) {
            return count;
        }
        if (leftIndex < currentIndex) {
            for (int i = rightIndex; i >= leftIndex; --i) {
                if (arr[i] < arr[currentIndex]) {
                    return count;
                }
                ++count;
            }
        } else {
            for (int i = leftIndex; i <= rightIndex; i++) {
                if (arr[i] < arr[currentIndex]) {
                    return count;
                }
                ++count;
            }
        }
        return count;
    }
}
