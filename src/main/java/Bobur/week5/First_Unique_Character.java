package Bobur.week5;

public class First_Unique_Character {
    public static void main(String[] args) {
        String s = "success";
        char result = ' ';
        boolean isRepeated = false;


        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            isRepeated = false;

            for (int j = 0; j < s.length(); j++) {
                if (i != j && currentChar == s.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                result = currentChar;
                break;
            }
        }
        System.out.println(result);  // Output: u
        System.out.println("------------------");
        for (int i = 0; i < s.length()-1; i++) {
            for (int j =i+1; j < s.length()-1; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.print(s.charAt(i));
                }
            }
        }
















        }
    }




