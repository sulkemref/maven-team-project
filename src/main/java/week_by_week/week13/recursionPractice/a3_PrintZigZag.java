package week_by_week.week13.recursionPractice;

public class a3_PrintZigZag {
    /*
    1. Here are a few sets of inputs and outputs for your reference
Input1 -> 1
Output1 -> 1 1 1
Input2 -> 2
Output2 -> 2 1 1 1 2 1 1 1 2
Input2 -> 3
Output3 -> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
2. Figure out the pattern and complete the recursive function pzz to achieve the above for any positive number n.
     */
    public static void main(String[] args) {
        System.out.print("print(2) : ");
        print(2);
        System.out.print("\nprint(3) : ");
        print(3);
    }

    public static void print(int n){
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        print(n-1);
        System.out.print(n+ " ");
        print(n-1);
        System.out.print(n+ " ");
    }
}