package kemal.tree_practice;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;

public class Deepest_Leaves_Sum {

//    https://leetcode.com/problems/deepest-leaves-sum/description/

    private final static Deepest_Leaves_Sum obj = new Deepest_Leaves_Sum();

    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5,null,6,7,null,null,null,null,8};
        TreeNode root1 = TreeUtility.createBinaryTreeFromArray(arr1);

        System.out.println(obj.deepestLeavesSum(root1));

    }

    int height;
    int sum;

    public int deepestLeavesSum(TreeNode root) {
        preOrder(root,0);
        System.gc();
        return sum;
    }


    void preOrder(TreeNode root, int currentDeep){
        if(root==null){
            return;
        }
        if(currentDeep>height){
            height=currentDeep;
            sum=0;
        }
        if(currentDeep==height
                &&root.left==null
                &&root.right==null)
            sum+=root.val;
        preOrder(root.left,currentDeep+1);
        preOrder(root.right,currentDeep+1);
    }

//    private int height;
//    private int deepLeavesSum;
//
//    void getHeight(TreeNode root, int currentDeep){
//        if(root==null){
//            return;
//        }
//        height = Math.max(height, currentDeep);
//        getHeight(root.left,currentDeep+1);
//        getHeight(root.right,currentDeep+1);
//    }
//
//    public int deepestLeavesSum(TreeNode root) {
////        height = height(root);
//        getHeight(root,0);
//        System.out.println(height);
//        preOrderMaxDeep(root,0);
//        return deepLeavesSum;
//    }
//
//   private void preOrderMaxDeep(TreeNode root, int currentDeep){
//        if(root==null){
//            return;
//        }
//        if(currentDeep==height&&isLeaf(root))
//            deepLeavesSum+=root.val;
//        preOrderMaxDeep(root.left,currentDeep+1);
//        preOrderMaxDeep(root.right,currentDeep+1);
//    }
//
//    private int height(TreeNode root) {
//        if(root==null)
//            return -1;
//        if(root.left==null&&root.right==null)
//            return 0;
//        return Math.max(height(root.left),height(root.right))+1;
//    }
//
//    private boolean isLeaf(TreeNode root){
//        return root.left==null&&root.right==null;
//    }

}
