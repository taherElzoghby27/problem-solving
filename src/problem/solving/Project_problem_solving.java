package com.mycompany.project_problem_solving;

import java.util.Scanner;

public class Project_problem_solving {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long m = input.nextLong();
        long k = input.nextLong();
        int count = 0;
        while (true) {
            boolean flag = false;
            if (n >= 2 && m == 1 && k >= 1) {
                n -= 2;
                m -= 1;
                k -= 1;
                ++count;
                flag = true;
            } else if (n >= 2 && k >= 1) {
                n -= 2;
                k -= 1;
                ++count;
                flag = true;
            } else if (n >= 1 && m >= 1 && k >= 1) {
                n -= 1;
                m -= 1;
                k -= 1;
                ++count;
                flag = true;
            }
            if (flag == false) {
                break;
            }
        }
        System.out.println(count);
    }
}
