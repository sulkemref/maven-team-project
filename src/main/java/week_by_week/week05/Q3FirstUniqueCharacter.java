package week_by_week.week05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a function that returns the first non-repeated character from a string.
 * If all characters are repeated return a space character.
 * EXAMPLE:
 * Input: "success" output: u
 * Explanation: u and e are non-repeated, u is the first non-repeated character
 */
public class Q3FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(solutionWithStream("success"));
        System.out.println(solutionWithStream("successue") == ' ');
        System.out.println(solutionWithStream(""));
        System.out.println(solutionWithStream(null));
    }

    public static char solutionWithFor(String str) {
        if (str == null) throw new IllegalArgumentException("Input should not be null");
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0; // keeps frequency of each character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) { // checks if current character’s frequency is 1
                return str.charAt(i); //returns the character whose frequency is 1, no need to check rest
            }
        }
        return ' '; // if the returns statement above not executed, execution reaches this line. That means there is no unique character.
    }

    public static char solutionWithMap(String str) {
        if (str == null) throw new IllegalArgumentException("Input should not be null");
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return ' ';
    }

    public static char solutionWithStream(String str) {
        if (str == null) throw new IllegalArgumentException("Input should not be null");
        return str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                // Function.identity() same with s -> s
                .entrySet().stream()
                .filter(ch -> ch.getValue() == 1)
                .map(Map.Entry::getKey)     // same with .map(ch -> ch.getKey())
                .findFirst().orElse(' ');
    }

    // other solutions

    public static char solutionWithStream2(String str) {
        if (str == null) throw new IllegalArgumentException("Input should not be null");
        // Since LinkedHashMap maintains insertion order, and since we are focusing on the FIRST unique char,
        // it is a good decision to implement LinkedHasMap for each character and their frequencies
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
            // this put method adds new character with default frequency as 1
            // and updates the frequency of the existing character which is the key of LinkedHashMap
        }
        Optional<Map.Entry<Character, Integer>> opt =
                frequencyMap.entrySet()//returns key&value pairs of the LinkedHashMap as Entry
                        .stream() // returns the entryset as stream object
                        .filter(p -> p.getValue() == 1)// filters the entries by their value (frequency)
                        .findFirst(); // returns the first entry whose frequency is 1 as Optional
        // (Remember; LinkedHashMap maintains insertion order!)
        if (opt.isPresent())    //checks if the opt object keeps a non-null entry
            return opt.get().getKey(); // opt.get() returns the kept entry object.
        // getKey() method returns the key (Character) of the entry object

        return ' '; // if the opt object does not keep an entry value, that means there is no unique character
    }

    public static char solutionWithStream3(String str) {
        if (str == null) throw new IllegalArgumentException("Input should not be null");
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        return frequencyMap.keySet().stream().filter(ch -> frequencyMap.get(ch) == 1).findFirst().orElse(' ');
    }


    public static char solutionWithStream4(String str) {
        if (str == null) throw new IllegalArgumentException("Input should not be null");
        Map<Character, Long> frequencyMap = str.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        // Function.identity() same with s -> s
        return frequencyMap.entrySet().stream().filter(ch -> ch.getValue() == 1)
                //  .map(ch -> ch.getKey())	        // same
                .map(Map.Entry::getKey)    // same
                .findFirst().orElse(' ');
    }
}
