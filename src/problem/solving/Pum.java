package problem.solving;

import java.util.Scanner;

public class Pum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 1;
        for (int j = 1; j <= n; j++) {
            if (count % 4 == 0) {
                System.out.println("PUM");
                count++;
                j--;
                continue;
            }
            System.out.print((count++) + " " + (count++) + " " + (count++) + " ");
        }
        System.out.println("PUM");
    }
}
