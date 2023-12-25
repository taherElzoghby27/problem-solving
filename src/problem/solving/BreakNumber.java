package problem.solving;

import java.util.Scanner;

public class BreakNumber {
// Input
// The first line contains one number N
//  (1≤N≤105
// ).

// The second line contains N
//  space-separated numbers where each number is between 1
//  and 1018
//  (inclusive).

// Output
// Print the maximum f(x)
//  among all numbers.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            long number = input.nextLong();
            while (number != 0 && number % 2 == 0) {
                count++;
                number /= 2;
            }
            if (count > max) {
                max = count;
            }
            count = 0;
        }
        System.out.println(max);
    }
}
