package week_by_week.week03.algo03;

public class AnimalFeast {

    public static void main(String[] args) {

        System.out.println(isEligible("great blue heron", "garlic naan"));
        System.out.println(isEligible("chickadee", "chocolate cake"));

    }


    public static boolean isEligible(String animal, String dish) {

        return animal.charAt(0) == dish.charAt(0)
                && animal.charAt(animal.length() - 1) == dish.charAt(dish.length() - 1);
    }
}
