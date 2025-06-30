package com.mycompany.project_problem_solving;

import java.util.Scanner;

public class GoodorBad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String str = input.next();
            if (str.contains("010") || str.contains("101")) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
    }
}
