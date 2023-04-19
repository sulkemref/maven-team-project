package week_by_week.week12.aloSolutions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.util.Assert;

import java.math.BigInteger;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @ParameterizedTest
    @MethodSource("generateData")
    void getPlusOneBruteForceTest(int[] input, int[] expected) {

        assertArrayEquals(expected, PlusOne.getPlusOneBruteForce(input));
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void withOneForLoopTest(int[] input, int[] expected) {
        assertArrayEquals(expected, PlusOne.withOneForLoop(input));
    }


    public static Stream<Arguments> generateData() {

        return Stream.of(
                Arguments.arguments(new int[]{1, 4, 5, 5}, new int[]{1, 4, 5, 6}),
                Arguments.arguments(new int[]{9, 9, 9, 9}, new int[]{1, 0, 0, 0, 0}),
                Arguments.arguments(new int[]{3, 5, 9, 9}, new int[]{3, 6, 0, 0}),
                Arguments.arguments(new int[]{1, 2}, new int[]{1, 3}),
                Arguments.arguments(new int[]{1, 0, 0, 0, 0, 0, 0, 9}, new int[]{1, 0, 0, 0, 0, 0, 1, 0})
        );
    }
}