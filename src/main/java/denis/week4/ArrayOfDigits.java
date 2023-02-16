package denis.week4;

import java.util.Arrays;

public class ArrayOfDigits {

    public static void main(String[] args) {

        int num = 490;
        System.out.println(Arrays.toString(arrayOfDigits(num)));

    }

    public static int [] arrayOfDigits (int num) {
        String str = Integer.toString(num);
        char [] charArray = str.toCharArray();
        int [] numericArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            numericArray[i] = Character.getNumericValue(charArray[i]);
        }
        return numericArray;
    }

    }

