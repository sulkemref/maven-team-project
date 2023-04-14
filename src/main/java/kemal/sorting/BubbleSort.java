package kemal.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] params) {
        int[] array = new int[] {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void bubbleSort(int[] array){ // O(1) space O(n^2) time
        int attempt = 1;
        boolean isNotSorted = true;
        while (isNotSorted){
            isNotSorted = false;
            System.out.println("Attempt: "+attempt++);
            System.out.println(Arrays.toString(array));
            for(int i = 1; i < array.length;i++){
                if(array[i-1]>array[i]){
                    int tmp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = tmp;
                    isNotSorted = true;
                }
            }
        }
    }



    public static void bubbleSortFinal(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }
}