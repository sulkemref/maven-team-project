package kemal.mentor_tasks.week21;

import kemal.utilities.TreeUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Sum_of_DigitsTest {

    private final Sum_of_Digits obj = new Sum_of_Digits();

    @ParameterizedTest
    @MethodSource("getInput")
    void addDigits(int expectedResult,int input) {
        assertEquals(expectedResult,obj.addDigits(input));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void addDigits2(int expectedResult,int input) {
        assertEquals(expectedResult,obj.addDigits2(input));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void addDigits3(int expectedResult,int input) {
        assertEquals(expectedResult,obj.addDigits3(input));
    }

    private static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(0,0),
                arguments(5,32),
                arguments(9,18),
                arguments(2,3854)
        );
    }
}