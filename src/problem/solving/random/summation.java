
package problem.solving.random;

import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextInt();
        long sum = input.nextInt();
        while ((--num) != 0) {
            long n = input.nextInt();
            sum += n;
        }
        System.out.println(Math.abs(sum));
        System.out.println();
    }
}
