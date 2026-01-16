package problem.solving.random;

import java.util.Scanner;

public class ConvertToDecimal {
//ex : 10->1010->11>3
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        while (times > 0) {
            int n = input.nextInt();
            int ones = 0;
            int sum = 0;
            //convert decimal  to binary
            while (n > 0) {
                if (n % 2 == 1) {
                    //sum ones
                    ones++;
                }
                n /= 2;
            }
            //convert binary to decimal
            for (int i = 0; i < ones; i++) {
                sum += Math.pow(2, i);
            }
            System.out.println(sum);
            --times;
        }
    }
}
