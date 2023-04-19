package week_by_week.week12.java17Examples.recordExamples;

import java.util.function.Predicate;

/**
 * record is implicitly final
 * <p>accessor, hashCode, equal and toString method and all arg constructor is generated automatically</p>
 *
 * @param name
 * @param age
 */
public record Person(String name, int age) implements Predicate<String> {


    public static String COMPANY = "CYDEO";

    @Override
    public boolean test(String s) {
        return false;
    }
}

class PersonApp{

    public static void main(String[] args) {

        Person person = new Person("Mike",45);
        System.out.println(person.age());

        System.out.println(Person.COMPANY);
    }
}
