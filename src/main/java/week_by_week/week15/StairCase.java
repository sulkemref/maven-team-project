package week_by_week.week15;

public class StairCase {

    public static void main(String[] args) {


    }


    /**
     * The  recursive solution has an exponential time complexity of O(2^n), because it generates a binary tree of subproblems with a depth of n. Each node in the tree represents a call to the function f(n), and there are 2^n nodes in the tree. Therefore, the total number of function calls is O(2^n).
     *
     * The space complexity of the recursive solution is O(n), because it uses a call stack to store the intermediate results of the function calls. The maximum size of the call stack is n, when the recursion reaches the base case. Therefore, the total space used by the recursive solution is O(n).
     * @param n
     * @return int
     */
    public static int staircaseRecursion(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        return staircaseRecursion(n - 1) + staircaseRecursion(n - 2);
    }

    /**
     * The dynamic programming solution has a linear time complexity of O(n), because it iterates from 3 to n and updates the array with the formula f(n) = f(n-1) + f(n-2). Each iteration takes constant time, so the total time taken by the dynamic programming solution is O(n).
     *
     * The space complexity of the dynamic programming solution is O(1), because it uses a fixed-size array of size 3 to store the intermediate results of the function calls. The array is updated in a circular fashion, so it only needs to store the last three values of f(n). Therefore, the total space used by the dynamic programming solution is O(1).
     * @param n
     * @return int
     */
    public static int staircase(int n) {
        // initialize the array with base cases
        int[] result = new int[3];
        result[1] = 1;
        result[2] = 2;
        // iterate from 3 to n
        for (int i = 3; i <= n; i++) {
            // update the array with the formula
            result[i % 3] = result[(i - 1) % 3] + result[(i - 2) % 3];
        }
        // return the final answer
        return result[n % 3];
    }
}
