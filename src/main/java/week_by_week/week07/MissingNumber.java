package week_by_week.week07;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
  268. Missing Number (https://leetcode.com/problems/missing-number/)
  Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range
  that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

Constraints:

  n == nums.length
  1 <= n <= 104
  0 <= nums[i] <= n
  All the numbers of nums are unique.

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
   */
public class MissingNumber {
    public static void main(String[] args) {
        int[] ints = {9, 6, 4, 2, 3, 5, 7, 0, 1};
//        int[] ints = {3, 0, 1};
        System.out.println(twoPointer(ints));
    }

    //    TC: O (n log n) SC: O(1)
    static int withSorting(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }

// DEBUG THIS SOLUTION
//    Input: nums = [9,6,4,2,3,5,7,0,1]
//    after sorting = 0, 1, 2, 3, 4, 5, 6, 7, 9
//    Output: 8
    //    TC: O (n log n) SC: O(1)
    static int twoPointer(int[] nums) { //binary search
        Arrays.sort(nums);
        int left = 0, right = nums.length, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > mid) right = mid;//if the current value is bigger than middle index that means the missing number must be in the first half then make the right middle.
            else left = mid + 1;//otherwise make the left middle plus 1.
        }
        return left;
    }

//    Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
//    TC: O (n) SC: O(1)
    static int withStream(int[] nums) {
        int n = nums.length;
//        int expected = Stream.iterate(0, i -> i <= n, i -> i + 1).reduce(0, Integer::sum);
//        int expected = IntStream.iterate(0, i -> i <= n, i -> i + 1).sum();
        int expected = IntStream.rangeClosed(0, n).sum();
        int actual = Arrays.stream(nums).sum();
        return expected - actual;
    }

    //    TC: O (n) SC: O(1)
    //sum of n natural numbers = n*(n+1)/2
    static int withMath(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        return expected - actual;
    }

/*
Bit Manipulation
It is the process of applying logical operations on a sequence of bits, the smallest form of data in a computer,
to achieve a required result. Bit manipulation has constant time complexity and process in parallel, meaning it is very efficient on all systems.

Most programming languages will have you work with abstractions, like objects or variables, rather than the bits they represent.
However, direct bit manipulation is needed to improve performance and reduce error in certain situations.
Bit manipulation requires a strong knowledge of binary and binary conversion.

--------------

In Java, there are six bitwise operators:

    Bitwise AND (&): The bitwise AND operator sets each bit to 1 if and only if both bits are 1.

    Bitwise OR (|): The bitwise OR operator sets each bit to 1 if either of the two bits is 1.

    Bitwise XOR (^): The bitwise XOR (exclusive OR) operator sets each bit to 1 if only one of the two bits is 1.

    Bitwise Complement (~): The bitwise complement operator inverts all the bits of an integer, which means that each 0 is replaced by 1 and each 1 is replaced by 0.

    Signed Left Shift (<<): The signed left shift operator shifts the bits of the first operand to the left by the number of positions specified by the second operand. The leftmost bits are discarded, and the rightmost bits are filled with zeros.

    Signed Right Shift (>>): The signed right shift operator shifts the bits of the first operand to the right by the number of positions specified by the second operand. The rightmost bits are discarded, and the leftmost bits are filled with the sign bit (the sign bit is the most significant bit of a signed integer, which is 0 for positive numbers and 1 for negative numbers).

Note: Java also has an unsigned right shift operator (>>>), which shifts the bits to the right and fills the leftmost bits with zeros, regardless of the sign of the first operand.

-----------------

XOR Operator
    Concept :
XOR of zero and some bit returns that bit i.e. x^0 = x...
XOR of two same bits returns 0 i.e. x^x = 0...
And, x^y^x = (x^x)^y = 0^y = y...
XOR all bits together to find the unique number.

-If we use XOR operator between two same values, it will return zero.
-If one of the value is zero, and the other is non-zero, it returns the non-zero value.

XOR
X^X = 0
0^X = X

Let's see some rules:
0^A=A
A^A=0
A^B^A=B
(A^A^B) = (B^A^A) = (A^B^A) = B This shows that position doesn't matter.
Similarly , if we see , A^A^A.. with (even times)=0 and A^A^A.. with (odd times)=A

We apply the above observations :

Because, the elements with frequency=2 will result in 0. And then the only element with frequency=1 will generate the answer.

Our array is : {4,1,2,1,2}
4^1
4^1^2
4^1^2^1 ->[1^1=0]
4^2
4^2^2 -> [2^2=0]
4
So, the element which we got as left should be our answer, so the answer is '4'
 */
//    TC: O (n) SC: O(1)
    public int withXOR(int[] nums) { //xor
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ i;
            res = res ^ nums[i];
        }
        return res;
    }
}