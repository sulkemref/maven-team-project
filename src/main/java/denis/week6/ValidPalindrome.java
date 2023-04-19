package denis.week6;

public class ValidPalindrome {

    public static void main(String[] args) {
        //String sentence = "A brown fox jumping over";
        //String sentence = "Was it a car or a cat I saw";
        String sentence = "Do geese see God?";
        System.out.println(isValidPalindrome(sentence));

    }

    public static boolean isValidPalindrome(String str) {

        str = str.toLowerCase().replace(" ", "");
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        boolean result = true;
        System.out.println(str);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                result = false;
                break;
            }
        }

        return result;

    }
}



