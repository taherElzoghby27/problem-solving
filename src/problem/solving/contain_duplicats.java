package problem.solving;

import java.util.HashMap;
import java.util.Map;

public class contain_duplicats {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] arr) {
        Map<Integer, Integer> nums = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (nums.containsKey(arr[i])) {
                return true;
            } else {
                nums.put(arr[i], 1);
            }
        }
        return false;
    }
//    public static boolean containsDuplicate(int[] nums) {
//        int max = Integer.MIN_VALUE;//-
//        int min = Integer.MAX_VALUE;//+ 
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < min || nums[i] > max) {
//                min = Math.min(min, nums[i]);
//                max = Math.max(max, nums[i]);
//                continue;
//            }
//            for (int j = 0; j < i; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}
