package kemal.mentor_tasks.week08;

import java.util.Arrays;

public class Move_Zeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

    }

    private static void moveZeroes(int[] nums) { // space O(1) time O(n)
        int nonZeroIndexes = 0;

        for(int i  = 0; i< nums.length; i++){
            if(nums[i]!=0){
                nums[nonZeroIndexes++]=nums[i];
            }
        }

        for(int i = nonZeroIndexes; i<nums.length;i++){
            nums[i]=0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
