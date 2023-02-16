package week_by_week.week05;

import java.util.Arrays;
/**
How to convert a positive int to an array of digits.
Input: 490		Output: [4, 9, 0] (as int Array)
 */
public class Q5ArrayOfDigits {



    public static void main(String[] args) {
            System.out.println(Arrays.toString(getDigits(490)));
            System.out.println(Arrays.toString(getDigits(0)));
            System.out.println(Arrays.toString(getDigitsWithStream(123)));
            System.out.println(Arrays.toString(getDigitsWithStream(0)));
            System.out.println(Arrays.toString(getDigitsWithStream2(342)));

    }

    static int[] getDigits(int number) {
        if ( number < 0)
            throw new IllegalArgumentException("input should not be negative integer");
        char[] chars = Integer.toString(number).toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] - '0';
        }
        return ints;
    }

    static int[] getDigitsWithStream(int number) {
        return Integer.toString(number)
                .chars()
                .map(Character::getNumericValue)    //  .map(c -> Character.getNumericValue(c)) //same
                .toArray();
    }

    static int[] getDigitsWithStream2(int number) {
        return Integer.toString(number)
                .chars()
                .map(c -> c - '0')
                .toArray();
    }


}
