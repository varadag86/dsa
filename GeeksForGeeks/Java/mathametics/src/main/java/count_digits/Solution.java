package count_digits;

import java.util.List;

public class Solution {

    public static Integer countDigits(long number) {

        int count = 0;
        while(number > 0) {
            number /= 10;
            count += 1;
        }

        return count;
    }

    public static void main(String[] args) {

        List<Long> testDigits = List.of(100L, 2000L, 5000L, 80000000000L, 1000000000000000000L);
        for (Long testDigit : testDigits) {
            System.out.println("The number of digits in the number " + testDigit + " is " + Solution.countDigits(testDigit));
        }
    }
}
