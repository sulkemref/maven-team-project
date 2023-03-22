package denis.week10;

public class ColumnNumber {

    public static void main(String[] args) {

        String str = "ZY";
        char[] charArray = str.toCharArray();

        int result = 0;
        for (char ch : charArray) {
            result = result * 26 + (ch - 64);
        }
        System.out.println(result);
    }
}
