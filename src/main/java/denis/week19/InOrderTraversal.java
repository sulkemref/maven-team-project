package denis.week19;

public class InOrderTraversal {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new TNode(1);
        tree.root.rightChild = new TNode(2);
        tree.root.rightChild.leftChild = new TNode(3);

        inOrderTraversal(tree.root);
        inOrderTraversal(null);
        inOrderTraversal(tree.root);


    }
    static void inOrderTraversal(TNode root) {
        if (root == null) return; // termination
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

}
