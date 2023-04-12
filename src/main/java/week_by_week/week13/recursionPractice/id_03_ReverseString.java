package week_by_week.week13.recursionPractice;

import java.util.LinkedList;

public class id_03_ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hero"));
        System.out.println(withStack("hero"));
    }

    static String reverseString(String input) {
        if (input.equals("")) {
            return "";
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }

    static String withStack(String str){
        if (str.length() <= 1) return str;
        LinkedList<String> stack = new LinkedList<>();
        for (int i = str.length()-1; i >= 0; i--) {
            stack.push(str.charAt(i)+"");
        }
        String result = "";
        while (stack.peek() != null){
            result = stack.pop() + result;
        }
        return result;
    }
}