package kemal.mentor_tasks.week05;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_Unique_Character {
    public static void main(String[] args) {

        System.out.println(firstUniqueCharacter("Sucsecc"));

    }
    public static String firstUniqueCharacter(String str){
        if(str.isEmpty()||str.isBlank()){
            throw new IllegalArgumentException();
        }
        if(str.length()==1){
            return str;
        }
        str=str.toLowerCase();
        Map<String,Integer> map = new LinkedHashMap<>();
        String result = "";

        for (String each : str.split("")) {
            map.putIfAbsent(each,0);
            map.replace(each,map.get(each)+1);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue()==1){
                result = stringIntegerEntry.getKey();
                break;
            }
        }
        return result;
    }
}
