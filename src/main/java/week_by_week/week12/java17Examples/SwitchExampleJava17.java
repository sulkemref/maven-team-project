package week_by_week.week12.java17Examples;

public class SwitchExampleJava17 {
    public static void main(String[] args) {
        earlierVersions("A");
        earlierVersions("B");
        earlierVersions("C");


//        process("string test");
//        process(5);
//        process(5.5);
        process(null);
        process(new StringBuilder("sb"));
    }

    public static void earlierVersions(String str) {
        final String b = "B";
        switch (str) {
            case "A" -> System.out.println("Parameter is A");
            case b -> System.out.println("Parameter is b");
            default -> System.out.println("Parameter is unknown");
        }
        ;
    }

    public static void process(Object obj) {
//        if (obj instanceof String s) {
//            System.out.println("Object is a string : " + s);
//        } else if (obj instanceof Integer n) {
//            System.out.println("Object is a integer : " + n);
//        }
        switch (obj) {
            case String s -> System.out.println("The input is a string: " + s);
            case Integer i -> System.out.println("The input is an integer: " + i);
            case Double d -> System.out.println("The input is a double: " + d);
            case null -> System.out.println("The input is null");
            case StringBuilder b -> System.out.println("The input is a StringBuilder: " + b);
            default -> System.out.println("The input is of an unknown type");
        }
    }

}
