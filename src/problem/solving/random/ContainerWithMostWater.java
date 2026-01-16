package problem.solving.random;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea1(height));
    }

    public static int maxArea(int[] height) {
        int size = height.length;
        int max = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int result = 0;
                if (height[j] > height[i]) {
                    //Area=distance between the two lines×height of the shorter line
                    result = height[i] * (j - i);
                } else {
                    result = height[j] * (j - i);
                }
                if (result > max) {
                    max = result;
                }
            }
        }
        return max;
    }

    public static int maxArea1(int[] height) {
        int size = height.length;
        int max = 0;
        int l = 0, r = size - 1;
        while (l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int base = r - l;
            //Area=distance between the two lines×height of the shorter line
            int maxContainer = minHeight * base;
            max = Math.max(max, maxContainer);
            if (height[l] > height[r]) {
                --r;
            } else {
                ++l;
            }
        }
        return max;
    }
}
