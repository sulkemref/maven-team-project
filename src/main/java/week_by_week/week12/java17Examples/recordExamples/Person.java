package week_by_week.week12.java17Examples.recordExamples;

/**
 * record is implicitly final
 * <p>accessor, hashCode, equal and toString method and all arg constructor is generated automatically</p>
 *
 * @param name
 * @param age
 */
public record Person(String name, int age){

    public static String COMPANY = "CYDEO";

}

class PersonApp{

    public static void main(String[] args) {
        Person person = new Person("Mike",45);
        System.out.println(person.name());
        System.out.println(person.age());
        System.out.println(Person.COMPANY);
    }
}
