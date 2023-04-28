package kemal.mentor_tasks.week15;

import kemal.utilities.ListNode;
import kemal.utilities.NodeUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Linked_List_CycleTest {

    Linked_List_Cycle lc = new Linked_List_Cycle();

    @ParameterizedTest
    @MethodSource("getInput")
    void detectCycleSet(ListNode expected, ListNode input) {
        assertEquals(expected,lc.detectCycleSet(input));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void detectCycle(ListNode expected, ListNode input) {
        assertEquals(expected,lc.detectCycle(input));
    }


    private static Stream<Arguments> getInput() {
        ListNode nodeList1 = NodeUtility.createListNodeFromArray(new int[]{3, 2, 0, -4});
        NodeUtility.makeCircleLinkList(nodeList1,1);
        ListNode expectedNode1 = nodeList1.next;

        ListNode nodeList2 = NodeUtility.createListNodeFromArray(new int[]{1, 2});
        NodeUtility.makeCircleLinkList(nodeList2,0);
        ListNode expectedNode2 = nodeList2;

        ListNode nodeList3 = NodeUtility.createListNodeFromArray(new int[]{1});
        NodeUtility.makeCircleLinkList(nodeList3,-1);
        ListNode expectedNode3 = null;

        ListNode nodeList4 = NodeUtility.createListNodeFromArray(new int[]{1,2,3,4,5,6,7,8,9,10});
        NodeUtility.makeCircleLinkList(nodeList4,5);
        ListNode expectedNode4 = nodeList4.next.next.next.next.next;

        return Stream.of(
                arguments(expectedNode1,nodeList1),
                arguments(expectedNode2,nodeList2),
                arguments(expectedNode3,nodeList3),
                arguments(expectedNode4,nodeList4)
        );
    }
}