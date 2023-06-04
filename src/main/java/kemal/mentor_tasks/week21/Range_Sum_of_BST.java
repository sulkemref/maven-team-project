package kemal.mentor_tasks.week21;

import kemal.utilities.TreeNode;

public class Range_Sum_of_BST {

//    https://leetcode.com/problems/range-sum-of-bst/description/

    int result;

    public int rangeSumBST(TreeNode root, int low, int high) { // time O(n) space O(n)
        if(root==null)
            return 0;
        result+=root.val>=low&&root.val<=high?root.val:0;
        rangeSumBST(root.left,low,high);
        rangeSumBST(root.right,low,high);
        return result;
    }
}

