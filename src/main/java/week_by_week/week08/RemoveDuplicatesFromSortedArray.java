package week_by_week.week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    /*
    26. Remove Duplicates from Sorted Array
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:
The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}

If all assertions pass, then your solution will be accepted.

Example 1:
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Example 2:
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

Constraints:
    1 <= nums.length <= 3 * 104
    -100 <= nums[i] <= 100
    nums is sorted in non-decreasing order.

https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */
    public static void main(String[] args) {
//        int[] nums = {1, 1, 2};     // 2
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // 5
        System.out.println(removeDuplicates(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // 5
        System.out.println(twoPointerForLoop(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // 5
        System.out.println(bruteForce(nums));

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // 5
        System.out.println(Arrays.toString(nums));

    }

    // TC : O (n) SC : O (n)
    public static int bruteForce(int[] nums) {
        if (nums.length < 2) return nums.length;
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        int i = 0;
        for (int each : nums) {
            if (list.get(i) != each){
                i++;
                list.add(each);
            }
        }
        for (int j = 0; j < list.size(); j++) {
            nums[j] = list.get(j);
        }
        return list.size();
//        int[] temp = Arrays.stream(nums).distinct().toArray();
//        for (int i = 0; i < temp.length; i++) {
//            nums[i] = temp[i];
//        }
//        nums = Arrays.copyOfRange(temp, 0, temp.length);      // not works since Java is pass-by-value
//        System.arraycopy(temp, 0, nums, 0, temp.length);
//        return temp.length;
    }

    // TC : O (n) SC : O (1)
    public static int twoPointerForLoop(int[] nums) {
        if (nums.length < 2) return nums.length;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return ++slow; // to find the length of result array
    }


    // other solutions

    // TC : O (n) SC : O (1)
    public static int twoPointerWhileLoop(int[] nums) {
        if (nums.length < 2) return nums.length;
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[slow] == nums[fast]) {
                fast++;
            } else {
                slow++;
                nums[slow] = nums[fast];
                fast++;
            }
        }
        return ++slow;
    }

    // TC : O (n) SC : O (1)
    public static int twoPointerWhileLoop2(int[] nums) {
        if (nums.length < 2) return nums.length;
        int slow = 0, fast = 1;
        while (fast < nums.length) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return ++slow;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return 1;

        int indexToBeUpdated = -1;
        boolean matchContinues = false;
        for (int i = 0, j =1 ; i < nums.length && j < nums.length; i++, j++) {
            if (nums[i] == nums[j]){//slow == fast
                if (indexToBeUpdated == -1){
                    indexToBeUpdated = j;
                }
                else if (!matchContinues && nums[indexToBeUpdated] == nums[i]){
                    matchContinues = true;
                    indexToBeUpdated = i;
                }
            }
            else if (indexToBeUpdated > -1){
                nums[indexToBeUpdated] = nums[j];
                indexToBeUpdated++;
            }
        }

        return indexToBeUpdated == -1 ? nums.length : indexToBeUpdated;
    }
}
