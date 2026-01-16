package problem.solving.random;

import java.util.Scanner;

public class ProblemSolving {

    public static int gcd(int a, int b) {
        if (b != 0) {
            return gcd(b, a % b);
        } else {
            return Math.abs(a);
        }

    }

    public static void main(String[] args) {
    }

}
