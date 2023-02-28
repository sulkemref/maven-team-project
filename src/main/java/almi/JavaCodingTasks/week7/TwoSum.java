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



        int[] array22 = twoSum(array, 8);

        System.out.println(Arrays.toString(array22));



    }

    public static int[] twoSum(int[] array, final int target){

        var sortedArray = Arrays.stream(array).sorted();

        int[] newArray = new int[2];

            for (int i = 0; i < array.length; i++) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[i] + array[j] == target){
                       newArray[0] = array[i];
                       newArray[1] = array[j];
                    }
                }
            }

            return newArray;
        }



    }


