package almi.JavaCodingTasks;

import java.util.List;
import java.util.stream.Collectors;

public class ScratchClass {

    public static void main(String[] args) {




    }

    public static List<Integer> twoSum(List<Integer> array, final int target){
        final int n = target;

        var sortedArray = array
                .stream()
                .sorted()
                .filter(integer -> integer <= n)
                .collect(Collectors.toList());

        if (sortedArray.size() == 2) {
            return sortedArray;
        }
//        else {
//            for (int i = 0; i < sortedArray.size(); i++) {
//                System.out.println(target - array.get(i));
//            }
//
//        }



        return sortedArray;
    }
}
