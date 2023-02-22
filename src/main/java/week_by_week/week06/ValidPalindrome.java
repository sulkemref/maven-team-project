package week_by_week.week06;

public class ValidPalindrome {
    /*
    Valid Palindrome
    Determine whether a string is a palindrome, ignoring non-alphanumeric characters and case.
    Please, use two pointer strategy.
    (A string is said to be palindrome after converting all uppercase letters into lowercase letters and removing all non-alphanumeric it reads the same backward as forward. )

    Examples:
    Input: Do geese see God?            Output: True
    Input: Was it a car or a cat I saw? Output: True
    Input: A brown fox jumping over     Output: False
     */

    public static void main(String[] args) {
        System.out.println(stringAndForLoop("Do geese see God?"));      // true
        System.out.println(stringAndForLoop("Was it a car or a cat I saw?"));   // true
        System.out.println(stringAndForLoop("A man, a plan, a canal: Panama")); // true
        System.out.println(stringAndForLoop("A brown fox jumping over"));   // false
        System.out.println(stringAndForLoop(""));   // true
        System.out.println(stringAndForLoop("   "));   // true
        System.out.println(stringAndForLoop(null));
    }

    // time complexity : O(n)
    // two pointer
    static boolean twoPointerStrBuilder(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        str = str.toLowerCase();                // O(n)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {    // O(n)
            if (Character.isLetterOrDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        int left = 0, right = sb.length() - 1;
        while (left < right) {                          // O(n)
            if (sb.charAt(left) == sb.charAt(right)) {
                left++;
                right--;
            } else
                return false;
        }
        return true;
    }

    // time complexity : O(n)
    // two pointer
    static boolean twoPointerRegex(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else
                return false;
        }
        return true;
    }

    // brute force
    // O (n)
    public static boolean stringAndForLoop(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        str = str.toLowerCase();        // O (n)
        String filtered = "";
        String reverseStr = "";
        for (int i = 0; i < str.length(); i++) {    // O (n)
            char ch = str.charAt(i);
            if ( (ch >='a' && ch <= 'z') || (ch >='0' && ch <= '9')){
                filtered = filtered + ch;
                reverseStr = ch + reverseStr;
            }
        }

//        for (int i = filtered.length() - 1; i >= 0; i--) {
//            reverseStr += "" + filtered.charAt(i);
//        }
        return reverseStr.equals(filtered); // O (n)
    }

    public static boolean twoPointerRegexForLoop(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int strLength = str.length();
        for (int i = 0, j = strLength - 1; i < strLength / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean strBuilderReverseMethod(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return new StringBuilder(str).reverse().toString().equals(str);
    }

}

