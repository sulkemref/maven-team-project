package kemal.mentor_tasks.week14;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Find_All_Elements_Greater_Than_Their_RightTest {

    private final Find_All_Elements_Greater_Than_Their_Right obj = new Find_All_Elements_Greater_Than_Their_Right();

    @ParameterizedTest
    @MethodSource("getInput")
    void find(int[] expectedArray, int[] inputArray) {
        List<Integer> resultList = obj.find(inputArray);
        int[] resultArray = resultList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        assertArrayEquals(expectedArray , resultArray);
    }

    private static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(new int[]{10, 6, 5}, new int[]{10, 4, 6, 3, 5}),
                arguments(new int[]{4}, new int[]{4}),
                arguments(new int[]{}, new int[]{}),
                arguments(new int[]{9}, new int[]{9,9,9})
        );
    }
}