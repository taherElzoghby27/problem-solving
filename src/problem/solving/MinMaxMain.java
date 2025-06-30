package com.mycompany.project_problem_solving;

import java.util.Scanner;

public class MinMaxMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        MinMax minMax = new MinMax(a, b, c);
        System.out.println(minMax.min() + " " + minMax.max());
    }
}

class MinMax {

    private final int a;
    private final int b;
    private final int c;

    public MinMax(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int max() {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public int min() {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

}
