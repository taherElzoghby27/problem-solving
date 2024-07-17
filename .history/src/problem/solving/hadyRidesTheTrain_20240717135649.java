package problem.solving;

import java.math.BigInteger;
import java.util.Scanner;

public class hadyRidesTheTrain {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();
        BigInteger columns=BigInteger.valueOf(4);
        BigInteger columns1=BigInteger.valueOf(3);
        BigInteger row=n.divide(columns);
        BigInteger column=n.mod(columns);
        column=columns1.subtract(column);
        System.out.println(row+" "+column);
    }

}
