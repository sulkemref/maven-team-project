package week_by_week.week13;

public class Calculation {
    public static void main(String[] args) {
        int m = add(3, 5);
        System.out.println(m);

        int n = addTriplet(3,5,2);
        System.out.println(n);
    }

    private static int add(int x, int y){
        return x + y;
    }

    private static int addTriplet(int x, int y, int z){
        return add(x, y) + z;
    }
}