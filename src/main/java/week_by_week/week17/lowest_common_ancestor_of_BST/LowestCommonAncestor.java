package week_by_week.week17.lowest_common_ancestor_of_BST;

/*
    Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q
as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Example 1:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.

Example 2:
Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.

Example 3:
Input: root = [2,1], p = 2, q = 1
Output: 2

Constraints:
    The number of nodes in the tree is in the range [2, 105].
    -109 <= Node.val <= 109
    All Node.val are unique.
    p != q
    p and q will exist in the BST.

  https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree
 */
public class LowestCommonAncestor {

//    LowestCommonAncestor solution = new LowestCommonAncestor();

    TreeNode iterativeSolution(TreeNode root, TreeNode p, TreeNode q) {
        int small = Math.min(p.val, q.val);
        int large = Math.max(p.val, q.val);
        while (root != null) {
            if (root.val > large) // p, q belong to the left subtree
                root = root.left;
            else if (root.val < small) // p, q belong to the right subtree
                root = root.right;
            else // Now, small <= root.val <= large -> This root is the LCA between p and q
                return root;
        }
        return null;
    }

    TreeNode recursiveSolution(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        // both p and q are less than root
        // their ancestor must be in root.left
        if (p.val < root.val && q.val < root.val)
            return recursiveSolution(root.left, p, q);

        // both p and q are greater than root
        // their ancestor must be in root.right
        if (p.val > root.val && q.val > root.val)
            return recursiveSolution(root.right, p, q);

        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null, p = null, q = null;

        //region sample1
        System.out.println("********** EXAMPLE 1 INPUT TREE **********");
        root = getSampleTreeNode1(); //root=13
        p = root.left; //p=5
        q = root.right; //q=16
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => 13");

        //todo please call your solution method here and print the output to the console. expected output for this sample is 13
        System.out.println("PRINT YOUR SOLUTION METHOD'S RETURN VALUE");
        System.out.println("\n***************************************************\n");
        //endregion

        //region sample2
        System.out.println("********** EXAMPLE 2 INPUT TREE **********");
        root = getSampleTreeNode1(); //root=13
        p = root.right; //p=16
        q = root.right.left; //q=14
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => 16");

        //todo please call your  solution method here and print the output to the console. expected output for this sample is 16
        System.out.println("PRINT YOUR SOLUTION METHOD'S RETURN VALUE");
        System.out.println("\n***************************************************\n");
        //endregion

        //region sample3
        System.out.println("********** EXAMPLE 3 INPUT TREE **********");
        root = getSampleTreeNode2(); //root=-10
        p = root.left.right; //p=-13
        q = root.left.left.left; //q=-25
        VisualizeTree.printTree(root, null, false);
        System.out.println("INPUTS: root node => " + root.val + " p=> " + p.val + " q=> " + q.val + " expected output => -15");

        //todo please call your  solution method here and print the output to the console. expected output for this sample is -15
        System.out.println("PRINT YOUR SOLUTION METHOD'S RETURN VALUE");
        System.out.println("\n***************************************************\n");
        //endregion
    }

    static TreeNode getSampleTreeNode2(){
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(-15);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(-22);
        root.left.right = new TreeNode(-13);
        root.left.left.left = new TreeNode(-25);

        return root;
    }

    static TreeNode getSampleTreeNode1(){
        TreeNode root = new TreeNode(13);
        root.left = new TreeNode(5);
        root.right = new TreeNode(16);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(10);
        root.right.left = new TreeNode(14);
        root.right.right = new TreeNode(28);

        return root;
    }

}

