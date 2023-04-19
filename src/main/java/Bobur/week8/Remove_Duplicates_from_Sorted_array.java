package Bobur.week8;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_array {
    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, n)));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int i = 0, j = 1;
        while (j < n) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}