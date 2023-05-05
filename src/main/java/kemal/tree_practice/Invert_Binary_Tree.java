package kemal.tree_practice;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import kemal.utilities.VisualizeTree;

import java.util.LinkedList;
import java.util.Queue;

public class Invert_Binary_Tree {

    private static final Invert_Binary_Tree obj = new Invert_Binary_Tree();

    public static void main(String[] args) {

        Integer[] arr = {4,2,7,1,3,6,9};

        TreeNode root = TreeUtility.createBinaryTreeFromArray(arr);

        VisualizeTree.printTree(root,null,false);

        TreeNode result = obj.invertTreeDeep(root);

        VisualizeTree.printTree(result,null,false);
    }

    public TreeNode invertTreeWide(TreeNode root) {
        if(root==null)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode toVisit = queue.poll();
            changeChildPlaces(toVisit);
            if(toVisit.left!=null)
                queue.add(toVisit.left);
            if(toVisit.right!=null)
                queue.add(toVisit.right);
        }
        return root;
    }

    public TreeNode invertTreeDeep(TreeNode root){
        if(root==null)
            return null;
        invertTreeDeep(root.left);
        invertTreeDeep(root.right);
        changeChildPlaces(root);
        return root;
    }

    private void changeChildPlaces(TreeNode root){
        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;
    }
}
