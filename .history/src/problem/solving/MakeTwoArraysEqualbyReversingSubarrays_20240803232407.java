package problem.solving;

import java.util.Arrays;

/**
 * MakeTwoArraysEqualbyReversingSubarrays
 */
public class MakeTwoArraysEqualbyReversingSubarrays {
    // public boolean canBeEqual(int[] target, int[] arr) {

    // }

    public static void main(String[] args) {
        int[] target = { 1, 2, 3, 4 };
        int[] arr = { 2, 4, 1, 3 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

    }
}