package kemal.mentor_tasks.week13;

public class Happy_Number {

//    https://leetcode.com/problems/happy-number/

    public boolean isHappy(int n) { //O(logn) time and space
        if(n==1||n==7)
            return true; //1,7
        if(n<10)
            return false;
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2); //12 + 92 = 82
            n=n/10; //
        }
        return isHappy(sum);
    }

}
