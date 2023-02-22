package week_by_week.week03.enums;

public class MainEnum {

    public static void main(String[] args) {

        System.out.println(Days.MONDAY);

        System.out.println(Days.MONDAY.s);
        System.out.println(Days.TUESDAY.s);
        System.out.println(Days.FRIDAY.s);
        System.out.println(Days.FRIDAY.number);

        Days.MONDAY.accept("hello");

        Days.MONDAY.print();
        Days.printStatic();

    }
}
