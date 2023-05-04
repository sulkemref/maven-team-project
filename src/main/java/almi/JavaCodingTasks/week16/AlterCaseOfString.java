package almi.JavaCodingTasks.week16;
/** Given a path of input file which includes sentence(s), write a program that reads alternates the case of every
 alphabetic character, starting with uppercase. Spaces and non-alphabetical characters should be added to the
 final output as is, i.e. they should not be taken into account when alternating between upper/lowercase.
 Input: Your program should read lines from file as a standard input. Each line contains a sentence. Assume all
 characters are ASCII.
 Output: For each sentence from standard input, return a string which contains a sentence in each line such that
 the first character is uppercase, the next character is lowercase and so on **/
public class AlterCaseOfString {


    public static void main(String[] args) {
        String s = "Hello World";

//        changeCase(s);

    }


    public static String changeCase(String str){
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i+=2) {
             str.charAt(i);
        }

        System.out.println(str);
        return str;
    }


}
