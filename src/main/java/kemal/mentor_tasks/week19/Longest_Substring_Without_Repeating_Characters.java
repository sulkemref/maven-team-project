package kemal.mentor_tasks.week19;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

//    https://leetcode.com/problems/longest-substring-without-repeating-characters/

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int startIndex = 0;

        for(int i = 0 ; i < s.length(); i++){
            Character each = s.charAt(i);
            while(set.contains(each)){
                Character toRemove = s.charAt(startIndex);
                set.remove(toRemove);
                startIndex++;
            }
            set.add(each);
            maxLength= Math.max(set.size(), maxLength);
        }
        return maxLength;
    }
}

