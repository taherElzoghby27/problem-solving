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
        int[] arraySum=new int[array.length+1];
        //for(int i=0;)
        System.out.println(length);
    }
}
