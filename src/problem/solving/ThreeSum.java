package problem.solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    public static void main(String[] args) {
        //int[] result = {0, 0, 0};
        int[] result = {-4, -1, -1, 0, 1, 2};
        System.out.println(threeSum1(result));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        result.add(List.of(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return result.stream().toList();
    }


    
    public static List<List<Integer>> threeSum1(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < size - 2; i++) {//-3,-3,-2,-1,0,1,2,-1,-4
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = size - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == -(nums[i])) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    ++left;
                    --right;
                    while (left < right && nums[left] == nums[left - 1]) {
                        ++left;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        --right;
                    }
                } else if (sum < -(nums[i])) {
                    ++left;
                } else {
                    --right;
                }
            }
        }
        return result;
    }
}
