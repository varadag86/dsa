package count_trailing_zeros;

import factorial.FactorialUsingRecursion;
import factorial.FactorialUsingTailRecursion;

import java.math.BigInteger;

public class NaiveSolution {

    public static Integer countTrailingZerosInFactorial(long number) {

        BigInteger result = FactorialUsingTailRecursion.tailRecursion(number, BigInteger.valueOf(1));
        int counter = 0;
        while(result.mod(BigInteger.valueOf(10)).equals(new BigInteger("0"))) {
            counter += 1;
            result = result.divide(BigInteger.valueOf(10));
        }

        return counter;
    }
}
