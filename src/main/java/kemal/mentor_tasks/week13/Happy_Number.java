package kemal.mentor_tasks.week13;

public class Happy_Number {

    public boolean isHappy(int n) {
        if(n==1)
            return true;
        if(n<5)
            return false;
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n=n/10;
        }
        return isHappy(sum);
    }

}
