package problem.solving;

import java.util.HashMap;

/**
 * KthDistinctStringinanArray
 */
public class KthDistinctStringinanArray {
    public static void kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> strs = new HashMap<String, Integer>();
        for (String str : arr) {
            if (strs.containsKey(str)) {
                strs.put(str, strs.get(str) + 1);
            } else {
                strs.put(str, 1);
            }
        }
        System.out.println(strs);
    }

    public static void main(String[] args) {
        String[] arr = { "d", "b", "c", "b", "c", "a" };
        kthDistinct(arr, 3);
    }
}