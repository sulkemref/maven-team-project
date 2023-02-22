package week_by_week.week03.algo03;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingVowel {
    public static void main(String[] args) {

        System.out.println(getFirstNonRepeatingVowelBruteForce("google"));
        System.out.println(getFirstNonRepeatingVowelBruteForce("integer"));
        System.out.println(getFirstNonRepeatingVowelBruteForce("approximately"));
        System.out.println(getFirstNonRepeatingVowelMap("approximately"));
    }


    public static int getFirstNonRepeatingVowelBruteForce(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);

            if (currentCharacter == 'a' || currentCharacter == 'e'
                    || currentCharacter == 'i' || currentCharacter == 'o'
                    || currentCharacter == 'u') {
                int vowelCount = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (currentCharacter == input.charAt(j)) {
                        vowelCount++;
                    }
                }
                if (vowelCount == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int getFirstNonRepeatingVowelMap(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            if (currentCharacter == 'a' || currentCharacter == 'e'
                    || currentCharacter == 'i' || currentCharacter == 'o'
                    || currentCharacter == 'u') {
                if (!map.containsKey(currentCharacter)) {
                    map.put(currentCharacter, i);
                } else {
                    map.put(currentCharacter, -5);
                }
            }
        }

        if (!map.isEmpty()) {
            for (Map.Entry<Character, Integer> e : map.entrySet()) {
                if (e.getValue() != -5) {
                    return e.getValue();
                }
            }
        }
        return -1;
    }

}
