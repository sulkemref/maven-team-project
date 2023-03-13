package almi.JavaCodingTasks.week9;
/** Given a string s consisting of words and spaces, return the length of the last word in the string.
 A word is a maximal substring consisting of non-space characters only. **/
public class LengthOfLastWord {

    public static void main(String[] args) {


        String s = "Hello World";
        String s2 = " fly me to the moon ";
        String s3 =  "luffy is still joyboy";

        lastWordLength(s);
        lastWordLength(s2);
        lastWordLength(s3);


    }


    private static int lastWordLength(String s){

        s = s.strip();                        // removes whitespaces from beginning/end of String
        int n = s.lastIndexOf(" ");
        int wordCount = 0;

        for (int i = n; n < s.length()-1 ; n++) {  // loop beginning from the second word
            wordCount++;
        }

        System.out.println(wordCount);
        return wordCount;
    }

}
