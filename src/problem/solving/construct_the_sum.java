package com.mycompany.project_problem_solving;

import java.util.Scanner;

public class construct_the_sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int s = input.nextInt();
            int sum = 0;
            double result = s / n;
            if (result > n) {
                System.out.println("-1");
            } else if (s <= n) {
                for (int i = s - 1; i > 0; i--) {
                    if (sum + i <= s) {
                        sum += i;
                        System.out.print(i + " ");
                    }
                }
            } else {
                for (int i = n; i > 0; i--) {
                    if (sum + i <= s) {
                        sum += i;
                        System.out.print(i + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
