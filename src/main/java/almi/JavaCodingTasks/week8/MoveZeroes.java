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


//      |HOW TO ADD 0s to the end of Array|
//        nums[nums.length-1]=0;

        for (int i = 0; i < nums.length; i++) {
            int zeroCount = 0;

            if (nums[i] == 0) {
                zeroCount++;
//                nums[nums.length-1] = 0;
            }
        }


    }

}