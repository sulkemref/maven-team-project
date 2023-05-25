package kemal.mentor_tasks.week19;

import kemal.utilities.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {

//    https://leetcode.com/problems/binary-tree-inorder-traversal/

    List<Integer> list = new ArrayList<>();

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
