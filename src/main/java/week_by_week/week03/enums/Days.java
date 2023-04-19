package week_by_week.week03.enums;

import java.util.function.Consumer;

public enum Days implements Consumer<String> {

    MONDAY("first day"), TUESDAY, WEDNESDAY, THURSDAY, FRIDAY("fifth day", 5), SATURDAY, SUNDAY;

    String s;
    int number;

    Days() {
        System.out.println("No arg constructor");
    }

    Days(String s) {
        this.s = s;
    }

    Days(String s, int number) {
        this.s = s;
        this.number = number;
    }

    @Override
    public void accept(String s) {
        System.out.println("This is a days enum with " + s);
    }

    void print(){
        System.out.println("This is just for instance print");
    }

    static void printStatic(){
        System.out.println("This is just for static print");
    }
}
