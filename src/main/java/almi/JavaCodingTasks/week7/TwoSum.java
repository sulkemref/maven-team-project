package almi.JavaCodingTasks.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Given an array of integers nums and an integer target, return the two numbers such that they add
 up to target.

 Example:
 Input: nums = [16, 3, 11, 5, 15], target = 8
 Output: [3, 5]
 **/
public class TwoSum {

    public static void main(String[] args) {

        int[] array = {16, 3, 11, 5, 15};
        final int target = 8;    //   [3,5]
        final int target2 = 14; //    [3,11]
        final int target3 = 20;//     [5,15]


        int[] twoSumAnswers = twoSum(array, target);

        System.out.println(Arrays.toString(twoSumAnswers));



    }

    public static int[] twoSum(int[] array, final int target){

        int[] newArray = new int[2];  // new array with [2] indexes -> these 2 indexes will represent the ints needed to Sum == target


            for (int i = 0; i < array.length; i++) {        // iterating each index (elem) of -> 'i'
                for (int j = i+1; j < array.length; j++) { // iterating the next index to the right -> j
                    if (array[i] + array[j] == target){    // if 'i' & 'j' = target value ->
                       newArray[0] = array[i];             // new array with 'i' -> @ index [0]
                       newArray[1] = array[j];             // new array with 'j' -> @ index [1]
                    }
                }
            }

            return newArray;
        }



    }


