package problem.solving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * RangeSumofSortedSubarraySums
 */
public class RangeSumofSortedSubarraySums {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> subarraySums = new ArrayList<>();

        // Generate all subarrays and their sums
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                subarraySums.add(currentSum);
            }
        }

        // Sort the subarray sums
        Collections.sort(subarraySums);

        // Compute the range sum
        int rangeSum = 0;
        for (int i = left - 1; i < right; i++) {
            rangeSum += subarraySums.get(i);
        }

        return rangeSum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int left = 3;
        int right = 4;
        System.out.println(rangeSum(nums, nums.length, left, right)); // Output: 17
    }
}