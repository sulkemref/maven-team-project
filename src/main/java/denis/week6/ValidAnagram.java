package denis.week6;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "integral";
        String t = "triangle";
        boolean result = true;

        char [] charsS = s.toLowerCase().toCharArray();
        Arrays.sort(charsS);
        char [] charsT = t.toLowerCase().toCharArray();
        Arrays.sort(charsT);

        s = String.valueOf(charsS);
        t = String.valueOf(charsT);

        System.out.println(s.equals(t));



        }

    }

