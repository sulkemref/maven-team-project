package kemal.sorting;

import java.util.Arrays;

public class QuickSortDetails {
    public static void main(String[] args) {
        int [] array = new int[] {0,3,4,1,5,9};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] arr, int from, int to) { // O(nlogn) // O(n^2)
        if (from < to) {
            int divideIndex = partition(arr, from, to);
//            System.out.print("index = "+divideIndex);
//            System.out.println(" element = "+arr[divideIndex]);
//            System.out.println(Arrays.toString(arr));
            quickSort(arr, from, divideIndex - 1); // right 0 4  5 10

            quickSort(arr, divideIndex, to); // left
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from + (to - from) / 2]; //+ (to - from) / 2
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {

                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
    private static void swap(int[] array, int index1, int index2) {
        if(index1==index2) return;
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }

    private static void printSortStep(int[] arr, int from, int to, int partitionIndex) {
        System.out.print(arrayToString(arr));
        System.out.print("\npartition at index: " + partitionIndex);
        System.out.print(", left: " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(", right: " + arrayToString(Arrays.copyOfRange(arr, partitionIndex, to + 1)) + "\n");
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
