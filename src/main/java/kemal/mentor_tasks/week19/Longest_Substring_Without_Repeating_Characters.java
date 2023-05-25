package kemal.mentor_tasks.week19;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {

//    https://leetcode.com/problems/longest-substring-without-repeating-characters/

    public int lengthOfLongestSubstringSet(String s) { // time O(n) space O(n)

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

    public int lengthOfLongestSubstringStr(String s) { // time O(n) space O(1)

        int maxLength = 0;
        int startIndex = 0;

        for(int i = 0 ; i < s.length(); i++){
            while(s.substring(startIndex,i).contains(s.charAt(i)+"")){
                startIndex++;
            }
            maxLength= Math.max(1+i-startIndex, maxLength);
        }
        return maxLength;
    }
}

