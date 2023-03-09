package kemal.mentor_tasks.week09;

import java.util.*;

/*
Question-2 The Animals Went in Two by Two
A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs. We
are only interested in getting one pair of each animal, and not interested in any animals where there are
less than 2. They need to mate to repopulate the planet after all!
Write a function that takes a list of animals as a parameter, which you need to check to see which animals
there are at least two of, and then return a Map<String, Integer> that contains the name of the animal
along with the fact that there are 2 of them to bring onto the ark.
Examples:
Input: []
Output: {}
Input: ['goat']
Output: {}
Input : ["dog", "goat", "dog"]
Output: {dog=2}
Input : ["dog", "cat", "dog", "cat", "beaver", "cat"]
Output: {cat=2, dog=2}
Input: ["goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"]
Output: {horse=2, rabbit=2, goat=2}
 */
public class The_Animals_Went_in_Two_by_Two {


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(List.of("goat"));
        List<String> list2 = new ArrayList<>(List.of("dog", "goat", "dog"));
        List<String> list3 = new ArrayList<>(List.of("goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan"));


        System.out.println(animalPairs(list1));
        System.out.println(animalPairs(list2));
        System.out.println(animalPairs(list3));
    }
    private static Map<String, Integer> animalPairs(List<String> list){ // space O(1) time O(n)
        Map<String, Integer> map = new HashMap<>();

        for (String each : list) {
            if(map.containsKey(each)){
                map.replace(each,2);
            }else {
                map.put(each,1);
            }
        }
        map.entrySet().removeIf(p -> p.getValue()==1);
        return map;
    }


}
