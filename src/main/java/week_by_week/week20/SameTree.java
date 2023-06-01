package week_by_week.week20;

import week_by_week.week17.treeReview.MyTree;
import week_by_week.week17.treeReview.Node;
import week_by_week.week17.treeReview.VisualizeTree;

import java.util.ArrayDeque;

public class SameTree {
      /*
    100. Same Tree
    Given the roots of two binary trees p and q, write a function to areSame if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:
Input: p = [1,2,1], q = [1,1,2]
Output: false

Constraints:

    The number of nodes in both trees is in the range [0, 100].
    -104 <= Node.val <= 104

https://leetcode.com/problems/same-tree/
     */

    public static void main(String[] args) {

        Integer[] arr1 = {10, 4, 15, 3, 5};
        MyTree myTree1 = new MyTree();

        for (Integer integer : arr1) {
            myTree1.insert(integer);
        }
        VisualizeTree.printTree(myTree1.root,null,false);


        Integer[] arr2 = {10, 4, 15, 3, 5};
        MyTree myTree2 = new MyTree();

        for (Integer integer : arr2) {
            myTree2.insert(integer);
        }
        VisualizeTree.printTree(myTree2.root,null,false);
        System.out.println(withRecursion(null, null));
        System.out.println(withRecursion(myTree1.root, myTree2.root));

        Node node1 = new Node(1);
        node1.leftChild = new Node(2);

        Node node2 = new Node(1);
        node2.rightChild = new Node(2);


        System.out.println(withIteration(node1, node2));

    }

    public static boolean withRecursion(Node p, Node q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.value != q.value) return false;
        return withRecursion(p.rightChild, q.rightChild) &&
                withRecursion(p.leftChild, q.leftChild);
    }

    public static boolean withIteration(Node p, Node q) {
        if (p == null && q == null) return true;
        if (!areSame(p, q)) return false;

        // init deques
        ArrayDeque<Node> deqP = new ArrayDeque<>();
        ArrayDeque<Node> deqQ = new ArrayDeque<>();
        deqP.addLast(p);
        deqQ.addLast(q);

        while (!deqP.isEmpty()) {

            p = deqP.removeFirst();
            q = deqQ.removeFirst();

            if (!areSame(p, q)) return false;
            if (p != null) {
                // null value is not allowed in Deque
                if (!areSame(p.leftChild, q.leftChild)) return false;
                if (p.leftChild != null) {
                    deqP.addLast(p.leftChild);
                    deqQ.addLast(q.leftChild);
                }
                if (!areSame(p.rightChild, q.rightChild)) return false;
                if (p.rightChild != null) {
                    deqP.addLast(p.rightChild);
                    deqQ.addLast(q.rightChild);
                }
            }
        }
        return true;
    }


    private static boolean areSame(Node p, Node q) {
        // p and q are null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.value != q.value) return false;
        return true;
    }


}
