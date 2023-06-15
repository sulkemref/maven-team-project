package week_by_week.week21;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println("getSumOfDigits(16) = " + getSumOfDigits(16));
        System.out.println("getSumOfDigitsIterative(16) = " + getSumOfDigitsIterative(16));

    }


    public static int getSumOfDigits(int number) {

        if (number < 10) {
            return number;
        }

        int sum = 0;
        while (number > 0) {

            sum += number % 10;
            number /= 10;

        }
        return getSumOfDigits(sum);
    }

    public static int getSumOfDigitsIterative(int number) {

        while (number > 9) {
            int sum = 0;
            while (number > 0) {

                sum += number % 10;
                number /= 10;

            }
            number = sum;
        }

        return number;
    }


}
