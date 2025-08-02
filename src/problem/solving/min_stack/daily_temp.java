package problem.solving.min_stack;

import java.util.Stack;

public class daily_temp {

    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("");
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n]; // Array to store the result, initialized to 0
        Stack<Integer> stack = new Stack<>(); // Stack to keep track of indices

        //Iterate through each day
        for (int i = 0; i < n; i++) {
            //Check if we have found a warmer temperature for any previous days
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int index = stack.pop(); // Get the index of the previous day
                answer[index] = i - index; // Calculate the number of days to wait and update the answer array
            }
            //Push the current day index onto the stack
            stack.push(i);
        }

        //Return the final answer array
        return answer;
    }
}
