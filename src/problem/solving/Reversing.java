package problem.solving;

import java.util.Scanner;

public class Reversing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        //for input 
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        //for operations
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = 0; j < i / 2; j++) {
                    int temp = arr[j];
                    arr[j] = arr[i - j - 1];
                    arr[i - j - 1] = temp;
                }
            }
        }
        //for print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
