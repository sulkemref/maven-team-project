package Bobur.week5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        int[] array = {6, 8, 3, 5, 1, 9};
        System.out.println("-----------------------");
        System.out.println("from Array each element is factorial: ");

        for (int k = 0; k < array.length; k++) {
            int num = array[k];
            int factorial = 1;
            for (int j = 1; j <= num; j++) {
                factorial *= j;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }


        int factorial = IntStream.range(1, array[0]+1)
                .reduce(1, (x, y) -> x * y);
        System.out.println(factorial); // Output: 720
        int[] factorials = Arrays.stream(array)
                .map(n -> IntStream.rangeClosed(1, n)
                        .reduce(1, (x, y) -> x * y))
                .toArray();
        System.out.println(Arrays.toString(factorials));// Output: [720, 40320, 6, 120, 1, 362880]

    }
}



