package count_trailing_zeros;

public class EfficientSolution {

    public static Long countTrailingZerosForFactorial(long number) {

        long counter = 0;

        for(int i = 5; i < number; i *=5) {
            counter += number/i;
        }

        return  counter;
    }

    public static void main(String[] args) {
        System.out.println(EfficientSolution.countTrailingZerosForFactorial(100));
        System.out.println(EfficientSolution.countTrailingZerosForFactorial(200));
        System.out.println(EfficientSolution.countTrailingZerosForFactorial(250));
        System.out.println(EfficientSolution.countTrailingZerosForFactorial(500));
    }
}
