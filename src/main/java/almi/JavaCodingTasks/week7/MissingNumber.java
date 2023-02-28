package almi.JavaCodingTasks.week7;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {


        int[] arrayOfNumbers = {5, 2, 1, 4 ,0};
        int[] arrayOfNumbers2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};


        findMissingNumber(arrayOfNumbers);    // --> 3
        findMissingNumber(arrayOfNumbers2);   // --> 8


    }

    public static int findMissingNumber(int[] arrayOfNumbers) {

        var arrayOfNumbers2 = Arrays.stream(arrayOfNumbers).sorted();

        int n = 0;

        for (int each : arrayOfNumbers2.toArray()) {
            if (each <= n) {n++;}
        }

        System.out.println(n);
        return n;
    }

}


