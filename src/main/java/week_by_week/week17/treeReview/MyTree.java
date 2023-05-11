package week_by_week.week17.treeReview;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyTree {
    public Node root;

    public void insert(int value) { // 7  10  4  6
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return;
        }
        Node current = root;
        while (true) {
            if (value <= current.value) {

                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    // Root-Left-Right
    void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    void postOrderTraversal(Node root) {

        if (root == null) {
            return;
        }
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");

    }

    void levelOrderTraversal() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.value + ", ");
            if (node.leftChild != null) {
                queue.add(node.leftChild);
            }
            if (node.rightChild != null) {
                queue.add((node.rightChild));
            }
        }

    }
}
