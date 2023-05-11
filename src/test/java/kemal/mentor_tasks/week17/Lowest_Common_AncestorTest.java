package kemal.mentor_tasks.week17;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class Lowest_Common_AncestorTest {

    private final Lowest_Common_Ancestor obj = new Lowest_Common_Ancestor();

    @ParameterizedTest
    @MethodSource("getInput")
    void lowestCommonAncestorRec(TreeNode expectedResult, TreeNode root, TreeNode p, TreeNode q) {
        assertEquals(expectedResult,obj.lowestCommonAncestorRec(root,p,q));
    }

    @ParameterizedTest
    @MethodSource("getInput")
    void lowestCommonAncestorWhile(TreeNode expectedResult, TreeNode root, TreeNode p, TreeNode q) {
        assertEquals(expectedResult,obj.lowestCommonAncestorWhile(root,p,q));
    }

    private static Stream<Arguments> getInput() {

        TreeNode tree1 = TreeUtility.createBinaryTreeFromArray(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
        TreeNode p1 = tree1.left;
        TreeNode q1 = tree1.right;
        TreeNode expectedResult1 = tree1;

        TreeNode tree2 = TreeUtility.createBinaryTreeFromArray(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
        TreeNode p2 = tree2.left;
        TreeNode q2 = tree2.left.right;
        TreeNode expectedResult2 = tree2.left;

        TreeNode tree3 = TreeUtility.createBinaryTreeFromArray(new Integer[]{2,1,null});
        TreeNode p3 = tree3;
        TreeNode q3 = tree3.left;
        TreeNode expectedResult3 = tree3;


        return Stream.of(
                arguments(expectedResult1,tree1,p1,q1),
                arguments(expectedResult2,tree2,p2,q2),
                arguments(expectedResult3,tree3,p3,q3)
        );
    }


}