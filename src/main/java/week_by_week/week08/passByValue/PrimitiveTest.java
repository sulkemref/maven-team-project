package week_by_week.week08.passByValue;

public class PrimitiveTest {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("original num : " + num);//5
        add(num);
        System.out.println("after addition : " + num);//5
    }

    static void add(int num){
        num = num + 5;
        System.out.println(num);
    }
}
