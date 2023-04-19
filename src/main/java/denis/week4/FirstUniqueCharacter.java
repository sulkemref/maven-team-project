package denis.week4;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        System.out.println(findFirstUniqueChar("success"));

    }
    public static char findFirstUniqueChar(String str) {
        char ch = ' ';
        boolean result = true;

        while (result) {
            for (int i = 0; i < str.length(); i++) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
                        count++;
                    }
                }
                if (count == 1) {
                    ch = str.charAt(i);
                    result=false;
                    break;
                }
            }
        return ch;
        }
        return ch;
    }
}
