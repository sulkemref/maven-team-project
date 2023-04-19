package Bobur.week8;

import java.util.Arrays;



public class Move_Zeroes {

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // prints [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // prints [0]
    }
        public static void moveZeroes(int[] nums) {
            int n = nums.length;
            int i = 0, j = 0;
            while (i < n) {

                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }

                i++;
            }

            while (j < n) {

                nums[j] = 0;

                j++;
            }
        }

    }
