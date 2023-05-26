package denis.week19;

public class LongestSubstring {

    public static void main(String[] args) {


longestNonRepeatingSubstring("abcabcbb");
longestNonRepeatingSubstring("bbbbb");
longestNonRepeatingSubstring("pwwkew");

    }

    static void longestNonRepeatingSubstring(String str) {

        String result = "";
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains(str.charAt(i)+"")) {
                result += (str.charAt(i));
            }
            else {
                result ="";
                continue;
            }

            if(max<result.length()) {
                max=result.length();
            }
        }
        System.out.println(max);

    }
}
