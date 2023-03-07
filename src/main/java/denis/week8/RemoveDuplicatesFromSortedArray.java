package denis.week8;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        //int[] arr = new int[]{1,1,2};
        int count = 0;
        int result;


        for (int i = 0; i < arr.length - 1; i++) { //replacing duplicates with -1
            if (arr[i] == arr[i + 1]) {
                arr[i] = -1;
            }
        }
        for (int i = 0; i < arr.length; i++) { //shifting all non -1 to the left
            if (arr[i] != -1) {
                arr[count] = arr[i];
                count++;
            }
        }
        result = count;
        for (int i = 0; i < arr.length; i++) { // replacing the rest with 0
            if (count < arr.length) {
                arr[count] = -1;
            }
            count++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("The number of unique numbers: "+result);
    }

}


