package kemal.mentor_tasks.week05;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Array_of_DigitsTest {

    @ParameterizedTest
    @MethodSource("getInput")
    void arrayOfDigitsTest(int[] expected, int input) {
        assertArrayEquals(expected,Array_of_Digits.arrayOfDigits(input));
    }

    public static Stream<Arguments> getInput(){
        return Stream.of(
                arguments(new int[]{4,9,0},490),
                arguments(new int[]{5, 9, 7, 9, 8, 6, 8, 7, 5},-597986875),
                arguments(new int[]{7},7),
                arguments(new int[]{0},0)
        );

    }
}