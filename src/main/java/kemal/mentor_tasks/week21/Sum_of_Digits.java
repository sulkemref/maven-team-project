package kemal.mentor_tasks.week21;

public class Sum_of_Digits {

//    https://leetcode.com/problems/add-digits/

    public int addDigits(int num) { // time O(logn) space O(logn)
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum>9?addDigits(sum):sum;
    }

    //time O(1) space O(1)
    public int addDigits2(int num) {        // 0             !
        if(num == 0)                        // 1=10=19=28=37
            return 0;                       // 2=11=20=29=38
        num%=9;                             // 3=12=21=30=39
        if(num == 0)                        // 4=13=22=31=40
            return 9;                       // 5=14=23=32=41
        else                                // 6=15=24=33=42
            return num;                     // 7=16=25=34=43
    }                                       // 8=17=26=35=44
                                            // 9=18=27=36=45 !

    //      14  = 1*9 + 5
    //      25  = 2*9 + 7
    //      235807  = 26200*9 + (235800 -235807)7
    public int addDigits3(int num) { //time O(1) space O(1)
        return 1 + (num - 1) % 9;
    }
}
