package week_by_week.week13.recursionPractice;/*
https://leetcode.com/problems/fibonacci-number/
509. Fibonacci Number
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
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
 */

import java.util.LinkedList;

public class id_02_Factorial {

    public static void main(String[] args) {
        // find factorial of given number
        System.out.println("recursion = " + factorial(5));
        System.out.println("stack = " + withStack(5));
        System.out.println("iteration = " + factorialIteration(5));

    }

    static int factorial(int num) {
        if (num <= 1) return 1;
        return num * factorial(num - 1);
    }

    static int withStack(int num){
        if (num <= 1) return 1;
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = num; i > 0; i--) {
            stack.push(i);
        }
        int result = 1;
        while (stack.peek() != null){
            result = result * stack.pop();
        }
        return result;
    }

    static long factorialIteration(int num) {
        if (num <= 0) return 1;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}