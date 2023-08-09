package kemal.mentor_tasks.week03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class First_Non_repeating_Vowel {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingVowel("googlee"));
        System.out.println(firstNonRepeatingVowel("goglee"));
        System.out.println(firstNonRepeatingVowel("google"));


        System.out.println(firstNonRepeatingVowelMap("googlee"));
        System.out.println(firstNonRepeatingVowelMap("goglee"));
        System.out.println(firstNonRepeatingVowelMap("google"));
    }

    /**Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and return its index.
     If it doesn't exist, return -1. Assume that all the characters of the String is lowercase.
            ( Do not use String class functions other than charAt() and length() )*/
    public static int firstNonRepeatingVowel(String str){
        str = str.toLowerCase();
        int resultIndex = -1;
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList( 'a', 'e', 'i', 'o', 'u'));

        for(int i = 0; i < str.length();i++){
            int count = 0;
            Character each = str.charAt(i);
            if( vowels.contains( each ) ){
                for(int j = i; j < str.length();j++){
                    count+=(each==str.charAt(j))?1:0;
                }
            }
            if(count==1){
                resultIndex=i;
                break;
            }else {
                vowels.remove(each);
            }
        }
        return resultIndex;
    }

    public static int firstNonRepeatingVowelMap(String str){
        str = str.toLowerCase();
        int resultIndex = -1;
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i< str.length(); i++){
            Character ch = str.charAt(i);
            if(!(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'))
                continue;
            if(map.containsKey(ch)){
                map.replace(ch,-1);
            }else {
                map.put(ch,i);
            }
        }

        for (Map.Entry<Character, Integer> eachEntry : map.entrySet()) {
            Integer eachValue = eachEntry.getValue();
            if(eachValue>=0){
                resultIndex=eachValue;
                break;
            }
        }
        return resultIndex;
    }
}