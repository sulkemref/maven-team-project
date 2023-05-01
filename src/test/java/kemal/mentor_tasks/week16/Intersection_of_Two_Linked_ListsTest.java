package kemal.mentor_tasks.week16;

import kemal.utilities.ListNode;
import kemal.utilities.NodeUtility;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Intersection_of_Two_Linked_ListsTest {

    private final Intersection_of_Two_Linked_Lists obj = new Intersection_of_Two_Linked_Lists();

    @ParameterizedTest
    @MethodSource("getInput")
    void getIntersectionNodeSet(ListNode expected, ListNode inputA,ListNode inputB) {
        assertEquals(expected,obj.getIntersectionNodeSet(inputA,inputB));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void getIntersectionNode(ListNode expected, ListNode inputA,ListNode inputB) {
        assertEquals(expected,obj.getIntersectionNode(inputA,inputB));
    }

    private static Stream<Arguments> getInput() {
        ListNode nodeList1a = NodeUtility.createListNodeFromArray(new int[]{4,1,8,4,5});
        ListNode joinNode1 = nodeList1a.next.next;
        ListNode nodeList1b = NodeUtility.createListNodeFromArray(new int[]{5,6,1});
        nodeList1b.next.next.next=joinNode1;


        ListNode nodeList2a = NodeUtility.createListNodeFromArray(new int[]{1,9,1,2,4});
        ListNode joinNode2 = nodeList2a.next.next.next;
        ListNode nodeList2b = NodeUtility.createListNodeFromArray(new int[]{3});
        nodeList2b.next=joinNode2;

        ListNode nodeList3a = NodeUtility.createListNodeFromArray(new int[]{2,6,4});
        ListNode nodeList3b = NodeUtility.createListNodeFromArray(new int[]{1,5});

        return Stream.of(
                arguments(joinNode1,nodeList1a,nodeList1b),
                arguments(joinNode2,nodeList2a,nodeList2b),
                arguments(null,nodeList3a,nodeList3b)
        );
    }
}