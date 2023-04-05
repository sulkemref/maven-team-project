package kemal.mentor_tasks.week04;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Count_Duplicated_CharsTest {

    @ParameterizedTest
    @MethodSource("getInput")
    void countDubTest(int expected, String input) {
        assertEquals(expected,Count_Duplicated_Chars.countDub(input));
    }

    public static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(0,"abcde"),
                arguments(2,"aabbcde"),
                arguments(2,"aabBcde"),
                arguments(1,"indivisibility"),
                arguments(0,""),
                arguments(2,"Indivisibilities")
        );
    }
}