package week_by_week.week08;

import java.util.Arrays;

public class MoveZerosToEnd {
    /*
    Move Zeros To End in place
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]

Example 2:
Input: nums = [0]
Output: [0]

Constraints:
•	1 <= nums.length <= 104
•	-2^31 <= nums[i] <= 2^31 - 1

Follow up: Could you minimize the total number of operations done?

Please, test your solution here: https://leetcode.com/problems/move-zeroes/
     */

    public static void main(String[] args) {
//        int[] arr = {0, 1, 0, 2, 0, 3, 7};
//        int[] arr = {5, 1, 0, 2, 0, 3, 7};
//        int[] arr = {0,1};
//        int[] arr = {1,0};
        int[] arr = {1, 0, 1};
//        int[] arr = {2, 1};
        System.out.println(Arrays.toString(arr));
        oneLoopTwoIf(arr);
        System.out.println(Arrays.toString(arr));

    }

    // TC : O (n) SC : O (1)    two pointer
    static void oneLoopOneIf(int[] nums) {
        if (nums.length < 2) return;
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {      // we don't care if slow is zero or not, we may have unnecessary swap operations
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
    }

    // Follow up: Could you minimize the total number of operations done?

    // TC : O (n) SC : O (1)   two pointer
    static void oneLoopTwoIf(int[] nums) {
        if (nums.length < 2) return;
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                if (nums[slow] == 0) {
                    int temp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = temp;
                }
                slow++;
            }
        }
    }


    // other solutions

    // TC : O (n) SC : O (1)
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int index = 0;
        for(int num : nums) {
            if(num != 0) {
                nums[index] = num;
                index++;
            }
        }
        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    // TC : O (n) SC : O (1)
    static void moveZerosToEnd(int[] nums) {
        if (nums.length < 2) return;
        int fast = 0, slow = 0;

        while (fast < nums.length - 1) {
            if (nums[slow] != 0) {
                slow++;
            }
            if (fast <= slow || nums[fast] == 0) {
                fast++;
            }
            if (nums[slow] == 0 && nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }
        }
    }

    // TC : O (n) SC : O (1)
    static void moveZerosToEnd2(int[] nums) {
        if (nums.length < 2) return;
        int fast = 1, slow = 0;

        while (slow < nums.length && fast < nums.length) {
            while (slow < nums.length && nums[slow] != 0) {
                slow++;
            }
            if (fast <= slow) fast = slow + 1;
            while (fast < nums.length && nums[fast] == 0) {
                fast++;
            }
            if (fast < nums.length && nums[fast] != 0) {
                nums[slow] = nums[fast];
                nums[fast] = 0;
            }
        }
    }

}
