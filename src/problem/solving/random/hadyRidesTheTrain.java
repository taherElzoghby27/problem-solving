package problem.solving.random;

import java.util.Scanner;

public class hadyRidesTheTrain {
    //link : https://codeforces.com/group/MWSDmqGsZm/contest/326907/problem/E
/*
Hady wants to ride a train. He knows his seat number, but he doesn't know the corresponding row or column number of his seat. However, he knows that each row consists of exactly 4
 seats. The train seats are numbered from zero as shown in the figure:


Given the seat number, can you find the corresponding row and column numbers of the seat?

Input
Only one line containing 𝑖𝑑
 (0≤𝑖𝑑≤1018
) – the seat number.

Output
The row and column numbers of the seat. 

 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long row = (long) (n / 4);
        long column = (long) (n % 4);
        if (row % 2 != 0) {
            column = 3 - column;
        }
        System.out.println(row + " " + column);
    }

}
