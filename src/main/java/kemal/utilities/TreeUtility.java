package kemal.utilities;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class TreeUtility {


    public static TreeNode createBinaryTreeFromArray(Integer[] arr){
        if(arr.length==0){
            return null;
        }
        TreeNode treeNode;
        TreeNode current;
        TreeNode root=null;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag=true;
        for (Integer integer : arr) {
            if (integer != null) {
                treeNode = new TreeNode(integer);
            } else {
                treeNode = null;
            }

            if (queue.isEmpty() && integer != null) {
                root = treeNode;
                queue.add(root);
                continue;
            }
            current = queue.peek();
            if (flag) {
                current.left = treeNode;
                queue.add(treeNode);
                flag = false;
            } else {
                current.right = treeNode;
                queue.add(treeNode);
                flag = true;
                queue.poll();
            }
        }
        return root;
    }

    public static boolean contains(TreeNode root ,int value){
        if (root==null) return false;
        TreeNode current= root;
        while (current!=null) {
            if (value<current.val) current=current.left;
            else if (value> current.val) current=current.right;
            else return true;
        }
        return false;
    }

    public static TreeNode findTreeNodeByValue(TreeNode root, int value){
        //levelOrderTraversal
        if(root==null)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode toVisit = queue.poll();
            if (toVisit.val==value){
                return toVisit;
            }
            if(toVisit.left!=null)
                queue.add(toVisit.left);
            if(toVisit.right!=null)
                queue.add(toVisit.right);
        }
        return null;

    }

}
