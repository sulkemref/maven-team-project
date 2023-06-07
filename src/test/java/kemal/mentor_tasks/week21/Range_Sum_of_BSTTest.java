package kemal.mentor_tasks.week21;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Range_Sum_of_BSTTest {

    private final Range_Sum_of_BST obj = new Range_Sum_of_BST();

    @ParameterizedTest
    @MethodSource("getInput")
    void rangeSumBST(int expectedResult, TreeNode root, int low, int high) {
        assertEquals(expectedResult,obj.rangeSumBST(root,low,high));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void rangeSumBST2(int expectedResult, TreeNode root, int low, int high) {
        assertEquals(expectedResult,obj.rangeSumBST2(root,low,high));
    }

    private static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(32, TreeUtility.createBinaryTreeFromArray(new Integer[]{10,5,15,3,7,null,18}),7,15),
                arguments(23, TreeUtility.createBinaryTreeFromArray(new Integer[]{10,5,15,3,7,13,18,1,null,6}),6,10)
        );
    }
}