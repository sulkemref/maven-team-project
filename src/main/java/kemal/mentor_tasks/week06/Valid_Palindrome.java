package kemal.mentor_tasks.week06;

public class Valid_Palindrome {

    public static void main(String[] args) {


        System.out.println(isPalindrome("amanaplanacanalpanama"));

        String s = "A man, a plan, a canal: Panama";

        String newS = "";

        for(int i = 0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newS+=s.charAt(i);
            }
        }

        System.out.println(newS);

    }

    public static boolean isPalindromeSimple(String s){

        String newS = "";

        for(int i = 0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newS+= ""+s.charAt(i);
            }
        }

        int halfLength = s.length()/2;

        for(int i = 0 , j = newS.length()-1; i<=halfLength; i++, j--){
            if(newS.charAt(i)!=newS.charAt(j))
                return false;
        }

        return true;
    }
    public static boolean isPalindrome(String s) {

        String newS = "";

        for(int i = 0; i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newS+= ""+s.charAt(i);
            }
        }

        return newS.equalsIgnoreCase(reverse(newS));

    }
    public static String reverse(String str) {
        String result = ""; // to contain all the characters of the giving string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) { // i: index number of the give string starting from last index to index zero
            result += str.charAt(i);// to get each character of the string starting from last index to index zero
        }
        return result;
    }

}
