package almi.JavaCodingTasks.week5;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method that returns the factorial number of any given number.
 * Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller
 * than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.
 **/

public class FindFactorial {

    public static void main(String[] args) {

        factorialReturn(6);
//        -> 720

        factorialReturn(10);
//        -> 3628800


    }

    private static void factorialReturn(int number) {

        List<Integer> factorialList = new ArrayList<>();

        for (int i = 1; i < number + 1; i++) {
            factorialList.add(i);

        }
//
        System.out.println(factorialList.stream().reduce(1, (a, b) -> (a * b)));

    }

}