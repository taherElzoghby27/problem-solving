package problem.solving;

import java.math.BigDecimal;

public class GuessDataTypes {

    private final long n;
    private final long k;
    private final long a;

    public GuessDataTypes(long n, long k, long a) {
        this.n = n;
        this.k = k;
        this.a = a;
    }

    public void result() {
        double result = ((double) ((n * k) / a));
        System.out.println(result + " " + (long) result + " " + (BigDecimal.valueOf(result).compareTo(BigDecimal.valueOf((long) result)) != 0));
        if (BigDecimal.valueOf(result).compareTo(BigDecimal.valueOf((long) result)) != 0) {
            System.out.println("double");
        } else if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            System.out.println("long long");
        } else {
            System.out.println("int");
        }
    }
}
