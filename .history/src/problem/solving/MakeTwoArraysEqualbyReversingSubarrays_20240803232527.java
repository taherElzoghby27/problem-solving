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
        System.out.println(arr.equals(target));
    }
}