package problem.solving;

import java.util.Scanner;

public class ProblemSolving {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean flag=false;
        for (int i = 0; i < num; i ++) {
            for (int j = num - 1; j >= 0; j --) {
                if (i%2==0&&j%2==0&&i+j==num) {
                    flag =true;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("No");
    }

}
