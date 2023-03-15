package Bobur.week09;

import java.util.Arrays;

public class Length_of_Last_Word {
    public static void main(String[] args) {

        String str = " Hello World";
        String [] word=str.trim().split(" ");
        String lastWords=word[word.length-1];
        int lastWordLength=lastWords.length();
        System.out.println("Last word: " + lastWords);
        System.out.println("Last word length: " + lastWordLength);
    }
//    public int lengthOfLastWord(String s) {
//        String [] word=s.trim().split(" ");
//        String lastWords=word[word.length-1];
//        int lengthOfLastWord=lastWords.length();
//
//        return lengthOfLastWord;
//    }
}
