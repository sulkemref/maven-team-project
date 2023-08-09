package kemal.mentor_tasks.week05;

import java.util.NoSuchElementException;

public class Find_Factorial {
    public static void main(String[] args) {

        System.out.println(factorial(12));
        System.out.println(factorialRec(12));

    }
    public static long factorial(int n){
        if(n < 0){
            throw new NoSuchElementException();
        }
        long result = 1;
        while (n>0){
            result*=n;
            n--;
        }
        return result;
    }

    public static long factorialRec(int n){
        if(n <= 0)
            return 1;
        long result = 1;
        while (n>0){
            result*=n;
            n--;
        }
        return factorial(n)*result;
    }
}
