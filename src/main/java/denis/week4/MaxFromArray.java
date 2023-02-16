package denis.week4;

import java.util.Arrays;

public class MaxFromArray {

    public static void main(String[] args) {

        int [] arr = new int[] {6,8,3,5,1,9};
        System.out.println(maxArray(arr));
       //USING STREAM
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("max = " + max);

    }

    public static int maxArray (int [] a) {
        Arrays.sort(a);
        return a[a.length-1];
    }


}
