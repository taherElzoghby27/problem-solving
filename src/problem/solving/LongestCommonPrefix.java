package problem.solving;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;
        while (index < str1.length() && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return index == 0 ? "" : str1.substring(0, index);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strs = { "flower","flow","floght" };
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

}
