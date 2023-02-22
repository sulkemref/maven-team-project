package kemal.mentor_tasks.week06;

import java.util.HashMap;
import java.util.Map;

public class Valid_Anagram {

    public static void main(String[] args) {

        System.out.println(stringToMap("cat").equals(stringToMap("rat")));

    }
    public static Map<Character,Integer> stringToMap(String s){
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0 ; i< s.length(); i++){
            Character key = s.charAt(i);
            if(map.containsKey(key)){
                int value = map.get(key);
                map.replace(key,++value);
            }
            map.putIfAbsent(key,1);
        }
        return map;
    }
}
