package problem.solving;

public class TwoSumInputArrayIsSorted {

    public static void main(String[] args) {
        int[] nums = {5, 25, 75};
        int target = 100;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int sum = nums[low] + nums[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            } else if (sum > target) {
                --high;
            } else {
                ++low;
            }
        }
        return new int[]{low + 1, high + 1};
    }
}
