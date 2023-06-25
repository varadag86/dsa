package factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SolutionWithRecursionTest {

    @Test
    @DisplayName("Test recursive solution of factorial of a number")
    void Test_Factorial_Of_Number() {
        Long result = FactorialUsingRecursion.factorial(10);
        Assertions.assertEquals(3628800, result);
    }
}
