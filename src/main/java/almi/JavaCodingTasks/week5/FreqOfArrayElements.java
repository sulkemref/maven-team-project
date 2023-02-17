package almi.JavaCodingTasks.week5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Write a function that takes a String array as parameter and returns a map object that
 * contains each element of array as key and their occurrence counts as value.
 * For calculating occurrence, array elements should be checked by regarding case sensitivity.
 * Order is not important.
 * EXAMPLE:
 * Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
 * Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}
 **/

public class FreqOfArrayElements {

    public static void main(String[] args) {

        String[] str = {"Apple", "Banana", "apple", "Cherry", "Apple", "Banana"};

        System.out.println(findFreq(str));

    }

    private static Map<String, Integer> findFreq(String[] str) {
        Map<String, Integer> map = new HashMap<>();

        for (String element : str) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);

            } else {
                map.put(element, 1);
            }

        }

        return map;
    }


}