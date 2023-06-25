package factorial;

public class FactorialUsingRecursion {

    public static Long factorial(long number) {
        if(number > 1) {
            return number * factorial(number - 1);
        } else {
            return number;
        }
    }
}
