package kemal.tree_practice;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import kemal.utilities.VisualizeTree;

public class Evaluate_Boolean_Binary_Tree {

    private static final Evaluate_Boolean_Binary_Tree obj = new Evaluate_Boolean_Binary_Tree();

    public static void main(String[] args) {

        Integer[] arr = {3,2,2,2,2,3,2,0,0,0,1,1,2,1,1,null,null,null,null,null,null,null,null,null,null,3,2,null,null,null,null,2,3,0,0,1,1,0,3,null,null,null,null,null,null,null,null,null,null,3,0,3,3,null,null,0,0,1,0,null,null,null,null,null,null,null,null};

        TreeNode root = TreeUtility.createBinaryTreeFromArray(arr);

        VisualizeTree.printTree(root,null,false);

        VisualizeTree.printTree(obj.evaluateTree(root),null,false);

    }


    public TreeNode evaluateTree(TreeNode root) {
        preOrderTraversal(root);
        return root;
    }

    private static void  preOrderTraversal(TreeNode root){
        if(root==null)
            return;
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
        if (root.val==2){
            if(root.left.val==0&&root.right.val==0)
                root.val=0;
            else
                root.val=1;
        }
        if (root.val==3){
            if(root.left.val==1&&root.right.val==1)
                root.val=1;
            else
                root.val=0;
        }
    }
}
