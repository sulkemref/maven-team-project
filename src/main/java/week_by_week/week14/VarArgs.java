package week_by_week.week14;

public class VarArgs {

    public static void main(String[] args) {
        varArgMethod(1, 2, 3, 4, 5);
    }


    public static void varArgMethod(int... numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void varArgMethod(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }


}
