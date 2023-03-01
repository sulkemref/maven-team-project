package almi.JavaCodingTasks.week6;

public class ValidPalindrome {



    public static boolean palindrome(String str){
        if (str == null || str.isBlank()){
            return true;
        }

        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i))){
                sb.append(str.charAt(i));
            }

        }

        int left = 0 , right = sb.length() -1 ;
        while (left < right){
            if (sb.charAt(left) == sb.charAt(right)) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }

}