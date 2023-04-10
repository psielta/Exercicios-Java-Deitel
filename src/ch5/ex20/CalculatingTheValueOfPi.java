package ch5.ex20;

import java.math.BigDecimal;
import java.math.MathContext;

import static java.lang.Math.*;

public class CalculatingTheValueOfPi {
    public static void main(String[] args) {
        BigDecimal pi = BigDecimal.valueOf(4);
        final BigDecimal FOUR = BigDecimal.valueOf(4);
        BigDecimal incr = BigDecimal.valueOf(3);
        for (int i = 1; i <= 200_000; i++) {
            pi = pi.add(FOUR.divide(incr.multiply(BigDecimal.valueOf(pow(-1., i))), MathContext.DECIMAL128));
            incr = incr.add(BigDecimal.TWO);
        }
        System.out.println(pi);
    }
}
