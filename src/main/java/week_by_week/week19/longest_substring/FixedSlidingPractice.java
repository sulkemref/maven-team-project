package week_by_week.week19.longest_substring;

import java.util.HashSet;
import java.util.Set;

public class FixedSlidingPractice {

    public static void main(String[] args) {

        String str = "abccdefgh";
        String str1 = "abcabcbb";

        int[] nums = {1, 4, 9, 3, 2, 0, 15, 3};

        System.out.println(findMaxOfKWithNestedLoop(nums, 3));
        System.out.println(findMaxOfKWithImproved(nums, 3));


    }

    /**
     * Time Complexity O(n*k) => O(n^2)
     * The outer loop iterates over each possible starting index of a subarray of length k, from 0 to n-k.
     * The inner loop then calculates the sum of the elements in the subarray starting from the current index,
     * and updates the maximum sum seen so far.
     * Note that this solution has a time complexity of O(nk), since for each of the n-k+1 possible subarrays,
     * we need to sum up k elements.
     *
     * @param nums
     * @param k
     * @return int value
     */
    public static int findMaxOfKWithNestedLoop(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    /**
     Time Complexity O(2*n) => O(n)
     The method initializes the maxSum variable to the smallest possible integer value and the currentSum variable to 0.
     It then iterates through the array using a sliding window of size k.
     For each window, the method adds the current element to the currentSum and checks if the window has reached size k.
     If so, it updates the maxSum with the maximum value between the current maxSum and the currentSum,
     and then removes the first element of the window from the currentSum by subtracting the element nums[i-k+1].
     Finally, the method returns the maxSum.
     * @param nums
     * @param k
     * @return int value
     */
    public static int findMaxOfKWithImproved(int[] nums, int k) {
        int n = nums.length;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        int max = currentSum;
        for (int i = k; i < n; i++) {
            currentSum -= nums[i - k];
            currentSum += nums[i];
            max=Math.max(max,currentSum);
        }
        return max;
    }


}
