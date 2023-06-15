package week_by_week.week21;

import week_by_week.week17.treeReview.MyTree;
import week_by_week.week17.treeReview.Node;
import week_by_week.week17.treeReview.VisualizeTree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RangeSumOfBST {

    public static void main(String[] args) {
        MyTree myTree = new MyTree();

        int[] numbers = {10, 5, 15, 3, 7, 18};

        for (int number : numbers) {
            myTree.insert(number);
        }

        VisualizeTree.printTree(myTree.root, null, false);

        System.out.println(getRangeSumBST(myTree.root, 7, 15));
        System.out.println(iterativeSolution(myTree.root, 7, 15));
        System.out.println(rangeSumBST(myTree.root, 7, 15));

    }

    private static int sum;

    public static int getRangeSumBST(Node root, int low, int high) {
        sum = 0;
        recursiveHelper(root, low, high);
        return sum;
    }

//    public static void recursiveHelper(Node node, int low, int high) {
//        if (node == null) {
//            return;
//        }
//
//        recursiveHelper(node.leftChild, low, high);
//        if (low <= node.value && node.value <= high) {
//            sum += node.value;
//        }
//        recursiveHelper(node.rightChild, low, high);
//
//    }

    public static void recursiveHelper(Node node, int low, int high) {
        if (node == null) {
            return;
        }

        if (low <= node.value && high >= node.value) {
            sum += node.value;
        }

        if (node.value > low) {
            recursiveHelper(node.leftChild, low, high);
        }

        if (node.value < high) {
            recursiveHelper(node.rightChild, low, high);
        }

    }

    public static int iterativeSolution(Node root, int low, int high) {
        int result = 0;

        Stack<Node> stack = new Stack<>();
        stack.push(root);


        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node != null) {
                if (low <= node.value && high >= node.value) {
                    result += node.value;
                }

                if (low < node.value) {
                    stack.push(node.leftChild);
                }

                if (high > node.value) {
                    stack.push(node.rightChild);
                }
            }
        }
        return result;
    }

    public static int rangeSumBST(Node root, int low, int high) {
        int sum = 0;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node.value >= low && node.value <= high) {
                sum += node.value;
            }
            if (node.leftChild != null) {
                stack.push(node.leftChild);
            }

            if (node.rightChild != null) {
                stack.push(node.rightChild);
            }

        }

        return sum;
    }
}
