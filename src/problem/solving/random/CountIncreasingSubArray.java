/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem.solving.random;

/**
 *
 * @author taherlinux
 */
public class CountIncreasingSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("c: " + countIncreasingSubarrays(arr));
    }

    public static long countIncreasingSubarrays(int[] arr) {
        final long MOD = 1_000_000_007;
        if (arr == null || arr.length == 0) {
            return 0;
        }

        long total = 0;
        int len = 1;

        for (int i = 1; i < arr.length; i++) {//1 2 3 4
            if (arr[i] > arr[i - 1]) {
                len++;// 4
            } else {
                total = (total + (long) len * (len + 1) / 2) % MOD;
                len = 1;
            }
        }

        // last segment
        total = (total + (long) len * (len + 1) / 2) % MOD;

        return total;
    }
}
