package factorial;

public class NaiveSolution {

    public static Long factorial(int number) {
        Long result = 1L;
        while(number > 1) {
            result *= number;
            number -= 1;
        }

        return result;
    }
}
