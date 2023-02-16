package week_by_week.week05;

import java.util.Arrays;

/**
 Write a function that can find the maximum number from an int Array.
 input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
 */
public class Q1FindMaxFromArray {

    public static void main(String[] args) {
        int[] array = {6, 8, 3, 5, 1, 9};
        System.out.println(maxValueWithStream(array));
        System.out.println(maxValueWithStream(new int[1]));
        System.out.println(maxValueWithStream(new int[0]));
        System.out.println(maxValueWithStream(null));
    }

    public static int maxValue(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Parameter array needs to contain at least one element");
        }

        int max = Integer.MIN_VALUE;

        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public static int maxValueWithStream(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Parameter array needs to contain at least one element");
        }
        int max = Arrays.stream(array).max().getAsInt();
        return max;
    }
}
