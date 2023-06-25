package factorial;

import java.math.BigInteger;

public class FactorialUsingTailRecursion {

    public static BigInteger tailRecursion(long number, BigInteger acc) {
        if(number == 1) return  acc;
        else {
            acc = acc.multiply(BigInteger.valueOf(number));
            number -= 1;
            return tailRecursion(number, acc);
        }
    }
}
