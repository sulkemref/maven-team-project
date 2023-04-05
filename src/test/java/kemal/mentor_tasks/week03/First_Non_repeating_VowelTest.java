package kemal.mentor_tasks.week03;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class First_Non_repeating_VowelTest {

    @ParameterizedTest
    @MethodSource("getInput")
    void firstNonRepeatingVowelTest(int expected,String input) {
        assertEquals(expected,First_Non_repeating_Vowel.firstNonRepeatingVowel(input));
    }

    public static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(-1,"googlee"),
                arguments(1,"goglee"),
                arguments(5,"google"),
                arguments(-1,"")
        );
    }
}