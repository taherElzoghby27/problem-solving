package problem.solving;

public class TwoSums {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] TwoSum(int[] nums, int target) {
        int size = nums.length;
        if (size == 2) {
            return new int[]{0, 1};
        }
        if (nums[size - 1] + nums[size - 2] == target) {
            return new int[]{size - 1, size - 2};
        }
        for (int i = 0; i < size - 2; i++) {//2,7,11,15
            for (int j = size - 1; j > i; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
