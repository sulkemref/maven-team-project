package kemal.mentor_tasks.week15;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Climbing_StairsTest {

    private final Climbing_Stairs cs = new Climbing_Stairs();

    @ParameterizedTest
    @MethodSource("getInput")
    void climbStairsRec(int expected, int input) {
        assertEquals(expected,cs.climbStairsRec(input));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void climbStairsWhile(int expected, int input) {
        assertEquals(expected,cs.climbStairsWhile(input));
    }

    private static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(3,3),
                arguments(8,5),
                arguments(5,4),
                arguments(1836311903,45),
                arguments(39088169,37),
                arguments(4181,18)
        );
    }
}