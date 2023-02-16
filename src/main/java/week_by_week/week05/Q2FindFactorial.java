package week_by_week.week05;

import java.util.stream.Stream;

/**
 * Write a method that returns the factorial number of any given number.
 * Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
 */
public class Q2FindFactorial {

    public static void main(String[] args) {
        System.out.println(findFactorial(5));
        System.out.println(findFactorial(1));
        System.out.println(findFactorial(0));
        System.out.println(findFactorialWithStream1(5));
        System.out.println(findFactorialWithStream2(1));
        System.out.println(findFactorialWithStream1(6));
        System.out.println(findFactorialWithStream2(4));
        System.out.println(findFactorial(-2));
    }


    public static int findFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter needs to be 0 or more");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;

    }

    public static int findFactorialWithStream1(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter needs to be 0 or more");
        }

        return Stream.iterate(1,i->i<n,i->i+1)
                .reduce(1,(x,y)->x*y);

    }

    public static int findFactorialWithStream2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter needs to be 0 or more");
        }

        return Stream.iterate(1,i->i+1)
                .limit(n)
                .reduce(1,(x,y)->x*y);

    }
}
