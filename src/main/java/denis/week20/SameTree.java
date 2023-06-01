package denis.week20;

public class SameTree {

    public static void main(String[] args) {

        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TNode(1);
        tree1.root.left = new TNode(2);
        tree1.root.right = new TNode(3);
        tree1.root.left.left = new TNode(4);
        tree1.root.right.right = new TNode(5);

        BinaryTree tree2 = new BinaryTree();
        tree2.root = new TNode(1);
        tree2.root.left = new TNode(2);
        tree2.root.right = new TNode(3);
        tree2.root.left.left = new TNode(4);
        tree2.root.right.right = new TNode(5);

        System.out.println(treeTraversal(tree1.root, tree2.root));


    }

    static boolean treeTraversal(TNode root1, TNode root2) {

        if (root1 == null && root2 == null)
            return true;
        if (root1 != null && root2 != null)
            return (root1.value == root2.value
                    && treeTraversal(root1.left, root2.left)
                    && treeTraversal(root1.right, root2.right));

        return false;
    }



        }









