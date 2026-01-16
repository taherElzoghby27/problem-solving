package problem.solving.random;

import java.util.Scanner;

public class some_sums {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
//           // if one digit
//            if (i / 10 == 0) {
//                if (i >= a && i <= b) {
//                    total += i;
//                }
//            } else {//if two digit
            int sum = 0;
            int num = i;
            while (num != 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            if (sum >= a && sum <= b) {
                total += i;
            }
            //}
        }
        System.out.println(total);
    }
}
