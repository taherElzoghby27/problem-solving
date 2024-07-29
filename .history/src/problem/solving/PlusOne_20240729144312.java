package problem.solving;

public class PlusOne {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };

        String nums = "";
        for (int i = 0; i < array.length; i++) {
            nums += array[i];
        }
        int num=Integer.parseInt(nums)+1;
        int length=(num+"").length();
        int[] arraySum=new int[length];
        for(int i=length-1;i>=0;i--){
            int reminder=num%10;
            arraySum[i]=reminder;
            num/=10;
        }
        for(int i=0;i<length;i++){
            System.out.println(arraySum[i]);
        }
    }
}
