package week_by_week.week17.treeReview;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
//        int[] numbers = new int[]{7, 9, 4, 6, 8, 10, 1, 0, 2, 5, 12, 11, 15};
        int[] numbers = new int[]{7, 9, 4, 6, 8, 10, 1};
        for (int each : numbers) {
            tree.insert(each);
        }
        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("Pre Order Traversal :");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nIn Order Traversal :");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nPost Order Traversal: ");
        tree.postOrderTraversal(tree.root);

        System.out.println("\nLevel Order Traversal: ");
        tree.levelOrderTraversal();

    }
}
