package almi.JavaCodingTasks.week6;

import java.util.Arrays;

/**Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 typically using all the original letters exactly once.**/

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "DOG";
        String t ="GOD";

        anagram(s,t);


    }


    public static void anagram(String s, String t){

        char[] sArray = t.toLowerCase().toCharArray();
        char[] tArray = s.toLowerCase().toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if (Arrays.equals(sArray, tArray)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }


}