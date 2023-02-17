package almi.JavaCodingTasks.week1;

public class NumbersOddEven {


    //    | Constructor That --> Odd/Even |
    public NumbersOddEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }


    public static void main(String[] args) {

        NumbersOddEven obj1 = new NumbersOddEven(5);


    }


}
