package kemal.mentor_tasks.week05;

import java.util.HashMap;
import java.util.Map;

public class Frequency_of_Array_Elements {

    public static void main(String[] args) {

        String[] array1 = {"Apple", "Banana", "apple", "Cherry", "Apple"};
        Integer[] array2 = {5,5,4,3,2,6,7,8};
        System.out.println(frequency(array1));
        System.out.println(frequency(array2));
    }
    public static <T> Map<T,Integer> frequency(T[] arr){
        if(arr.length==0){
           throw new RuntimeException();
        }
        Map<T,Integer> map = new HashMap<>();

        for (T each : arr) {
            map.putIfAbsent(each,0);
            map.replace(each,map.get(each)+1);
        }
        return map;
    }
}
