package count_trailing_zeros;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CountTrailingZerosTest {

    @DisplayName("Count trailing zeros using recursive solution.")
    @Test
    void countTrailingZerosTest() {
        int result = NaiveSolution.countTrailingZerosInFactorial(100);
        Assertions.assertEquals(24, result);
    }

    @DisplayName("Count trailing zero using algorithms")
    @Test
    void countingTrailingZerosUsingAlgorithms() {
        long result = EfficientSolution.countTrailingZerosForFactorial(250);
        Assertions.assertEquals(62, result);
    }
}
