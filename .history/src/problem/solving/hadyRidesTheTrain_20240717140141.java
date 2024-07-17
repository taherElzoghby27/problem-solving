package problem.solving;

import java.util.Scanner;

public class hadyRidesTheTrain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        int row = (int) (n / 4);
        int column = (int) (n % 4);
        if (row % 2 != 0) {
            column = 3 - column;
        }
        System.out.println(row + " " + column);
    }

}
