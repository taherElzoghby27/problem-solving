
package problem.solving;

import java.util.Scanner;

public class X8Neighbors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String[][] array = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = input.next("x");
            }
        }
        int x = input.nextInt();
        int y = input.nextInt();
        if (array[x - 1][y] == "x" && array[x - 1][y - 1] == "x" && array[x][y - 1] == "x" && array[x + 1][y - 1] == "x"
                && array[x + 1][y] == "x" && array[x + 1][y + 1] == "x" && array[x][y + 1] == "x"
                && array[x - 1][y + 1] == "x") {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
