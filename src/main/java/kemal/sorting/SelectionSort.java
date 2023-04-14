package kemal.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) { //time O(n^2) space O(1)
        int[] array = new int[]{64, 16, 73, 41, 16, 53, 16, 24, 57, 42, 16, 55, 36};
        for(int i = 0; i < array.length;i++){
            System.out.println(Arrays.toString(array));
            int minIndex = minElementFromTo(array,i);
            swap(array,i,minIndex);
        }
    }

    private static int minElementFromTo(int[] arr,int from){
        int resultIndex = from;
        int minElement = arr[from];

        for(int i = from; i < arr.length; i++){
            if(minElement>arr[i]){
                minElement=arr[i];
                resultIndex=i;
            }
        }
        return resultIndex;
    }

    private static void swap (int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }



//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array));
//            int minIndex = min(array, i, array.length);
//
//            int tmp = array[i];
//            array[i] = array[minIndex];
//            array[minIndex] = tmp;
//        }
//
//        System.out.println(Arrays.toString(array));
//        System.out.println("min value index: " + min(array, 0, array.length));
//    }

//    private static int min(int[] array, int start, int end) {
//        int minIndex = start;
//        int minValue = array[start];
//        for (int i = start + 1; i < end; i++) {
//            if (array[i] < minValue) {
//                minValue = array[i];
//                minIndex = i;
//            }
//        }
//        return minIndex;
//    }

}