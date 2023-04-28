package week_by_week.week15;

import java.util.Arrays;

public class MainMethodPractice {

    public static void main(String[] args) {

        System.out.println("Number of Command Line Argument = "+args.length);

        for(int i = 0; i< args.length; i++) {
            System.out.printf("Command Line Argument %d is %s%n", i, args[i]);
        }
    }
}
