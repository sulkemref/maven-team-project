package denis.week4;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {

    public static void main(String[] args) {

        String[] str = {"Apple", "Banana", "apple", "Cherry", "Apple"};
        System.out.println(checkFrequencyOfArray(str));

    }

    public static Map<String, Integer> checkFrequencyOfArray (String [] str) {
        Map<String,Integer> result = new HashMap<>();


        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            result.put(str[i],count);
        }
        return result;

    }

    }

