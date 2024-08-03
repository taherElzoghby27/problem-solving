package problem.solving;

import java.util.Arrays;

/**
 * MakeTwoArraysEqualbyReversingSubarrays
 */
public class MakeTwoArraysEqualbyReversingSubarrays {
    /* 
    solution 1ms
     public boolean canBeEqual(int[] targetArray, int[] currentArray) {
        if (targetArray.length != currentArray.length) {
            return false;
        }

        int[] elementCounts = new int[1001]; // We use 1001 because numbers range from 1 to 1000

        for (int i = 0; i < targetArray.length; i++) {
            elementCounts[targetArray[i]]++;
            elementCounts[currentArray[i]]--;
        }

        for (int count : elementCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
     */
    public static boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length)
            return false;
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] target = { 0, 1, 3, 4 };
        int[] arr = { 0, 4, 1, 3 };
        System.out.println(canBeEqual(target, arr));
    }
}