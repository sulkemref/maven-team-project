package kemal.tree_practice;

import kemal.utilities.TreeNode;

public class Lowest_Common_Ancestor {

//    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/

    public TreeNode lowestCommonAncestorRec(TreeNode root, TreeNode p, TreeNode q) {
        if(q.val<root.val&&root.val<p.val ||p.val<root.val&&root.val<q.val // case 1
                ||p==root  // case 2
                ||q==root) // case 3
            return root;
        return lowestCommonAncestorRec(q.val>root.val&&p.val>root.val?root.right:root.left,p,q);
        // if p & q > root move to right else to left
    }

    public TreeNode lowestCommonAncestorWhile(TreeNode root, TreeNode p, TreeNode q){
        while (root!=null){
            if(q.val<root.val&&root.val<p.val ||p.val<root.val&&root.val<q.val // case 1
                    ||p==root  // case 2
                    ||q==root) // case 3
                break;
            else
                root=q.val>root.val&&p.val>root.val?root.right:root.left;
        }
        return root;
    }
}
