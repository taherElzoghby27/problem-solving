package problem.solving.min_stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

    public static void main(String[] args) {
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        carFleet(target, position, speed);
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            double time = (target - cars[i][0]) / cars[i][1];
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
        }

        return stack.size();
    }

}
