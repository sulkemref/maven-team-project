package week_by_week.week13.recursionPractice;

public class a1_Printing {
    public static void main(String[] args) {
        System.out.print("print Decreasing : ");
        printDecreasing(5);
        System.out.print("\nprint increasing : ");
        printIncreasing(5);
        System.out.print("\nprint decreasing then increasing : ");
        printDecreasingAndIncreasing(5);
    }


    /*
1. You are given a positive number n.
2. You are required to print the counting from n to 1.
3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.
     */

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static void printDecreasing(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    /*
    1. You are given a positive number n.
2. You are required to print the counting from 1 to n.
3. You are required to not use any loops. Complete the body of print Increasing function to achieve it.
Don't change the signature of the function.
     */

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static void printIncreasing(int n) {
        if (n < 1) return;
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    /*
1. You are given a positive number n.
2. You are required to print the counting from n to 1 and back to n again.
3. You are required to not use any loops. Complete the body of pdi function to achieve it. Don't change the signature of the function.
     */
    public static void printDecreasingAndIncreasing(int n) {
        if (n < 1) return;
        System.out.print(n + " ");
        printDecreasingAndIncreasing(n - 1);
        System.out.print(n + " ");
    }
}