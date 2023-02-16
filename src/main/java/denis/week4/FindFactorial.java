package denis.week4;

public class FindFactorial {

    public static void main(String[] args) {

        System.out.println(factorialNumber(6));

    }
    public static int factorialNumber (int number) {
        for (int i = number-1; i > 0; i--) {

            number*=i;
        }
        return number;
    }

    }

