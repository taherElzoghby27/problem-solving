package problem.solving;

import java.util.Scanner;

public class LowestNumber {
    // E - Lowest Number :
    // https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/E
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = input.nextInt();
        }
        int min = array[0];
        int indexMin = 0;
        for (int i = 1; i < num; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println(min + " " + (indexMin + 1));
    }
}
