package kemal;

public class StringPractice {

    public static void main(String[] args) {

        String p = "Practice";

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < p.length(); i++) {
            str.append(p.charAt(i));
        }

    }
}
