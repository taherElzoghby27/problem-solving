package problem.solving.min_stack;

import java.util.Arrays;

public class CarFleet {

    public static void main(String[] args) {
        int target = 12;
        int[] position = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        carFleet(target, position, speed);
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int size = position.length;
        int[] times = new int[size];
        for (int i = 0; i < size; i++) {
            times[i] = (target - position[i]) / speed[i];
        }
        Arrays.sort(times);
        for (int i = 0; i < size; i++) {
            System.out.print(times[i] + " ");
        }
        return 1;
    }

}
