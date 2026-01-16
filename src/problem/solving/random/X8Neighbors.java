
package problem.solving.random;

import java.util.Scanner;

public class X8Neighbors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        char[][] array = new char[101][101];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = input.next().charAt(0);
            }
        }
        int x = input.nextInt();
        int y = input.nextInt();
        x = x - 1;
        y = y - 1;
        if (array[x - 1][y] == 'x' && array[x - 1][y - 1] == 'x' && array[x][y - 1] == 'x' && array[x + 1][y - 1] == 'x'
                && array[x + 1][y] == 'x' && array[x + 1][y + 1] == 'x' && array[x][y + 1] == 'x'
                && array[x - 1][y + 1] == 'x') {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
