package kemal.mentor_tasks.week20;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Same_TreeTest {

    private final Same_Tree obj = new Same_Tree();

    @ParameterizedTest
    @MethodSource("getInput")
    void inorderTraversalSecond(boolean expectedResult, TreeNode p , TreeNode q) {
        assertEquals(expectedResult,obj.isSameTree(p,q));
    }

    private static Stream<Arguments> getInput() {
        return Stream.of(
                arguments(true, TreeUtility.createBinaryTreeFromArray(new Integer[]{1,2,3}),TreeUtility.createBinaryTreeFromArray(new Integer[]{1,2,3})),
                arguments(false, TreeUtility.createBinaryTreeFromArray(new Integer[]{1,2}),TreeUtility.createBinaryTreeFromArray(new Integer[]{1,null,2})),
                arguments(false, TreeUtility.createBinaryTreeFromArray(new Integer[]{1,2,1}),TreeUtility.createBinaryTreeFromArray(new Integer[]{1,1,2}))
        );
    }
}