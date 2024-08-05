package problem.solving;

/**
 * RangeSumofSortedSubarraySums
 */
public class RangeSumofSortedSubarraySums {
    public static void rangeSum(int[] nums, int n, int left, int right) {
        //int ruleNToM=((m-n)/2+n)*(m-n+1);
        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++){
                System.out.println(((nums[j]-nums[i])/2+nums[i])*(nums[j]-nums[i]+1));
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        rangeSum(arr,3,3,3);
    }
}