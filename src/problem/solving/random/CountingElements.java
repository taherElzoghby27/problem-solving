package problem.solving.random;

import java.util.ArrayList;
import java.util.Scanner;

public class CountingElements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList list = new ArrayList(n);
        int count = 0;
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (list.contains(((int) list.get(i)) + 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
