package problem.solving;

import java.util.Scanner;

public class CountSubarrays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while ((t--) != 0) {
            int number = input.nextInt();
            int[] array = new int[number];
            for (int i = 0; i < number; i++) {
                array[i] = input.nextInt();
            }
            int result = number;
            int i = 0;
            int z = 0;
            while (true) {
                if (z == number - 1) {
                    break;
                }
                if (array[i] > array[i + 1]) {
                    ++z;
                    i = z;
                    continue;
                }
                result++;
                if (i == number - 1) {
                    z++;
                    i = z;
                }
            }
            System.out.println(result);
        }
    }
}
