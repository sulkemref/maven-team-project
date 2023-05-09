package denis.week17;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }

    void insert(int value) {
        TNode newNode = new TNode(value);
        if (root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while (true) {
            if (value <= current.value) {

                if (current.leftChild == null) {
                    // if left is null insert there!!!
                    current.leftChild = newNode;
                    break;
                }
                //if leftChild is not null branch into left subtree!!
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    // if right is null insert there!!!
                    current.rightChild = newNode;
                    break;
                }
                //if rightChild is not null branch into right subtree!!
                current = current.rightChild;
            }
        }
    }

    // PreOrder Traversal of the tree
    // Root-Left-right
    void preOrderTraversal(TNode root) {
        if (root == null) return;// termination
        System.out.print(root.value + ", "); // visit root
        preOrderTraversal(root.leftChild);  // visit left subtree
        preOrderTraversal(root.rightChild); // visit right subtree
    }

    void inOrderTraversal(TNode root) {
        if (root == null) return; // termination
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    void postOrderTraversal(TNode root) {
        if (root == null) return;// termination
        postOrderTraversal(root.leftChild); // branch and finish left subtree
        postOrderTraversal(root.rightChild); // branch and finish right subtree
        System.out.print(root.value + ", ");  // visit root
    }

    void levelOrderTraversal() {
        if (root == null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TNode toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }
    }

    // Task 1- Implement contains(int value)
    public boolean contains(int value) {

        return true;
    }

    // Task-2 Implement isLeaf(TNode node)
    public boolean isLeaf(TNode node) {
        return true;
    }

    // Task-3 Implement printLeaves(TNode node)
    public void printLeaves(TNode root) {


    }

    // Task -4 Implement height(TNode root)
    int height(TNode root) {

        return 0;

    }

    // Task - 5 Implement int countLeaves(Node root) # of leaves
    int countLeaves(TNode root) {
       return 0;
    }

    // Task-  6  Implement int findSumOfLeaves(Node root) sum of values of leaves
    int findSumOfLeaves(TNode root) {
       return 0;
    }

    // Task -7 Calculate node sums
    public int calculateNodeSums(TNode root) {
       return 0;


    }
}
