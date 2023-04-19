package denis.week9;

public class LengthOfLastWord {

    public static void main(String[] args) {

        //String word = "Hello World";
        String word = " fly me  to  the moon ";
        //String word = "luffy is still joyboy";

        String [] wordsArr = word.split(" ");

        String s = wordsArr[wordsArr.length - 1];
        s = s.trim();
        System.out.println(s.length());


    }
}
