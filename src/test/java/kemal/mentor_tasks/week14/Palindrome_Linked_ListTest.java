package kemal.mentor_tasks.week14;

import kemal.utilities.ListNode;
import kemal.utilities.NodeUtility;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Palindrome_Linked_ListTest {

    private final Palindrome_Linked_List obj = new Palindrome_Linked_List();

    @ParameterizedTest
    @MethodSource("getInput")
    void isPalindrome(boolean expectedResult, int[] inputArray) {
        ListNode head = NodeUtility.createListNodeFromArray(inputArray);

        assertEquals(expectedResult,obj.isPalindrome(head));
    }

    private static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(true, new int[]{1, 2, 3, 2, 1}),
                arguments(true, new int[]{1, 2, 2, 1}),
                arguments(true, new int[]{4}),
                arguments(true, new int[]{4,4}),
                arguments(false, new int[]{}),
                arguments(false, new int[]{1,2,3})
        );
    }
}