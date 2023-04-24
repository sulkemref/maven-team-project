package kemal.mentor_tasks.week15;

public class Climbing_Stairs {

    //https://leetcode.com/problems/climbing-stairs/submissions/939163402/

    public int climbStairsRec(int n) { //Time O(n) Space O(1) SLOW Time Limit Exceeded (LeetCode) test:45
        if(n==3) return 3;
        if(n==2) return 2;
        if(n==1) return 1;
        return climbStairsRec(n-1)+climbStairsRec(n-2);
    }

    public int climbStairsWhile(int n) { //Time O(n) Space O(1)
        if(n==3) return 3;
        if(n==2) return 2;
        if(n==1) return 1;
        int result=0;
        int f1=3;
        int f0=2;
        while(n>3){
            result = f0+f1;
            f0=f1;
            f1=result;
            n--;
        }
        return result;
    }

}
