package problem.solving.random;

import java.util.Scanner;

public class LowestNumber {

    //E - Lowest Number : https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/E
    // E - Lowest Number :
    // https://codeforces.com/group/MWSDmqGsZm/contest/219774/problem/E
    /*
     Given a number N and an array A of N numbers. Print the lowest number and its position.

Note: if there are more than one answer print first one's position.

Input
First line contains a number N (2 ≤ N ≤ 1000) number of elements.

Second line contains N numbers (-105  ≤  Ai  ≤  105).

Output
Print the lowest number and its position (1-index).
     */
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
