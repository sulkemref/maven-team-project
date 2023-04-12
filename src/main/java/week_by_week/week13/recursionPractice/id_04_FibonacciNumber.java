package week_by_week.week13.recursionPractice;

import java.util.Arrays;

/*
509. FibonacciNumber Number
easy
https://leetcode.com/problems/fibonacci-number/
Write a program to print Fibonacci series of n terms where n is declared by user :  0, 1, 1, 2, 3, 5, 8, 13, 21, 34,......
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
Example 1:
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
https://leetcode.com/problems/fibonacci-number/
 */
public class id_04_FibonacciNumber {
    static int count = 0;
    static int count5 = 0;
    static int count1 = 0;

    public static void main(String[] args) {
        int termsNumber = 6;
        System.out.println("onlyWithArray(termsNumber) = " + Arrays.toString(withArray(termsNumber)));
        System.out.println("withArrayAndRecursion(termsNumber) = " + Arrays.toString(withArrayAndRecursion(termsNumber)));
        System.out.println("iteration : " + fibIteration(termsNumber));
    }

    // recursion : clean code
    // time complexity : O(2^n)
    static int recursion(int n) {
        System.out.println("\tnormal recursion -> count = " + ++count1);
        if (n <= 1) {
            return n;
        }
        return recursion(n - 2) + recursion(n - 1);
    }

    // recursion for debugging
    // time complexity : O(2^n)
    static int recursionDebug(int n) {
        int n1 = -5, n2 = -5, result = -5;
        System.out.println("\tdebug recursion-> count : " + ++count + "  n : " + (n) + " n1 : " + n1 + " n2 : " + n2 + " result : " + result);
        if (n <= 1) {
            return n;
        }
        n1 = recursionDebug(n - 1);
        System.out.println("\t\tn1 : " + n1 + " n : " + (n - 1));
        n2 = recursionDebug(n - 2);
        System.out.println("\t\t\tn2 : " + n2 + " n : " + (n - 2));
        result = n1 + n2;
        count5++;
        return result;
    }

    // time complexity : O(n)
    public static int fibIteration(int n) {

        if (n < 2) {
            return n;
        }

        int num0 = 0, num1 = 1;
        int temp = 0;

        for (int i = 2; i <= n; i++) {
            temp = num0 + num1;
            num0 = num1;
            num1 = temp;
        }
        return temp;
    }

    // Tabulation
    public static int[] withArray(int n) {
        int[] result = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                result[i] = i;
            } else {
                result[i] = result[i - 1] + result[i - 2];
            }
        }
        return result;
    }

    public static int[] withArrayAndRecursion(int n) {
        int[] result = new int[n + 1];
       helper(n, result);
       return result;
    }

    static int helper(int n, int[] dp){
        if (n <2) {
            return dp[n] = n;
        }

        if (dp[n] != 0){
            return dp[n];
        }
        int n1 = helper(n-2, dp);
        int n2 = helper(n-1, dp);
        dp[n] = n1 + n2;
        return n1 + n2;
    }
}