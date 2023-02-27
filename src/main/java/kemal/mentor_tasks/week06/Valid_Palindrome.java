package kemal.mentor_tasks.week06;

public class Valid_Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("amanaplanacanalpanama"));

        System.out.println(isPalindromeSimple("amanaplanacanalpanama"));

    }

    public static boolean isPalindromeSimple(String s){

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int halfLength = s.length()/2;

        for(int i = 0 , j = s.length()-1; i<halfLength; i++, j--){
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }

        return true;
    }
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        return s.equalsIgnoreCase(reverse(s));

    }
    public static String reverse(String str) {
        String result = ""; // to contain all the characters of the giving string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) { // i: index number of the give string starting from last index to index zero
            result += str.charAt(i);// to get each character of the string starting from last index to index zero
        }
        return result;
    }
}
