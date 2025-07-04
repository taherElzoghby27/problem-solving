package problem.solving;

import java.util.Scanner;

public class AlternatingArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        int mismatchCount = countAlternatingMismatches(nums, n);
        System.out.println(mismatchCount);
        input.close();
    }

    private static int countAlternatingMismatches(int[] nums, int n) {
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            if (!hasOppositeSigns(nums[i], nums[i + 1])) {
                sum++;
            }
        }
        if (n % 2 != 0 && n > 2) {
            if (!hasOppositeSigns(nums[n - 3], nums[n - 1])) {
                sum++;
            }
        }
        return sum;
    }

    private static boolean hasOppositeSigns(int a, int b) {
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }
}
