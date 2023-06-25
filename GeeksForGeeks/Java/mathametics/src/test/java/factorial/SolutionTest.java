package factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    @DisplayName("Test the naive solution implemented for factorial of a number.")
    public void Test_Factorial_Of_5() {
        Long result = NaiveSolution.factorial(5);
        Assertions.assertEquals(5 * 4 * 3 * 2, result);
    }
}
