package kemal.mentor_tasks.week05;

import java.util.NoSuchElementException;

public class Find_Max {

    public static void main(String[] args) {

        int[] array = {6, 8, 3, 5, 1, 9};

        System.out.println(maxElement(array));

    }
    public static int maxElement(int[] arr){
        if(arr.length<1){
            throw new NoSuchElementException();
        }

        int maxElement = arr[0];
        for (int each : arr) {
            maxElement=(each>maxElement)?each:maxElement;
        }
        return maxElement;
    }
}
