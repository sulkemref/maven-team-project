package kemal.mentor_tasks.week19;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Binary_Tree_Inorder_TraversalTest {

    private final Binary_Tree_Inorder_Traversal obj = new Binary_Tree_Inorder_Traversal();

    @ParameterizedTest
    @MethodSource("getInput")
    void inorderTraversalFirst(List<Integer> expectedResult, TreeNode root) {
        assertEquals(expectedResult,obj.inorderTraversalFirst(root));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void inorderTraversalSecond(List<Integer> expectedResult, TreeNode root) {
        assertEquals(expectedResult,obj.inorderTraversalSecond(root));
    }

    private static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(List.of(1,3,2), TreeUtility.createBinaryTreeFromArray(new Integer[]{1,null,2,3})),
                arguments(List.of(), TreeUtility.createBinaryTreeFromArray(new Integer[]{})),
                arguments(List.of(1), TreeUtility.createBinaryTreeFromArray(new Integer[]{1}))
                );
    }
}