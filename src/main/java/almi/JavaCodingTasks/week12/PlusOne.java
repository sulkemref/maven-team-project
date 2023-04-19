package almi.JavaCodingTasks.week12;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the
 * integer. The digits are ordered from most significant to least significant in left-to-right order. The large
 * integer does not contain any leading 0's.
 * Increment the large integer by one and return the resulting array of digits
 **/

public class PlusOne {

    public static void main(String[] args) {


        int[] intArray = {1, 2, 3};
        int[] intArray2 = {4, 3, 2, 1};
        int[] intArray3 = {9};

        System.out.println(Arrays.toString(incrementByOne(intArray3)));

    }

    public static int[] incrementByOne(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                return array;
            }
            array[i] = 0;
        }

        array = new int[array.length + 1];
        array[0] = 1;
        return array;

    }

}



