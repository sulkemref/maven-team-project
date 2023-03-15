package Bobur.week09;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Two_by_Two {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan");
        Map<String, Integer> map = new HashMap<>();
        for (String element : a) {
            if (map.containsKey(element)) {
                // If the element is already in the map, increment its count by 1
                map.put(element, map.get(element) + 1);
            } else {
                // If the element is not in the map, add it with a count of 1
                map.put(element, 1);
            }
        }

        System.out.println(map);
    }
}
