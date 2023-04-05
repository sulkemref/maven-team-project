package kemal.mentor_tasks.week04;

import java.util.*;
import java.util.function.Function;

public class
Count_Duplicated_Chars {

//    Count the number of Duplicated Chars
//    Write a function that will return the count of distinct case-insensitive alphabetic characters
//    and numeric digits that occur more than once in the input string.
//    The input string can be assumed to contain only alphabets (both uppercase and lowercase)
//    and numeric digits.
//            Example:
//            "abcde" -> 0 # no characters repeats more than once.
//            "aabbcde" -> 2 # 'a' and 'b'
//            "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
//            "indivisibility" -> 1 # 'i' occurs six times.
//            "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
//            "aA11" -> 2 # 'a' and '1'
//            "ABBA" -> 2 # 'A' and 'B' each occur twice.

    public static void main(String[] args) {

        Function<String, Integer> countDuplicatedChar = str -> {
            str = str.toLowerCase();
            int result = 0;
            Map<Character,Integer> map = new HashMap<>();

            for(int i = 0; i< str.length(); i++){
                Character each = str.charAt(i);

                if(map.containsKey(each)){
                    Integer value = map.get(each);
                    map.replace(each,++value);
                }else {
                    map.put(each,1);
                }
            }

            for (Integer value : map.values()) {
                result+=(value>1)?1:0;
            }

            return result;
        };

//        System.out.println(countDuplicatedChar.apply("abcde"));
//        System.out.println(countDuplicatedChar.apply("aabbcde"));
//        System.out.println(countDuplicatedChar.apply("aabBcde"));
//        System.out.println(countDuplicatedChar.apply("indivisibility"));
//        System.out.println(countDuplicatedChar.apply("Indivisibilities"));
//        System.out.println(countDuplicatedChar.apply("aA11"));
//        System.out.println(countDuplicatedChar.apply("ABBA"));

        System.out.println(countDub("abcde"));
        System.out.println(countDub("aabbcde"));
        System.out.println(countDub("aabBcde"));
        System.out.println(countDub("indivisibility"));
        System.out.println(countDub("Indivisibilities"));
        System.out.println(countDub("aA11"));
        System.out.println(countDub("ABBA"));


    }
    public static int countDub(String str){ // Indivisibilities
        str = str.toUpperCase();
        int result = 0;
        Map<Character,Integer> map = new HashMap<>(); // empty

        for(int i = 0; i< str.length(); i++){ // i = 3
            Character each = str.charAt(i); // each = I

            if(map.containsKey(each)){ //true
                Integer value = map.get(each); // value = 1
                map.replace(each, value + 1 ); //
            }else { // map = {I,2:N,1:D,1}
                map.put(each,1);
            }
        }

        for (Integer value : map.values()) { //map.values() { 2, 1, ,1 ,1 2, 1,1}
            if(value>1){
                result = result+1;
            }
            // result+=(value>1)?1:0;
        }

        return result;
    }
}
