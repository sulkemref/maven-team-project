package almi.JavaCodingTasks.week15;



/** Simba has a number of staircases in his house, and he likes to climb each staircase 1 or 2 steps at a time.
 It takes n steps to reach the top. In how many distinct ways can he climb to the top? **/
public class ClimbingStairs {

    public static void main(String[] args) {

        System.out.println(solution(10));



    }

    public static int solution(int n){

        if (n==0) return 0;
        if (n==1) return 1;
        if (n==2) return 2;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(c);
        return c;

//        return solution(n - 1) + solution(n - 2); <- Using recursion
    }


}
