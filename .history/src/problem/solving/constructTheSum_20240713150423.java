package problem.solving;

import java.util.Scanner;

public class constructTheSum {
    // question link :
    // https://codeforces.com/group/MWSDmqGsZm/contest/326907/problem/G
    /*
     * You are given two integers 𝑛
     * and 𝑠
     * , and you have to find distinct positive integers, such that each of them is
     * ≤𝑛
     * , and their summation =𝑠
     * . Otherwise, state that this is impossible.
     * 
     * Input
     * The first line contains a number 𝑇
     * (1≤𝑇≤100
     * ) – number of test cases.
     * 
     * Each of the next 𝑇
     * lines contains two space-separated integers 𝑛,𝑠
     * (1≤𝑛≤105,1≤𝑠≤1018
     * ).
     * 
     * Output
     * For each test case, if there is no possible answer, print −1
     * on a single line. Otherwise, print the set of numbers that satisfy the above
     * condition on a single line. You can print the numbers in any order. If there
     * are multiple answers, you can print any of them.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t != 0) {
            int n = input.nextInt();
            int s = input.nextInt();
            boolean answer = false;
            if (s < n) {
                n = s;
            }
            for (int i = n; i >= 1; i--) {
                for (int j = i - 1; j >= 1; j--) {
                    if (i + j == s) {
                        answer = true;
                        System.out.println(i + " " + j);
                    }
                }
            }
            if (!answer) {
                System.out.println(-1);
            }
        }
    }
}
