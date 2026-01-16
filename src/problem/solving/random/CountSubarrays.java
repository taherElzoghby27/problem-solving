package problem.solving.random;

import java.util.Scanner;

public class CountSubarrays {
    //Q. Count Subarrays : https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/Q

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while ((t--) > 0) {
            int size = input.nextInt();
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
            int result = size;
            int i = 0;
            int z = 0;
            while (true) {
                if (z == size - 1) {
                    break;
                }
                if (array[i] > array[i + 1]) {
                    ++z;
                    i = z;
                    continue;
                }
                result++;
                i++;
                if (i == size - 1) {
                    ++z;
                    i = z;
                }
            }
            System.out.println(result);
        }
    }
}
