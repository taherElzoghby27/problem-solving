package problem.solving;

import java.util.Scanner;

public class Reversing {
    //F. Reversing : https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/F
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }
        for (int i = num-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
