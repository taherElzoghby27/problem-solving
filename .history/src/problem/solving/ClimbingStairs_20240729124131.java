package problem.solving;

import java.util.Scanner;

public class ClimbingStairs {
    static int fib(int n) {
        if (n <= 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(fib(5));
    }
}
