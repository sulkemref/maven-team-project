package week_by_week.week09;

import java.util.*;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String str = "Hello World";
//        String str = "   fly me   to   the moon  ";
//        String str = "luffy is still joyboy";

        System.out.println(getTheLengthOfLastWordWithoutExtraSpace(str));
    }


    public static int getTheLengthOfLastWord(String s) {
        String[] sArray = s.trim().split(" ");
        return sArray[sArray.length - 1].length();
    }

    public static int getTheLengthOfLastWordStringBuilder(String s) {
        StringBuilder resultString = new StringBuilder();
        boolean bool;
        for (int i = s.length() - 1; i >= 0; i--) {
            char current = s.charAt(i);
            if (current!=' '){
                bool = true;
                resultString.append(current);
            }else{
                bool=false;
            }
            if (!bool && resultString.length()>0){
                break;
            }
        }

        return resultString.length();
    }

    public static int getTheLengthOfLastWordWithoutExtraSpace(String s) {
        boolean bool;
        int resultLength=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char current = s.charAt(i);
            if (current!=' '){
                bool = true;
                resultLength++;
            }else{
                bool=false;
            }
            if (!bool && resultLength>0){
                break;
            }
        }

        return resultLength;
    }

    public static int lengthOfLastWord(String str) {
        // trim the trailing spaces
        int i = str.length() - 1;
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }

        // compute the length of last word
        int length = 0;
        while (i >= 0 && str.charAt(i) != ' ') {
            i--;
            length++;
        }
        return length;
    }
    /* Above solution time&space complexity
    Time Complexity: O(N), where NN is the length of the input string.
    In the worst case, the input string might contain only a single word, which implies that we would need to iterate through the entire string to obtain the result.
    Space Complexity: O(1), only constant memory is consumed, regardless the input.
     */

    public static int lengthOfLastWord2(String str) {
        int p = str.length(), length = 0;
        while (p > 0) {
            p--;
            // we're in the middle of the last word
            if (str.charAt(p) != ' ') {
                length++;
            }
            // here is the end of last word
            else if (length > 0) {
                return length;
            }
        }
        return length;
    }
    /* Above solution time&space complexity
    Time Complexity: O(N), where NN is the length of the input string.
    This approach has the same time complexity as the previous approach. The only difference is that we combined two loops into one.
    Space Complexity: O(1), again a constant memory is consumed, regardless the input.
     */

    public static int lengthOfLastWordWithTrim(String s) {
        s = s.trim();  // trim the trailing spaces in the string
        return s.length() - s.lastIndexOf(" ") - 1;
    }
    /*
    Time Complexity: O(N), where N is the length of the input string.
    Since we use some built-in function from the String data type, we should look into the complexity of each built-in function that we used, in order to obtain the overall time complexity of our algorithm.
    It would be safe to assume the time complexity of the methods such as str.split() and String.lastIndexOf() to be O(N), since in the worst case we would need to scan the entire string for both methods.
    Space Complexity: O(N). Again, we should look into the built-in functions that we used in the algorithm.
     */
}
