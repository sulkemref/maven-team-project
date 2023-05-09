package kemal.tree_practice;

import kemal.utilities.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_The_Lonely_Nodes {

    List<Integer> list = new ArrayList();

    public List<Integer> getLonelyNodes(TreeNode root) {
        preOrderTraversal(root);
        return list;
    }

    public void preOrderTraversal(TreeNode root){
        if(root==null)
            return;
        if(root.left!=null&&root.right==null){
            list.add(root.left.val);
        }
        if(root.right!=null&&root.left==null){
            list.add(root.right.val);
        }
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
}
