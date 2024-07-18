
package problem.solving;

import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = input.nextInt();
        while ((num--) != 0) {
            int n = input.nextInt();
            sum += n;
        }
        System.out.println(sum);
        System.out.println(Math.abs(sum));
    }
}
