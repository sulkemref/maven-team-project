package week_by_week.week11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class DeleteNAfterMTest {

    @ParameterizedTest
    @MethodSource("getInput")
    void getDeletedNodeTest(List<Integer> expected, int m, int n, List<Integer> input) {

        Node node = new Node(input.get(0));
        Node current = node;
        for (int i = 1; i < input.size(); i++) {
            current.next = new Node(input.get(i));
            current = current.next;
        }
        node.printNode();
        DeleteNAfterM.deleteNodes(node, m, n);

        Node forAssertion = node;
        List<Integer> listForAssertion = new ArrayList<>();
        while (forAssertion != null) {
            listForAssertion.add(forAssertion.value);
            forAssertion = forAssertion.next;
        }
        assertEquals(expected,listForAssertion);
    }

    //Todo
    @Test
    void deleteNodes() {
    }

    //Todo
    @Test
    void deleteNodes2() {
    }

    public static Stream<Arguments> getInput() {
        List<Integer> inputList1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        List<Integer> inputList2 = List.of(10, 20, 30, 35, 45, 55, 75, 85, 95);
        List<Integer> inputList3 = List.of(51, 62, 73, 84, 95, 106, 207, 808, 909, 1010, 1111, 1212);
        List<Integer> inputList4 = new ArrayList<>();
        for (int i = 1; i <= 5000; i++) {
            inputList4.add(i);
        }

        return Stream.of(
                arguments(List.of(1, 2, 6, 7, 11, 12), 2, 3, inputList1),
                arguments(List.of(10, 20, 30, 55, 75, 85), 3, 2, inputList2),
                arguments(List.of(51, 106, 1111), 1, 4, inputList3),
                arguments(List.of(1, 1001, 2001, 3001, 4001), 1, 999, inputList4)
        );

    }
}