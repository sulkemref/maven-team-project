package kemal.utilities;

import java.util.*;

public class TreeUtility {


    public static TreeNode createBinaryTreeFromArray(Integer[] arr){
        if(arr.length==0||arr[0]==null){
            return null;
        }
        TreeNode[] treeNodeArr = new TreeNode[arr.length];
        for(int i = 0 ; i < arr.length;i++){
            treeNodeArr[i] = arr[i]==null?null:new TreeNode(arr[i]);
        }
        TreeNode root = treeNodeArr[0];
        for(int i = 0 , j = 1; j < arr.length;i++){
            while (treeNodeArr[i]==null){
                i++;
            }
            treeNodeArr[i].left=treeNodeArr[j++];
            treeNodeArr[i].right=treeNodeArr[j++];
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
    public static void  preOrderTraversal(TreeNode root){
        if(root==null) // termination or base condition
            return;
        System.out.print(root.val+", ");// visit root
        preOrderTraversal(root.left); //visit left subtree
        preOrderTraversal(root.right); //visit right subtree
    }

    public static void inOrderTraversal(TreeNode root){
        if(root==null) // termination or base condition
            return;
        inOrderTraversal(root.left); //visit left subtree
        System.out.print(root.val+", ");// visit root
        inOrderTraversal(root.right); //visit right subtree
    }


    public static void postOrderTraversal(TreeNode root){
        if(root==null) // termination or base condition
            return;
        postOrderTraversal(root.left); //visit left subtree
        postOrderTraversal(root.right); //visit right subtree
        System.out.print(root.val+", ");// visit root
    }

    public static void levelOrderTraversal(TreeNode root){
        if(root==null)
            return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode toVisit = queue.poll();
            System.out.print(toVisit.val+", ");
            if(toVisit.left!=null)
                queue.add(toVisit.left);
            if(toVisit.right!=null)
                queue.add(toVisit.right);
        }

    }

}
