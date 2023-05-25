package kemal.leetcode_general_practice;

import java.util.Arrays;

public class Permutation_in_String {

//    https://leetcode.com/problems/permutation-in-string/

    private final static Permutation_in_String obj = new Permutation_in_String();

    public static void main(String[] args) {

        String s1 = "adc", s2 = "dcda";

        System.out.println(obj.checkInclusion(s1,s2));



    }

    public boolean checkInclusion(String s1, String s2) {

        for(int i = 0 ; i <= s2.length()-s1.length();i++){
            if(s1.contains(s2.charAt(i)+"")) {
                if(checkPermutation(s1,s2.substring(i,i+s1.length())))
                    return true;
            }
        }
        return false;
    }

    private boolean checkPermutation(String str1 ,String str2){
        System.out.println(str1);
        System.out.println(str2);
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0 ; i< arr1.length ; i++){
            if(arr1[i]!=arr2[i])
                return false;
        }

        return true;
    }

}
