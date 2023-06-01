package kemal.mentor_tasks.week20;

import kemal.utilities.TreeNode;

public class Same_Tree {

//    https://leetcode.com/problems/same-tree/

    private boolean result = true;

    public boolean isSameTree(TreeNode p, TreeNode q) { // time O(n) space O(n)
        inOrder(p,q);
        return result;
    }

    private void inOrder(TreeNode p, TreeNode q){
        if(!result||p==null&&q==null){
            return;
        }

        if(p==null||q==null||p.val!=q.val){
            result=false;
            return;
        }

        inOrder(p.left,q.left);
        inOrder(p.right,q.right);
    }
}



