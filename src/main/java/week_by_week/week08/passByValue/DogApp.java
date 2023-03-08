package week_by_week.week08.passByValue;

public class DogApp {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        // we pass the object to foo
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println("main method: dog name Max ? " + aDog.getName().equals("Max")); // true
        System.out.println("main method: dog name Fifi ? " + aDog.getName().equals("Fifi")); // false
        System.out.println("main method: aDog.equals(oldDog) ? " + aDog.equals(oldDog)); // true

        oldDog = new Dog("Rover");
        System.out.println("aDog  : " + aDog.getName() + " | oldDog : " + oldDog.getName());
    }

    public static void foo(Dog d) {
        System.out.println("foo method dog name Max ? " + d.getName().equals("Max")); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
       d = new Dog("Fifi");
       // d.setName("Fifi");
        System.out.println("foo method dog name Fifi ? " + d.getName().equals("Fifi")); // true
    }
}
