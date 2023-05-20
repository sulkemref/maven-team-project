package kemal.leetcode_general_practice;

import java.util.ArrayList;
import java.util.List;

public class Count_Binary_Substrings {

//    https://leetcode.com/problems/count-binary-substrings/description/

    private final static Count_Binary_Substrings obj = new Count_Binary_Substrings();

    public static void main(String[] args) {

        System.out.println(obj.countBinarySubstrings("00110011"));


    }


    public int countBinarySubstrings(String s) {
        if(s.length()<2){
            return 0;
        }

        int result=0;
        List<Integer> list = new ArrayList<>();

        int check = 1;

        for(int i = 1 ; i < s.length() ; i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                list.add(check);
                check = 1;
            } else {
                check++;
            }
        }

        list.add(check);


        for(int i = 1 ; i < list.size(); i++){
            result+=Math.min(list.get(i-1),list.get(i));
        }

        return result;
    }
}

