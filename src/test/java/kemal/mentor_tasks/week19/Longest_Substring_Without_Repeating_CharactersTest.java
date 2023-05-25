package kemal.mentor_tasks.week19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Longest_Substring_Without_Repeating_CharactersTest {

    private final Longest_Substring_Without_Repeating_Characters obj = new Longest_Substring_Without_Repeating_Characters();

    @ParameterizedTest
    @MethodSource("getInput")
    void lengthOfLongestSubstringSet(int expectedResult, String input) {
        assertEquals(expectedResult,obj.lengthOfLongestSubstringSet(input));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void lengthOfLongestSubstringStr(int expectedResult, String input) {
        assertEquals(expectedResult,obj.lengthOfLongestSubstringStr(input));
    }

    private static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(3,"abcabcbb"),
                arguments(1,"bbbbb"),
                arguments(3,"pwwkew"));

    }
}