package week_by_week.week19.longest_substring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(withNestedLoop(s));
        System.out.println(withSet(s));
        System.out.println(withMap(s));

    }

    public static int withNestedLoop(String s) {

        int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            int len = 0;
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (set.contains(c)) {
                    break;
                }
                set.add(c);
                len++;
            }
            max = Math.max(max, len);
        }
        return max;
    }

    public static int withSet(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int max = 0;

        while (right < n) {
            char c = s.charAt(right);
            if (set.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }

    public static int withMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int left = 0;   // keep track of the starting index of the current non-repeating substring
        int max = 0;
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                // move the left pointer to the right side of the previous occurrence of that character.
                // By taking the maximum value, we ensure that the left pointer never moves backward,
                // as it should always point to the starting index of a valid non-repeating substring.
                left = Math.max(map.get(ch) + 1, left); // "abba" fails without Math.max
            }
            map.put(ch, right);
            max = Math.max(max, right - left + 1);  // current non-repeating length = right - left + 1
        }
        return max;
    }
}
