package almi.JavaCodingTasks.week4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateChars {

    /**
     * Write a function that will return the count of distinct case-insensitive alphabetic characters
     * and numeric digits that occur more than once in the input string.
     * The input string can be assumed to contain only alphabets (both uppercase and lowercase)
     * and numeric digits
     **/

    public static void main(String[] args) {

//        | Using Stream Operations (found online) |
        Map<String, Long> inputStr = "aabBcde"
                .toLowerCase()
                .chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

        //System.out.println(inputStr);

//======================================================================================================================

        String inputStr2 = "indivisibility";
        String inputStr3 = "1233455";
        String inputStr4 = "aA11";


        countDuplicates(inputStr2);
        countDuplicates(inputStr3);
        countDuplicates(inputStr4);


    }


    private static void countDuplicates(String str) {

        Map<Character, Integer> map = new HashMap<>();

        str.toLowerCase();
        char[] arr = str.toCharArray();


        for (char element : arr) {                  // loop of char array (constructed of String str)
            if (Character.isAlphabetic(element)) {  // boolean if char is letter
                if (map.containsKey(element)) {
                    map.put(element, map.get(element) + 1); // if map contains dup element add +1 to element

                } else {
                    map.put(element, 1);                  // if element is not contained in array it is added
                }
            }

            if (Character.isDigit(element)) {
                if (map.containsKey(element)) {
                    map.put(element, map.get(element) + 1); // same logic (checking Digit values)

                } else {
                    map.put(element, 1);
                }
            }
        }

        System.out.println(map);  // print map

    }


}

