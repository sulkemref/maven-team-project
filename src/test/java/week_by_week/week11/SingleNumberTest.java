package week_by_week.week11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static week_by_week.week11.SingleNumber.*;

class SingleNumberTest {

    @Test
    void bruteForceTest() {
        int[] inputArray = {1, 2, 1, 3, 3, 2, 4, 4, 8, 13, 9, 10, 13, 10, 8};

        assertEquals(9, bruteForce(inputArray));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void withSortTests(int expected, int [] inputArray) {
        assertEquals(expected,withSort(inputArray));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void withHashMapTest(int expected, int [] inputArray) {
        assertEquals(expected,withHashMap(inputArray));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void withSetTest(int expected, int [] inputArray) {
        assertEquals(expected,withSet(inputArray));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void withXORTest(int expected, int [] inputArray) {
        assertEquals(expected,withXOR(inputArray));
    }

    /**
     * This method is responsible for generating set of data.
     *
     * @return Stream of Arguments
     */
    public static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(1, new int[]{2, 2, 1}),
                arguments(4, new int[]{4, 1, 2, 1, 2}),
                arguments(1, new int[]{1}),
                arguments(100000, new int[]{100, 1000, 10000, 10000, 10, 100, 10, 1000, 100000})
        );
    }
}