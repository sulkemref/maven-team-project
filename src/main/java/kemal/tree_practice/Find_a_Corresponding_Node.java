package kemal.tree_practice;

import kemal.utilities.TreeNode;
import kemal.utilities.TreeUtility;
import kemal.utilities.VisualizeTree;

import java.util.LinkedList;
import java.util.Queue;

public class Find_a_Corresponding_Node {

//    https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/description/

    TreeNode result,target;


    public static void main(String[] args) {

        final Find_a_Corresponding_Node obj = new Find_a_Corresponding_Node();

        Integer[] arr= {7,4,3,null,null,6,19};
        TreeNode root = TreeUtility.createBinaryTreeFromArray(arr);
        TreeNode rootCloned = TreeUtility.createBinaryTreeFromArray(arr);
        VisualizeTree.printTree(root,null,false);
        VisualizeTree.printTree(rootCloned,null,false);
        System.out.println(root==rootCloned);
//        System.out.println(TreeUtility.contains(root,9));
        TreeNode target =TreeUtility.findTreeNodeByValue(root,3);

       TreeNode result = obj.getTargetCopyWide(root,rootCloned,target);

        System.out.println(result);
        System.out.println(target);

        TreeNode result2 = obj.getTargetCopyPreOrder(root,rootCloned,target);


        System.out.println(result2);
        System.out.println(target);
    }
    public TreeNode getTargetCopyWide(
                final TreeNode original, final TreeNode cloned,
                final TreeNode target) {

        if(original==null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queueCloned = new LinkedList<>();
        queue.add(original);
        queueCloned.add(cloned);
        while (!queue.isEmpty()){
            TreeNode toVisit = queue.poll();
            TreeNode toVisitCloned = queueCloned.poll();
            if(target.val==toVisitCloned.val){
                return toVisitCloned;
            }
            if(toVisit.left!=null){
                queue.add(toVisit.left);
                queueCloned.add(toVisitCloned.left);
            }

            if(toVisit.right!=null){
                queue.add(toVisit.right);
                queueCloned.add(toVisitCloned.right);
            }
        }
        return null;
    }

    public TreeNode getTargetCopyPreOrder(
            final TreeNode original, final TreeNode cloned,
            final TreeNode target) {

        this.target = target;
        preOrder(original,cloned);
        return result;
    }
    private void preOrder(TreeNode original, TreeNode cloned){
        if(original==null)
            return;
        if(target.val==cloned.val){
            result = cloned;
            return;
        }
        preOrder(original.left,cloned.left);
        preOrder(original.right,cloned.right);
    }

}

