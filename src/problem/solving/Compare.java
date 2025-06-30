package com.mycompany.project_problem_solving;

import java.util.Scanner;

public class Compare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x = input.next();
        String y = input.next();
        System.out.println(compareXY(x, y));

    }

    static String compareXY(String x, String y) {
        if (x.compareTo(y) <= 0) {
            return x;
        }
        return y;
//        if (x.length() > y.length()) {
//            for (int i = 0; i < y.length(); i++) {
//                if (x.codePointAt(i) < y.codePointAt(i)) {
//                    return x;
//                } else if (x.codePointAt(i) > y.codePointAt(i) || i == y.length() - 1) {
//                    return y;
//                }
//            }
//        } else if (x.length() < y.length()) {
//            for (int i = 0; i < x.length(); i++) {
//                if (x.codePointAt(i) > y.codePointAt(i)) {
//                    return y;
//                } else if (x.codePointAt(i) < y.codePointAt(i) || i == x.length() - 1) {
//                    return x;
//                }
//            }
//        } else {
//            for (int i = 0; i < x.length(); i++) {
//                if (x.codePointAt(i) > y.codePointAt(i)) {
//                    return y;
//                } else if (x.codePointAt(i) < y.codePointAt(i)) {
//                    return x;
//                }
//            }
//        }
//        return x;
    }
}
