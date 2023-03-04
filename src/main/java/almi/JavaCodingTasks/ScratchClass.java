package almi.JavaCodingTasks;

import java.util.stream.IntStream;

public class ScratchClass {

    public static void main(String[] args) {

        IntStream.of(1, 2, 3, 4)
                .filter(e -> e > 2)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(e -> e * e)
                .forEach(System.out::println);
//                .peek(e -> System.out.println("Mapped value: " + e)).sum();


    }

}
