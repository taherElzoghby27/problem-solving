package problem.solving;

public class IsPalindrome {

    public static void main(String[] args) {
        String s = "aa";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {//string builder
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int size = s.length();
        if (s.isEmpty()) {
            return true;
        }
        int updatedSize = 0;
        updatedSize = size / 2;
        if (updatedSize == 0) {
            updatedSize = 1;
        }
        for (int i = 0; i < updatedSize; i++) {
            if (s.codePointAt(i) != s.codePointAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome1(String s) {
        int size = s.length();
        int low = 0, high = size - 1;
        while (low < high) {
            // Skip non-alphanumeric characters
            while (low < high && !Character.isLetterOrDigit(s.charAt(low))) {
                ++low;
            }
            while (low < high && !Character.isLetterOrDigit(s.charAt(high))) {
                --high;
            }
            if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                return false;
            }
            --high;
            ++low;
        }
        return true;
    }
}
