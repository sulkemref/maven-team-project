package kemal.tree_practice;

import kemal.utilities.TreeNode;

public class Sum_of_Left_Leaves {

//    https://leetcode.com/problems/sum-of-left-leaves/description/

    static TreeNode prev;
    int sum;


    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        if (prev==null)
            prev=root;
        if(prev.left==root&&root.left==null&&root.right==null)
            sum+=root.val;
        prev=root;
        sumOfLeftLeaves(root.left);
        if(prev.left==root&&root.left==null&&root.right==null)
            sum+=root.val;
        prev=root;
        sumOfLeftLeaves(root.right);
        return sum;
    }
}
