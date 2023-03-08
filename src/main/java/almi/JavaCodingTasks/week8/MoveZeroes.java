package almi.JavaCodingTasks.week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array. **/
public class MoveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};


        movement(nums);


    }

//    Space - 0(1)
//    Time -  O(n)
    private static void movement(int[] nums){
        int notZero = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[notZero++] = nums[i];          // if number is not zero it is pushed to the front
                                                   //  (and the front is moved to the right ea time a # is pushed)
            }
        }

        for (int i = notZero; i < nums.length; i++) {  // starting from index [3] (3 non-zero elements on Array)
            nums[i] = 0;                               // the elements are = 0
        }

        System.out.println(Arrays.toString(nums));
    }


}