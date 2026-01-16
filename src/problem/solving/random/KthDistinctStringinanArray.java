package problem.solving.random;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * KthDistinctStringinanArray
 */
public class KthDistinctStringinanArray {
    public static String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> strs = new LinkedHashMap<String, Integer>();
        for (String str : arr) {
            if (strs.containsKey(str)) {
                strs.put(str, strs.get(str) + 1);
            } else {
                strs.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : strs.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) {
                --k;
                if (k == 0) {
                    return key;
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] arr = { "d","b","c","b","c","a" };
        int k = 2;
        System.out.println(kthDistinct(arr, k));
    }
}