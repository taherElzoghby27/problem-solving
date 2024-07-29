package problem.solving;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String nums = "";
        for (int i = 0; i < digits.length; i++) {
            nums += digits[i];
        }
        long num = Integer.parseInt(nums) + 1;
        int length = (num + "").length();
        int[] arraySum = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            int reminder = (int) num % 10;
            arraySum[i] = reminder;
            num /= 10;
        }
        return arraySum;
    }

    public static void main(String[] args) {
        int[] a = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        int[] arr = plusOne(a);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
