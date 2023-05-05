package kemal.tree_practice;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import kemal.utilities.VisualizeTree;

import java.util.ArrayList;
import java.util.List;

public class Increasing_Order_Search_Tree {

//    https://leetcode.com/problems/increasing-order-search-tree/

    private static final Increasing_Order_Search_Tree obj = new Increasing_Order_Search_Tree();

    private static final List<TreeNode> list = new ArrayList<>();

    public static void main(String[] args) {

        Integer[] arr = {5,3,6,2,4,null,8,1,null,null,null,7,9};

        TreeNode root = TreeUtility.createBinaryTreeFromArray(arr);

        VisualizeTree.printTree(root,null,false);

        TreeNode result = obj.increasingBST(root);

        VisualizeTree.printTree(result,null,false);

    }

    public TreeNode increasingBST(TreeNode root) {
        inOrderTraversal(root);
        TreeNode result = list.get(0);
        for (int i = 1;i<list.size();i++){
            list.get(i-1).right=list.get(i);
        }
        return result;
    }

    private void inOrderTraversal(TreeNode root){
        if(root==null)
            return;
        inOrderTraversal(root.left);
        root.left=null;
        list.add(root);
        inOrderTraversal(root.right);
        root.right=null;
    }
}
