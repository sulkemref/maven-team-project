package kemal.mentor_tasks.week13;

import kemal.utilities.NodeUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Remove_Linked_List_ElementsTest {

    @ParameterizedTest
    @MethodSource("getInput")
    void removeElements(int[] expected, int[] inputArr, int inputNumber) {

        Remove_Linked_List_Elements obj = new Remove_Linked_List_Elements();
        assertArrayEquals(expected,
               NodeUtility.createIntArrFromListNode(
                       obj.removeElements(NodeUtility.createListNodeFromArray(inputArr),inputNumber)));
    }

    public static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(new int[]{1,2,3,4,5}, new int[]{1,2,6,3,4,5,6},6),
                arguments(null, new int[]{},1),
                arguments(null, new int[]{7,7,7,7},7),
                arguments(new int[]{2,3,4,5}, new int[]{1,2,1,3,1,4,1,5,1},1)
        );
    }
}