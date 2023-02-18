package Bobur.week5;

import java.util.*;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {

        String[] arr = {"Apple", "Banana", "apple", "Cherry", "Apple"};
        List<String> list = Arrays.asList(arr);
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            int frequency = Collections.frequency(list, item);
            frequencyMap.put(item, frequency);
        }

        System.out.println(frequencyMap);



    }
}
