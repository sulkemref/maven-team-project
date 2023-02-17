package almi.JavaCodingTasks.week4;

public class UppercasingString {


    public static void main(String[] args) {


        String nonCased = "How can mirrors be real if our eyes aren't real";


        jadenCasedStrings(nonCased);


    }

    private static void jadenCasedStrings(String str) {

       String[] str2 = str.split(" ");   // splits the string by ea space (each word becomes element of String[])
       String upperCaseWord = " ";

       for (String each : str2){               // for loop iterating each individual word

           String firstLetterOfWord = each.substring(0,1);  // isolate the fist letter of each word
           String restOfTheWord = each.substring(1);
           upperCaseWord += firstLetterOfWord.toUpperCase() + restOfTheWord+ " "; // combine upperCase(first letter) w/ the rest of the word
       }

        System.out.println(upperCaseWord);

    }

    }