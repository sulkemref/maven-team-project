package kemal.mentor_tasks.week12;

import kemal.mentor_tasks.week07.TwoSum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static week_by_week.week11.SingleNumber.withSet;

class Plus_OneTest {

//    @Test
//    void plusOne() {
//        Plus_One obj = new Plus_One();
//        int[] arr = obj.plusOne(new int[]{1,2,3});
//        assertArrayEquals(new int[]{1,2,4},arr);
//    }

    @ParameterizedTest
    @MethodSource("getInput")
    void withSetTest(int[] expected, int[] inputArray) {
        Plus_One obj = new Plus_One();
        assertArrayEquals(expected,obj.plusOne(inputArray));
    }

    public static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(new int[]{1,2,4}, new int[]{1,2,3}),
                arguments(new int[]{4,3,2,2}, new int[]{4,3,2,1}),
                arguments(new int[]{1,0}, new int[]{9}),
                arguments(new int[]{1,0,0,0}, new int[]{9,9,9})
        );
    }
}