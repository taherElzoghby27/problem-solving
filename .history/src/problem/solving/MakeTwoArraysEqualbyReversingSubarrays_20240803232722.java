package problem.solving;

import java.util.Arrays;

/**
 * MakeTwoArraysEqualbyReversingSubarrays
 */
public class MakeTwoArraysEqualbyReversingSubarrays {
    public static boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] target = { 1, 0, 3, 4 };
        int[] arr = { 0, 4, 1, 3 };
        System.out.println(canBeEqual(target, arr));
    }
}