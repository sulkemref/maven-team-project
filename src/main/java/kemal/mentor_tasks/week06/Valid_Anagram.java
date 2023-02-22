package kemal.mentor_tasks.week06;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("cat","rat"));

    }
    public static boolean isAnagram(String s, String t) {

        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();

        for(int i = 0 ; i< s.length(); i++){
            Character sKey = s.charAt(i);
            if(mapS.containsKey(sKey)){
                int value = mapS.get(sKey);
                mapS.replace(sKey,++value);
            }
            mapS.putIfAbsent(sKey,1);
        }

        for(int i = 0 ; i< t.length(); i++){
            Character tKey = t.charAt(i);
            if(mapT.containsKey(tKey)){
                int value = mapT.get(tKey);
                mapT.replace(tKey,++value);
            }
            mapT.putIfAbsent(tKey,1);
        }

        return mapS.equals(mapT);
    }
}
