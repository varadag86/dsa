package count_digits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SolutionTest {

    @Test
    @DisplayName("Count digits under 10000")
    void Test_CountDigits_Under_10000() {
        int digitsCounted = Solution.countDigits(10000);
        Assertions.assertEquals(5, digitsCounted);
    }

    @Test
    @DisplayName("Count digits greater than 10000000")
    void Test_CountDigits_Under_10000000() {
        int digitsCounted = Solution.countDigits(10000000);
        Assertions.assertEquals(8, digitsCounted);
    }
}
