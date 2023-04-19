package kemal.mentor_tasks.week09;
/*
Question-1 Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World" Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = " fly me to the moon " Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy" Output: 6
Explanation: The last word is "joyboy" with length 6.
Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
Please, test your solution here: https://leetcode.com/problems/length-of-last-word/
 */
public class Length_of_Last_Word {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord2("Hello World"));
        System.out.println(lengthOfLastWord2(" fly me to the moon "));
        System.out.println(lengthOfLastWord2("luffy is still joyboy       "));
        System.out.println(lengthOfLastWord2("a         "));


    }
    private static int lengthOfLastWord(String s){ // space O(n) time O(n)
        return s.split(" ")[s.split(" ").length-1].length(); // space O(n) + O(n) time O(n) + O(n)
    }

    private static int lengthOfLastWord2(String s){ // space O(1) time O(n)
        int result = 0;
        int index = s.length()-1;
        for (int i = index; i>=0; i--){ // time O(n)
            if(s.charAt(i)!=' ') {
                index = i;
                break;
            }
        }
        for (int i  = index; i>=0; i--){ // time O(n)
            if (s.charAt(i)==' ')
                break;
            result++;
        }
        return result; // time O(n) + O(n) = O(n)
    }
}
