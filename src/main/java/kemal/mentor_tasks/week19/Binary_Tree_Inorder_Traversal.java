package kemal.mentor_tasks.week19;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import kemal.utilities.VisualizeTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {

//    https://leetcode.com/problems/binary-tree-inorder-traversal/

    private final List<Integer> list = new ArrayList<>();

    private static final Binary_Tree_Inorder_Traversal obj = new Binary_Tree_Inorder_Traversal();

   public static void main(String[] args) {

        TreeNode root = TreeUtility.createBinaryTreeFromArray(new Integer[]{1,null,2,3});

        VisualizeTree.printTree(root,null,false);

        System.out.println(obj.inorderTraversalSecond(root));


    }


    public List<Integer> inorderTraversalFirst(TreeNode root) { // time O(n) space O(1)
        inOrder(root);
        return list;
    }

    private void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    public List<Integer> inorderTraversalSecond(TreeNode root) { //time O(n) space O(1)
        if (root == null) {
            return list;
        }
        inorderTraversalSecond(root.left);
        list.add(root.val);
        inorderTraversalSecond(root.right);
        return list;
    }
}
