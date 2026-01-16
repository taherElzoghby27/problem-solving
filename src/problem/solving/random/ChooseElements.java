package problem.solving.random;

import java.util.Arrays;
import java.util.Scanner;

public class ChooseElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int maxNum = input.nextInt();
        long sum = 0;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextLong();
        }
        //sort
        Arrays.sort(arr);
        if (arr[n - 1] < 0) {
            System.out.println(0);
            return; // Exit early
        }
        for (int i = n - 1; i >= n - maxNum; i--) {
            sum += arr[i];
        }
        System.out.println(sum);
        input.close();// Close scanner to prevent resource leak
    }

//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
