package week_by_week.week09;

import java.util.*;
import java.util.stream.Collectors;

public class TheAnimalsWentInTwoByTwo {

    public static void main(String[] args) {

//        String[] animals = {"goat"};
//        String[] animals = {"dog", "goat", "dog"};
//        String[] animals = {"dog", "cat", "dog", "cat", "beaver", "cat"};
        String[] animals = {"goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"};

        System.out.println(giveMePairAnimals(animals));
    }


    public static Map<String, Integer> giveMePairAnimals(String[] animals) {
        Map<String, Integer> animalMap = new HashMap<>();
        for (String animal : animals) {
            if (animalMap.containsKey(animal)) {
                if (!(animalMap.get(animal) >= 2)) {
                    animalMap.replace(animal, animalMap.getOrDefault(animal, 0) + 1);
                }
            } else {
                animalMap.put(animal, 1);
            }
        }

        return animalMap.entrySet().stream().filter(entry -> entry.getValue() == 2).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue
        ));
    }

    static ArrayList<String> getPairs3(List<String> animals) {
        ArrayList<String> result = new ArrayList<>();
        Collections.sort(animals);
        for (int i = 0; i < animals.size()-1; i++) {
            String str = animals.get(i);
            if (!result.contains(str) && str.equals(animals.get(i + 1))) {
                result.add(str);
            }
        }
        return result;
    }

    static Map<String, Integer> getPairs(List<String> animals) {
        Map<String, Integer> pairs = new HashMap<>();
        for (String animal : animals) {
            int num = pairs.getOrDefault(animal, 0);
            if (num < 2) {
                pairs.put(animal, ++num);
            }
        }
        pairs.entrySet().removeIf(e -> e.getValue() == 1);
        return pairs;
    }

}
