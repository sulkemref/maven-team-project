package denis.week8;


import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        moveZerosBadSolution(arr);
        moveZerosGoodSolution(arr);
    }

    public static void moveZerosBadSolution(int[] arr) {
        //int[] arr = new int[]{0, 1, 0, 3, 12};
        int temp;
        for (int i = 0; i < arr.length - 2; i++) {

            if (arr[i] == 0 && arr[i + 1] != 0) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            } else if (arr[i] == 0 && arr[i + 1] == 0 && arr[i + 2] != 0) {
                temp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZerosGoodSolution(int[] arr) {
        //int[] arr = new int[]{0, 1, 0, 3, 12};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (count < arr.length) {
                arr[count] = 0;
                count++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
