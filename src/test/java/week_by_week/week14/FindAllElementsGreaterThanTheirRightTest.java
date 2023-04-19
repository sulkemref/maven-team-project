package week_by_week.week14;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class FindAllElementsGreaterThanTheirRightTest {

    @ParameterizedTest
    @MethodSource("generateData")
    void findElementsBruteForceTest(int[] input, List<Integer> expectedOutput) {

        List<Integer> actualOutput = FindAllElementsGreaterThanTheirRight.findElementsBruteForce(input);

        assertEquals(actualOutput, expectedOutput);
    }


    @ParameterizedTest
    @MethodSource("generateData")
    void findElementsStackTest(int[] input, List<Integer> expectedOutput) {
        List<Integer> actualOutput = FindAllElementsGreaterThanTheirRight.findElementsStack(input);

        assertEquals(actualOutput, expectedOutput);
    }


    public static Stream<Arguments> generateData() {

        return Stream.of(
                arguments(new int[]{10, 4, 6, 3, 5}, new ArrayList<>(List.of(10, 6, 5))),
                arguments(new int[]{2, 6, 13, 12, 8, 9, 10, 11}, new ArrayList<>(List.of(13, 12, 11))),
                arguments(new int[]{2, 6, 13, 12, 8, 9, 4, 3}, new ArrayList<>(List.of(13, 12, 9, 4, 3)))
        );
    }
}