package problem.solving.random;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Shrouk walks with Weaam and gives her a task that given a number get factorial of that number and tell me it is even or not.
        but Weaam asks you to solve this problem.
         ->get factorial of n and if is even print "YES" without quotes else print "NO" without quotes.
         */
        long num = input.nextLong();
        if (num == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
