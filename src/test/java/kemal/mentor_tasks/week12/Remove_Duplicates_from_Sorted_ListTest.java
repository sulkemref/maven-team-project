package kemal.mentor_tasks.week12;

import kemal.mentor_tasks.week12.NodeUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Remove_Duplicates_from_Sorted_ListTest {

//    @Test
//    void deleteDuplicates() {
//
//
//    }

    @ParameterizedTest
    @MethodSource("getInput")
    void withSetTest(int[] expected, int[] input) {
        ListNode head = NodeUtils.createListNodeFromArray(input);
        Remove_Duplicates_from_Sorted_List obj = new Remove_Duplicates_from_Sorted_List();
        ListNode result = obj.deleteDuplicates(head);


        assertArrayEquals(expected,NodeUtils.createIntArrFromListNode(result));
    }

    public static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(new int[]{1,2}, new int[]{1,1,2}),
                arguments(new int[]{1,2,3}, new int[]{1,1,2,3,3}),
                arguments(new int[]{9}, new int[]{9}),
                arguments(new int[]{9}, new int[]{9,9,9})
        );
    }
}