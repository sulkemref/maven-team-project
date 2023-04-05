package denis.week9;

import java.util.*;

public class AnimalsTwoByTwo {

    public static void main(String[] args) {

        //List<String> animalList = new ArrayList<>(Arrays.asList("goat"));
        //List<String> animalList = new ArrayList<>(Arrays.asList("dog","goat","dog"));
        //List <String> animalList = new ArrayList<>(Arrays.asList("dog","cat","dog","cat","beaver","cat"));
        List<String> animalList = new ArrayList<>(Arrays.asList
                ("goat","goat","rabbit","rabbit","rabbit","duck","horse","horse","swan"));
        System.out.println(testAnimals(animalList));
    }

    public static Map<String, Integer> testAnimals (List<String> animalList) {

        Map<String, Integer> resultMap = new HashMap<>();

        for (int i = 0; i <animalList.size(); i++) {
            if (animalList.indexOf(animalList.get(i))!=
                    animalList.lastIndexOf(animalList.get(i))) {
                resultMap.put(animalList.get(i),2);
            }

        }
        return resultMap;
    }
}
