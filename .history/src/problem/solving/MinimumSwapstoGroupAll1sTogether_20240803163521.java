package problem.solving;

public class MinimumSwapstoGroupAll1sTogether {
    public static int minSwaps(int[] nums) {
        int sizeArray = nums.length;
        int countOfNum1 = 0;
        for (int num : nums) {
            if (num == 1) {
                countOfNum1++;
            }
        }

        if (countOfNum1 == 0) {
            return 0;
        }
        int windowSize = countOfNum1;
        int currentWindowOnes = 0;
        int maxWindowOnes = 0;
        for (int i = 0; i < windowSize; i++) {
            if (nums[i] == 1) {
                currentWindowOnes++;
            }
        }
        maxWindowOnes = currentWindowOnes;
        for (int i = 1; i < sizeArray; i++) {
            if (nums[i - 1] == 1) {
                currentWindowOnes--;
            }
            if (nums[(i + windowSize - 1) % sizeArray] == 1) {
                currentWindowOnes++;
            }
            maxWindowOnes = Math.max(maxWindowOnes, currentWindowOnes);
        }
        return countOfNum1 - maxWindowOnes;
        // int sizeArray = nums.length;// 5
        // int countOfNum1 = 0;
        // for (int i = 0; i < sizeArray; i++) {
        //     if (nums[i] == 1)
        //         countOfNum1++;
        // }
        // if (countOfNum1 == 0)
        //     return 0;
        // int[] arrayOfMinSwap = new int[sizeArray];
        // int beginIndex = 0;
        // int j = 0;
        // for (int i = 0; i < sizeArray; i++) {
        //     int count1In = 0;
        //     int countSubArray = 0;
        //     j = beginIndex;
        //     while (true) {
        //         if (j == sizeArray)
        //             j = 0;
        //         if (nums[j] == 1) {
        //             count1In++;
        //         }
        //         if (countSubArray == countOfNum1 - 1)
        //             break;
        //         ++countSubArray;
        //         ++j;
        //     }
        //     ++beginIndex;
        //     if (count1In == countOfNum1)
        //         return 0;
        //     arrayOfMinSwap[i] = countOfNum1 - count1In;
        // }
        // int min = arrayOfMinSwap[0];
        // for (int i = 0; i < arrayOfMinSwap.length; i++) {
        //     if (arrayOfMinSwap[i] < min)
        //         min = arrayOfMinSwap[i];
        // }
        // return min;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 0, 0, 1, 1, 0 };
        int n = minSwaps(arr);
        System.out.println();
        System.out.println(n);
    }
}
