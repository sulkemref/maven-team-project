package almi.JavaCodingTasks.week5;

public class FirstUniqueChar {

    /**
     * Write a function that returns the first non-repeated character from a string.
     * If all characters are repeated return a space character.
     * EXAMPLE:
     * Input: "success" output: u
     **/

    public static void main(String[] args) {
//                      0123456
        String input = "success";
        firstUniqueChar(input);
//        -> u

        String input2 = "aabbcccddeefe";
        firstUniqueChar(input2);
//        -> f

        String input3 = "aaaaa";
        firstUniqueChar(input3);
//        ->

    }


    private static void firstUniqueChar(String str) {

        int dupCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                break;


            } else {
                dupCount++;
            }

            if (str.length() == dupCount)
                System.out.println(" ");


        }


    }
}

//    private static void firstUniqueChar(String str) {
//
//
//        for (int i = 0; i < str.length(); i++) {
//
//            var ch = str.charAt(i);
//
//            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
//                System.out.println(ch);
//                break;
//            }
//
//
//        }
//
//
//    }