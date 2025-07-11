package problem.solving;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] result = productExceptSelf(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
        System.out.println("");
    }

    public static int[] productExceptSelf(int[] nums) {//o(n)
        int size = nums.length;
        int[] step1 = new int[size];
        int leftProducts = 1;
        step1[0] = 1;
        for (int i = 1; i < size; i++) {
            leftProducts *= nums[i - 1];
            //1  1  2
            step1[i] = leftProducts;
            //1  1  2  6
        }
        int[] step2 = new int[size];
        int rightProducts = 1;
        //nums -> 4 3 2 1
        //step1->6 2 1 1
        for (int i = size - 1; i >= 0; i--) {
            step2[i] = rightProducts * step1[i];
            //      24 12 8 6 
            rightProducts *= nums[i];
            //      24 24 12 4
        }
        return step2;
    }

//    public static int[] productExceptSelf(int[] nums) {//o(n2)
//        int size = nums.length;
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            int products;
//            if (i == 0) {
//                products = products(nums, 1, size);
//            } else if (i == size - 1) {
//                products = products(nums, 0, size - 1);
//            } else {
//                int leftProducts = 0, rightProducts = 0;
//                leftProducts = products(nums, 0, i);
//                rightProducts = products(nums, i + 1, size);
//                products = leftProducts * rightProducts;
//            }
//            array[i] = products;
//        }
//        return array;
//    }
//
//    public static int products(int[] nums, int startIndex, int endIndex) {//products of nums
//        int products = 1;
//        for (int i = startIndex; i < endIndex; i++) {
//            products *= nums[i];
//        }
//        return products;
//    }
    
    
    
    
//        public int[] productExceptSelf(int[] nums) {
//        int size = nums.length;
//    int[] result = new int[size];
//    
//    // Initialize result array and calculate products of all elements to the left
//    result[0] = 1;
//    for (int i = 1; i < size; i++) {
//        result[i] = result[i - 1] * nums[i - 1];
//    }
//    
//    // Multiply by products of all elements to the right in a single pass
//    int rightProduct = 1;
//    for (int i = size - 1; i >= 0; i--) {
//        result[i] *= rightProduct;
//        rightProduct *= nums[i];
//    }
//    
//    return result;
//    }
}
