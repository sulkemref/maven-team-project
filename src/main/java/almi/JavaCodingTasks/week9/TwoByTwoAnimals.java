package almi.JavaCodingTasks.week9;

import java.util.*;
import java.util.stream.Collectors;

/** A great flood has hit the land, and just as in Biblical times we need to get the animals to the ark in pairs. We
 are only interested in getting one pair of each animal, and not interested in any animals where there are
 less than 2. They need to mate to repopulate the planet after all!
 Write a function that takes a list of animals as a parameter, which you need to check to see which animals
 there are at least two of, and then return a Map<String, Integer> that contains the name of the animal
 along with the fact that there are 2 of them to bring onto the ark.
 **/
public class TwoByTwoAnimals {

    public static void main(String[] args) {

        List<String> animals = Arrays.asList( "dog", "goat", "dog" );
        List<String> animals2 = Arrays.asList( "dog", "cat", "dog", "cat", "beaver", "cat" );
        List<String> animals3 = Arrays.asList( "goat", "goat", "rabbit", "rabbit", "rabbit", "duck", "horse", "horse", "swan" );



        System.out.println(twoBy2(animals));
        System.out.println(twoBy2(animals2));
        System.out.println(twoBy2(animals3));

    }

    public static Map<String, Integer> twoBy2(List<String> animals){


            Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < animals.size(); i++) {
            if (map.containsKey(animals.get(i))){
                map.replace(animals.get(i), 2);
            }else {
                map.put(animals.get(i), 1);
            }
        }
            map.entrySet().removeIf(p-> p.getValue()==1);


        return map;
    }



}
