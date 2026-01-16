package problem.solving.random;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutive {

    public static void main(String[] args) {
        int[] array = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(array));
    }

    public static int longestConsecutive(int[] nums) {
        //convert to set
        Set<Integer> numbersSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        Set<Integer> numbersSet = new HashSet<>();
//        for (int i : nums) {
//            numbersSet.add(i);
//        }
        int longest = 0;

        for (int number : numbersSet) {
            //if number not have before will success - > 100 , 200 , 1
            if (!numbersSet.contains(number - 1)) {
                int currentNumber = number;
                int count = 1;
                while (numbersSet.contains(currentNumber + 1)) {
                    currentNumber++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
