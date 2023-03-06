package almi.JavaCodingTasks.week8;

import java.util.Arrays;

/** Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
 unique element appears only once. The relative order of the elements should be kept the same.
 Since it is impossible to change the length of the array in Java, you must instead have the result be placed in
 the first part of the array nums. More formally, if there are k elements after removing the duplicates, then
 the first k elements of nums should hold the final result. It does not matter what you leave beyond the first
 k elements.
 Return k after placing the final result in the first k slots of nums. **/
public class RemoveDups {


    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = {1,1,2};

        removeDuplicatesFromArray(nums2);


    }

    private static void removeDuplicatesFromArray(int[] nums) {
        int totalDupCount = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i-1] != nums[i]){
                nums[totalDupCount] = nums[i];
                totalDupCount++;
            }


        }
        System.out.println("K=" + totalDupCount + " " + Arrays.toString(nums) );
    }
}
