package week_by_week.week13.recursionPractice;

import java.util.LinkedList;

public class id_01_Sum {

    public static void main(String[] args) {
        // Use recursion to add all the numbers up to 5 starting from 1
        System.out.println("iteration : " + sumIteration(5));
        System.out.println("recursion : " + sum(5));
        System.out.println("recursion debug : " + sumDebug(5));
        System.out.println("stack - simple : " + sumStack(5));
        System.out.println("stack - detailed : " + sumStackDetailed(5));

        //  modified question : Use recursion to add all the numbers between 5 and 10.
        System.out.println(sum(1, 5));
        System.out.println(sumStart(1,5));

    }

    static int sumIteration(int k) {
        int sum = 0;
        for (int i = k; i > 0; i--) {
            sum += i;
        }
        return sum;
    }

    // recursion for debugging
    static int sumDebug(int k) {
        if (k <= 0) return 0;
        int result = 0;
        result = k + sumDebug(k - 1);
        return result;
    }

    // recursion : best practice (clean code)
    static int sum(int k) {
        if (k <= 0) return 0;
        return k + sum(k - 1);
    }

    // simplified simulation of recursion
    static int sumStack(int k) {
        if (k <= 0) return 0;
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = k; i > 0; i--) {
            stack.push(i);
        }
        int sum = 0;
        while (stack.peek() != null) {
            sum = sum + stack.pop();
        }
        return sum;
    }

    // detailed simulation of recursion
    static int sumStackDetailed(int k) {
        if (k <= 0) return 0;
        int sum = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(k);
        k--;
        boolean baseConditionReached = false;

        while (!stack.isEmpty()) {
            if (!baseConditionReached) {
                if (k <= 0) {           // base condition
                    baseConditionReached = true;
                    sum = 0;
                } else {                // continues recursion
                    stack.push(k);
                    k = k - 1;
                }
            }
            if (baseConditionReached) { // makes calculation
                sum = sum + stack.pop();
                k = k + 1;
            }
        }
        return sum;
    }

    /**
     * When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result.
     * When k becomes 0, the function just returns 0. When running, the program follows these steps:
     * <p>
     * 10 + sum(9)
     * 10 + ( 9 + sum(8) )
     * 10 + ( 9 + ( 8 + sum(7) ) )
     * ...
     * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
     * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
     * Since the function does not call itself when k is 0, the program stops there and returns the result.
     */

    static int sum(int start, int end) {
        int result = 0;
        if (end <= start) return end;
        result = end + sum(start, end - 1);
        return result;
    }

    static int sumStart(int start, int end) {
        int result = 0;
        if (end <= start) return end;
        result = start + sumStart(start + 1, end);
        return result;
    }

}