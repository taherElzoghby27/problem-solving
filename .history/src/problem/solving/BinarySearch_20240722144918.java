package problem.solving;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static boolean binarySearch(int number, int[] array) {
        int size = array.length;
        int low = 0;
        int high = size - 1;
        while (low != high) {
            int mid = low + (high - low) / 2;
            if (number > array[mid]) {
                low = mid + 1;
            } else if (number < array[mid]) {
                high = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int q = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        // Sorting the array
        Arrays.sort(array);
        while ((q--) != 0) {
            int number = input.nextInt();
            boolean result = binarySearch(number, array);
            if (result) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
        }
    }
}
