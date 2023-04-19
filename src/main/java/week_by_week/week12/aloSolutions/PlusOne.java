package week_by_week.week12.aloSolutions;

import java.math.BigInteger;
import java.sql.Time;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] numbers = {9, 9, 9, 9, 9};
        System.out.println(Arrays.toString(withOneForLoop(numbers)));
    }

    public static int[] getPlusOneBruteForce(int[] digits) {

        BigInteger number = BigInteger.ZERO;
        BigInteger multiplier = BigInteger.ONE;
        for (int i = digits.length - 1; i >= 0; i--) {
            number= number.add(multiplier.multiply(BigInteger.valueOf(digits[i])));
            multiplier = multiplier.multiply(BigInteger.TEN);
        }
        number= number.add(BigInteger.ONE);

        String numberInString = String.valueOf(number);

        int[] resultArray = new int[numberInString.length()];


        for (int i = 0; i < numberInString.length(); i++) {
            resultArray[i] = Integer.parseInt(String.valueOf(numberInString.charAt(i)));
        }

        return resultArray;
    }

    /**Time Complexity O(n) The space complexity of the solution I provided is O(1) because we are modifying the input array in place, and we are only using a constant amount of extra space for the variables i and carry.
    Even in the worst-case scenario where all the digits in the input array are 9s and we have to create a new array of size n+1 to return the result, the space complexity would still be O(1) because the extra space we are using is independent of the size of the input array.*/
    public static int[] withOneForLoop(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
                // starting from extreme right--> if array[i] is less than 9 means can be added with 1
                // i.e. [ 5,8 ]-->[ 5,9 ] or
                //      [ 9,4 ]-->[ 9,5 ] or
                //      [ 6,0 ]-->[ 6,1 ] and will directly return array
            }
            digits[i] = 0;
            // if array[i] is not less than 9, means it have to be 9 only then digit is changed to 0,
            // and we again revolve around loop to check for number if less than 9 or not
            // i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
            //      [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
            // and will directly return array
        }
// if all number inside array are 9 i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
// but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ] to make like above we need to make new array of length--> n+1
// by default new array values are set to -->0 only thus just changed first value of array to 1 and return the array
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
