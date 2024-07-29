package problem.solving;

import java.util.Scanner;

public class ClimbingStairs {
    static int climbStairs(int n) {
        if (n <= 1)
            return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(climbStairs(4));
    }
}
