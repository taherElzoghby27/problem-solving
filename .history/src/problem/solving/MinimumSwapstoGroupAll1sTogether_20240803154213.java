package problem.solving;

public class MinimumSwapstoGroupAll1sTogether {
    public static int minSwaps(int[] nums) {
        int sizeArray = nums.length;// 5
        int countOfNum1 = 0;
        for (int i = 0; i < sizeArray; i++) {
            if (nums[i] == 1)
                countOfNum1++;
        }
        int[] arrayOfMinSwap = new int[sizeArray];
        int beginIndex = 0;
        for (int i = 0; i < sizeArray; i++) {
            int count1In = 0;
            int countSubArray = 0;
            int j = beginIndex;
            while (true) {
                if (nums[j] == 1) {
                    count1In++;
                }
                if (countSubArray == countOfNum1-1)
                    break;
                ++countSubArray;
                if (j == sizeArray - 1)
                    j = 0;
                ++j;
            }
            beginIndex++;
            if (count1In == countOfNum1)
                return 0;
            arrayOfMinSwap[i] = countOfNum1 - count1In;
        }
        int min = arrayOfMinSwap[0];
        for (int i = 0; i < arrayOfMinSwap.length; i++) {
            System.out.print(arrayOfMinSwap[i] + " ");
            if (arrayOfMinSwap[i] < min)
                min = arrayOfMinSwap[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1 };
        int n = minSwaps(arr);
        System.out.println("ee "+n);
    }
}
